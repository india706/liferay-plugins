/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

/**
 * <p>
 * This class is a wrapper for {@link KaleoTransition}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoTransition
 * @generated
 */
public class KaleoTransitionWrapper implements KaleoTransition {
	public KaleoTransitionWrapper(KaleoTransition kaleoTransition) {
		_kaleoTransition = kaleoTransition;
	}

	/**
	* Gets the primary key of this kaleo transition.
	*
	* @return the primary key of this kaleo transition
	*/
	public long getPrimaryKey() {
		return _kaleoTransition.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kaleo transition
	*
	* @param pk the primary key of this kaleo transition
	*/
	public void setPrimaryKey(long pk) {
		_kaleoTransition.setPrimaryKey(pk);
	}

	/**
	* Gets the kaleo transition id of this kaleo transition.
	*
	* @return the kaleo transition id of this kaleo transition
	*/
	public long getKaleoTransitionId() {
		return _kaleoTransition.getKaleoTransitionId();
	}

	/**
	* Sets the kaleo transition id of this kaleo transition.
	*
	* @param kaleoTransitionId the kaleo transition id of this kaleo transition
	*/
	public void setKaleoTransitionId(long kaleoTransitionId) {
		_kaleoTransition.setKaleoTransitionId(kaleoTransitionId);
	}

	/**
	* Gets the group id of this kaleo transition.
	*
	* @return the group id of this kaleo transition
	*/
	public long getGroupId() {
		return _kaleoTransition.getGroupId();
	}

	/**
	* Sets the group id of this kaleo transition.
	*
	* @param groupId the group id of this kaleo transition
	*/
	public void setGroupId(long groupId) {
		_kaleoTransition.setGroupId(groupId);
	}

	/**
	* Gets the company id of this kaleo transition.
	*
	* @return the company id of this kaleo transition
	*/
	public long getCompanyId() {
		return _kaleoTransition.getCompanyId();
	}

	/**
	* Sets the company id of this kaleo transition.
	*
	* @param companyId the company id of this kaleo transition
	*/
	public void setCompanyId(long companyId) {
		_kaleoTransition.setCompanyId(companyId);
	}

	/**
	* Gets the user id of this kaleo transition.
	*
	* @return the user id of this kaleo transition
	*/
	public long getUserId() {
		return _kaleoTransition.getUserId();
	}

	/**
	* Sets the user id of this kaleo transition.
	*
	* @param userId the user id of this kaleo transition
	*/
	public void setUserId(long userId) {
		_kaleoTransition.setUserId(userId);
	}

	/**
	* Gets the user uuid of this kaleo transition.
	*
	* @return the user uuid of this kaleo transition
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransition.getUserUuid();
	}

	/**
	* Sets the user uuid of this kaleo transition.
	*
	* @param userUuid the user uuid of this kaleo transition
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_kaleoTransition.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this kaleo transition.
	*
	* @return the user name of this kaleo transition
	*/
	public java.lang.String getUserName() {
		return _kaleoTransition.getUserName();
	}

	/**
	* Sets the user name of this kaleo transition.
	*
	* @param userName the user name of this kaleo transition
	*/
	public void setUserName(java.lang.String userName) {
		_kaleoTransition.setUserName(userName);
	}

	/**
	* Gets the create date of this kaleo transition.
	*
	* @return the create date of this kaleo transition
	*/
	public java.util.Date getCreateDate() {
		return _kaleoTransition.getCreateDate();
	}

	/**
	* Sets the create date of this kaleo transition.
	*
	* @param createDate the create date of this kaleo transition
	*/
	public void setCreateDate(java.util.Date createDate) {
		_kaleoTransition.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this kaleo transition.
	*
	* @return the modified date of this kaleo transition
	*/
	public java.util.Date getModifiedDate() {
		return _kaleoTransition.getModifiedDate();
	}

	/**
	* Sets the modified date of this kaleo transition.
	*
	* @param modifiedDate the modified date of this kaleo transition
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoTransition.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the kaleo definition id of this kaleo transition.
	*
	* @return the kaleo definition id of this kaleo transition
	*/
	public long getKaleoDefinitionId() {
		return _kaleoTransition.getKaleoDefinitionId();
	}

	/**
	* Sets the kaleo definition id of this kaleo transition.
	*
	* @param kaleoDefinitionId the kaleo definition id of this kaleo transition
	*/
	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoTransition.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Gets the kaleo node id of this kaleo transition.
	*
	* @return the kaleo node id of this kaleo transition
	*/
	public long getKaleoNodeId() {
		return _kaleoTransition.getKaleoNodeId();
	}

	/**
	* Sets the kaleo node id of this kaleo transition.
	*
	* @param kaleoNodeId the kaleo node id of this kaleo transition
	*/
	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoTransition.setKaleoNodeId(kaleoNodeId);
	}

	/**
	* Gets the name of this kaleo transition.
	*
	* @return the name of this kaleo transition
	*/
	public java.lang.String getName() {
		return _kaleoTransition.getName();
	}

	/**
	* Sets the name of this kaleo transition.
	*
	* @param name the name of this kaleo transition
	*/
	public void setName(java.lang.String name) {
		_kaleoTransition.setName(name);
	}

	/**
	* Gets the description of this kaleo transition.
	*
	* @return the description of this kaleo transition
	*/
	public java.lang.String getDescription() {
		return _kaleoTransition.getDescription();
	}

	/**
	* Sets the description of this kaleo transition.
	*
	* @param description the description of this kaleo transition
	*/
	public void setDescription(java.lang.String description) {
		_kaleoTransition.setDescription(description);
	}

	/**
	* Gets the source kaleo node id of this kaleo transition.
	*
	* @return the source kaleo node id of this kaleo transition
	*/
	public long getSourceKaleoNodeId() {
		return _kaleoTransition.getSourceKaleoNodeId();
	}

	/**
	* Sets the source kaleo node id of this kaleo transition.
	*
	* @param sourceKaleoNodeId the source kaleo node id of this kaleo transition
	*/
	public void setSourceKaleoNodeId(long sourceKaleoNodeId) {
		_kaleoTransition.setSourceKaleoNodeId(sourceKaleoNodeId);
	}

	/**
	* Gets the source kaleo node name of this kaleo transition.
	*
	* @return the source kaleo node name of this kaleo transition
	*/
	public java.lang.String getSourceKaleoNodeName() {
		return _kaleoTransition.getSourceKaleoNodeName();
	}

	/**
	* Sets the source kaleo node name of this kaleo transition.
	*
	* @param sourceKaleoNodeName the source kaleo node name of this kaleo transition
	*/
	public void setSourceKaleoNodeName(java.lang.String sourceKaleoNodeName) {
		_kaleoTransition.setSourceKaleoNodeName(sourceKaleoNodeName);
	}

	/**
	* Gets the target kaleo node id of this kaleo transition.
	*
	* @return the target kaleo node id of this kaleo transition
	*/
	public long getTargetKaleoNodeId() {
		return _kaleoTransition.getTargetKaleoNodeId();
	}

	/**
	* Sets the target kaleo node id of this kaleo transition.
	*
	* @param targetKaleoNodeId the target kaleo node id of this kaleo transition
	*/
	public void setTargetKaleoNodeId(long targetKaleoNodeId) {
		_kaleoTransition.setTargetKaleoNodeId(targetKaleoNodeId);
	}

	/**
	* Gets the target kaleo node name of this kaleo transition.
	*
	* @return the target kaleo node name of this kaleo transition
	*/
	public java.lang.String getTargetKaleoNodeName() {
		return _kaleoTransition.getTargetKaleoNodeName();
	}

	/**
	* Sets the target kaleo node name of this kaleo transition.
	*
	* @param targetKaleoNodeName the target kaleo node name of this kaleo transition
	*/
	public void setTargetKaleoNodeName(java.lang.String targetKaleoNodeName) {
		_kaleoTransition.setTargetKaleoNodeName(targetKaleoNodeName);
	}

	/**
	* Gets the default transition of this kaleo transition.
	*
	* @return the default transition of this kaleo transition
	*/
	public boolean getDefaultTransition() {
		return _kaleoTransition.getDefaultTransition();
	}

	/**
	* Determines if this kaleo transition is default transition.
	*
	* @return <code>true</code> if this kaleo transition is default transition; <code>false</code> otherwise
	*/
	public boolean isDefaultTransition() {
		return _kaleoTransition.isDefaultTransition();
	}

	/**
	* Sets whether this {$entity.humanName} is default transition.
	*
	* @param defaultTransition the default transition of this kaleo transition
	*/
	public void setDefaultTransition(boolean defaultTransition) {
		_kaleoTransition.setDefaultTransition(defaultTransition);
	}

	public boolean isNew() {
		return _kaleoTransition.isNew();
	}

	public void setNew(boolean n) {
		_kaleoTransition.setNew(n);
	}

	public boolean isCachedModel() {
		return _kaleoTransition.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_kaleoTransition.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _kaleoTransition.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_kaleoTransition.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoTransition.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoTransition.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoTransition.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _kaleoTransition.clone();
	}

	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition) {
		return _kaleoTransition.compareTo(kaleoTransition);
	}

	public int hashCode() {
		return _kaleoTransition.hashCode();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition toEscapedModel() {
		return _kaleoTransition.toEscapedModel();
	}

	public java.lang.String toString() {
		return _kaleoTransition.toString();
	}

	public java.lang.String toXmlString() {
		return _kaleoTransition.toXmlString();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoNode getSourceKaleoNode()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransition.getSourceKaleoNode();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoNode getTargetKaleoNode()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _kaleoTransition.getTargetKaleoNode();
	}

	public KaleoTransition getWrappedKaleoTransition() {
		return _kaleoTransition;
	}

	private KaleoTransition _kaleoTransition;
}