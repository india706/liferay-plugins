/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.wsrp.util;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.Namespace;
import com.liferay.portal.kernel.xml.QName;
import com.liferay.portal.kernel.xml.SAXReaderUtil;

import java.net.URL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oasis.names.tc.wsrp.v2.intf.WSRP_v2_Markup_PortType;
import oasis.names.tc.wsrp.v2.intf.WSRP_v2_ServiceDescription_PortType;
import oasis.names.tc.wsrp.v2.types.GetServiceDescription;
import oasis.names.tc.wsrp.v2.types.LocalizedString;
import oasis.names.tc.wsrp.v2.types.PortletDescription;
import oasis.names.tc.wsrp.v2.types.ServiceDescription;
import oasis.names.tc.wsrp.v2.wsdl.WSRP_v2_ServiceLocator;

/**
 * <a href="WSRPConsumerManager.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class WSRPConsumerManager {

	public static String getLocalizedStringValue(
		LocalizedString localizedString) {

		return getLocalizedStringValue(localizedString, null);
	}

	public static String getLocalizedStringValue(
		LocalizedString localizedString, String defaultValue) {

		if (localizedString == null) {
			return defaultValue;
		}

		return localizedString.getValue();
	}

	public static String[] getLocalizedStringValues(
		LocalizedString[] localizedStrings) {

		return getLocalizedStringValues(localizedStrings, null);
	}

	public static String[] getLocalizedStringValues(
		LocalizedString[] localizedStrings, String[] defaultValue) {

		if (localizedStrings == null) {
			return defaultValue;
		}

		String[] values = new String[localizedStrings.length];

		for (int i = 0; i < localizedStrings.length; i++) {
			values[i] = getLocalizedStringValue(localizedStrings[i]);
		}

		return values;
	}

	public WSRP_v2_Markup_PortType getMarkupService() throws Exception {
		return _serviceLocator.getWSRP_v2_Markup_Service(_markupServiceURL);
	}

	public ServiceDescription getServiceDescription() {
		return _serviceDescription;
	}

	protected WSRPConsumerManager(String wsdl) throws Exception {
		_serviceLocator = new WSRP_v2_ServiceLocator();

		_serviceLocator.setMaintainSession(true);

		Document document = SAXReaderUtil.read(wsdl);

		Element root = document.getRootElement();

		_wsdlNamespace = _getWsdlNamespace(root);

		List<Element> serviceElements = root.elements(_getWsdlQName("service"));

		for (Element serviceElement : serviceElements) {
			_readServiceElement(serviceElement);
		}

		GetServiceDescription getServiceDescription =
			new GetServiceDescription();

		_serviceDescription = _serviceDescriptionService.getServiceDescription(
			getServiceDescription);

		PortletDescription[] portletDescriptions =
			_serviceDescription.getOfferedPortlets();

		for (PortletDescription portletDescription : portletDescriptions) {
			_portletDescriptions.put(
				portletDescription.getPortletHandle(), portletDescription);
		}
	}

	public PortletDescription getPortletDescription(String portletHandle) {
		return _portletDescriptions.get(portletHandle);
	}

	private Namespace _getWsdlNamespace(Element element) {
		return element.getNamespaceForURI(_WSDL_URI);
	}

	private QName _getWsdlQName(String localName) {
		return SAXReaderUtil.createQName(localName, _wsdlNamespace);
	}

	private void _readBindingElement(Element bindingElement) throws Exception {
		String binding = bindingElement.attributeValue("binding");

		int pos = binding.indexOf(StringPool.COLON);

		binding = binding.substring(pos + 1);

		Element addressElement = bindingElement.element("address");

		String bindingLocation = addressElement.attributeValue("location");

		URL bindingLocationURL = new URL(bindingLocation);

		if (binding.equals(_WSRP_V2_MARKUP_BINDING)) {
			_markupServiceURL = bindingLocationURL;
		}
		else if (binding.equals(_WSRP_V2_PORTLET_MANAGEMENT_BINDING)) {
			_portletManagementServiceURL = bindingLocationURL;
		}
		else if (binding.equals(_WSRP_V2_REGISTRATION_BINDING)) {
			_registrationServiceURL = bindingLocationURL;
		}
		else if (binding.equals(_WSRP_V2_SERVICE_DESCRIPTION_BINDING)) {
			_serviceDescriptionService =
				_serviceLocator.getWSRP_v2_ServiceDescription_Service(
					bindingLocationURL);
		}
	}

	private void _readServiceElement(Element element) throws Exception {
		List<Element> bindingElements = element.elements(_getWsdlQName("port"));

		for (Element bindingElement : bindingElements) {
			_readBindingElement(bindingElement);
		}
	}

	private static final String _WSDL_URI = "http://schemas.xmlsoap.org/wsdl/";

	private static final String _WSRP_V2_MARKUP_BINDING =
		"WSRP_v2_Markup_Binding_SOAP";

	private static final String _WSRP_V2_PORTLET_MANAGEMENT_BINDING =
		"WSRP_v2_PortletManagement_Binding_SOAP";

	private static final String _WSRP_V2_REGISTRATION_BINDING =
		"WSRP_v2_Registration_Binding_SOAP";

	private static final String _WSRP_V2_SERVICE_DESCRIPTION_BINDING =
		"WSRP_v2_ServiceDescription_Binding_SOAP";

	private URL _markupServiceURL;
	private Map<String, PortletDescription> _portletDescriptions =
		new HashMap<String, PortletDescription>();
	private URL _portletManagementServiceURL;
	private URL _registrationServiceURL;
	private ServiceDescription _serviceDescription;
	private WSRP_v2_ServiceDescription_PortType _serviceDescriptionService;
	private WSRP_v2_ServiceLocator _serviceLocator;
	private Namespace _wsdlNamespace;

}