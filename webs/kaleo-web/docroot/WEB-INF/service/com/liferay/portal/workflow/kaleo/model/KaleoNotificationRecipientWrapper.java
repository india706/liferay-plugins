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
 * This class is a wrapper for {@link KaleoNotificationRecipient}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoNotificationRecipient
 * @generated
 */
public class KaleoNotificationRecipientWrapper
	implements KaleoNotificationRecipient {
	public KaleoNotificationRecipientWrapper(
		KaleoNotificationRecipient kaleoNotificationRecipient) {
		_kaleoNotificationRecipient = kaleoNotificationRecipient;
	}

	/**
	* Gets the primary key of this kaleo notification recipient.
	*
	* @return the primary key of this kaleo notification recipient
	*/
	public long getPrimaryKey() {
		return _kaleoNotificationRecipient.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kaleo notification recipient
	*
	* @param pk the primary key of this kaleo notification recipient
	*/
	public void setPrimaryKey(long pk) {
		_kaleoNotificationRecipient.setPrimaryKey(pk);
	}

	/**
	* Gets the kaleo notification recipient id of this kaleo notification recipient.
	*
	* @return the kaleo notification recipient id of this kaleo notification recipient
	*/
	public long getKaleoNotificationRecipientId() {
		return _kaleoNotificationRecipient.getKaleoNotificationRecipientId();
	}

	/**
	* Sets the kaleo notification recipient id of this kaleo notification recipient.
	*
	* @param kaleoNotificationRecipientId the kaleo notification recipient id of this kaleo notification recipient
	*/
	public void setKaleoNotificationRecipientId(
		long kaleoNotificationRecipientId) {
		_kaleoNotificationRecipient.setKaleoNotificationRecipientId(kaleoNotificationRecipientId);
	}

	/**
	* Gets the group id of this kaleo notification recipient.
	*
	* @return the group id of this kaleo notification recipient
	*/
	public long getGroupId() {
		return _kaleoNotificationRecipient.getGroupId();
	}

	/**
	* Sets the group id of this kaleo notification recipient.
	*
	* @param groupId the group id of this kaleo notification recipient
	*/
	public void setGroupId(long groupId) {
		_kaleoNotificationRecipient.setGroupId(groupId);
	}

	/**
	* Gets the company id of this kaleo notification recipient.
	*
	* @return the company id of this kaleo notification recipient
	*/
	public long getCompanyId() {
		return _kaleoNotificationRecipient.getCompanyId();
	}

	/**
	* Sets the company id of this kaleo notification recipient.
	*
	* @param companyId the company id of this kaleo notification recipient
	*/
	public void setCompanyId(long companyId) {
		_kaleoNotificationRecipient.setCompanyId(companyId);
	}

	/**
	* Gets the user id of this kaleo notification recipient.
	*
	* @return the user id of this kaleo notification recipient
	*/
	public long getUserId() {
		return _kaleoNotificationRecipient.getUserId();
	}

	/**
	* Sets the user id of this kaleo notification recipient.
	*
	* @param userId the user id of this kaleo notification recipient
	*/
	public void setUserId(long userId) {
		_kaleoNotificationRecipient.setUserId(userId);
	}

	/**
	* Gets the user uuid of this kaleo notification recipient.
	*
	* @return the user uuid of this kaleo notification recipient
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoNotificationRecipient.getUserUuid();
	}

	/**
	* Sets the user uuid of this kaleo notification recipient.
	*
	* @param userUuid the user uuid of this kaleo notification recipient
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_kaleoNotificationRecipient.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this kaleo notification recipient.
	*
	* @return the user name of this kaleo notification recipient
	*/
	public java.lang.String getUserName() {
		return _kaleoNotificationRecipient.getUserName();
	}

	/**
	* Sets the user name of this kaleo notification recipient.
	*
	* @param userName the user name of this kaleo notification recipient
	*/
	public void setUserName(java.lang.String userName) {
		_kaleoNotificationRecipient.setUserName(userName);
	}

	/**
	* Gets the create date of this kaleo notification recipient.
	*
	* @return the create date of this kaleo notification recipient
	*/
	public java.util.Date getCreateDate() {
		return _kaleoNotificationRecipient.getCreateDate();
	}

	/**
	* Sets the create date of this kaleo notification recipient.
	*
	* @param createDate the create date of this kaleo notification recipient
	*/
	public void setCreateDate(java.util.Date createDate) {
		_kaleoNotificationRecipient.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this kaleo notification recipient.
	*
	* @return the modified date of this kaleo notification recipient
	*/
	public java.util.Date getModifiedDate() {
		return _kaleoNotificationRecipient.getModifiedDate();
	}

	/**
	* Sets the modified date of this kaleo notification recipient.
	*
	* @param modifiedDate the modified date of this kaleo notification recipient
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoNotificationRecipient.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the kaleo definition id of this kaleo notification recipient.
	*
	* @return the kaleo definition id of this kaleo notification recipient
	*/
	public long getKaleoDefinitionId() {
		return _kaleoNotificationRecipient.getKaleoDefinitionId();
	}

	/**
	* Sets the kaleo definition id of this kaleo notification recipient.
	*
	* @param kaleoDefinitionId the kaleo definition id of this kaleo notification recipient
	*/
	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoNotificationRecipient.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Gets the kaleo notification id of this kaleo notification recipient.
	*
	* @return the kaleo notification id of this kaleo notification recipient
	*/
	public long getKaleoNotificationId() {
		return _kaleoNotificationRecipient.getKaleoNotificationId();
	}

	/**
	* Sets the kaleo notification id of this kaleo notification recipient.
	*
	* @param kaleoNotificationId the kaleo notification id of this kaleo notification recipient
	*/
	public void setKaleoNotificationId(long kaleoNotificationId) {
		_kaleoNotificationRecipient.setKaleoNotificationId(kaleoNotificationId);
	}

	/**
	* Gets the recipient class name of this kaleo notification recipient.
	*
	* @return the recipient class name of this kaleo notification recipient
	*/
	public java.lang.String getRecipientClassName() {
		return _kaleoNotificationRecipient.getRecipientClassName();
	}

	/**
	* Sets the recipient class name of this kaleo notification recipient.
	*
	* @param recipientClassName the recipient class name of this kaleo notification recipient
	*/
	public void setRecipientClassName(java.lang.String recipientClassName) {
		_kaleoNotificationRecipient.setRecipientClassName(recipientClassName);
	}

	/**
	* Gets the recipient class p k of this kaleo notification recipient.
	*
	* @return the recipient class p k of this kaleo notification recipient
	*/
	public long getRecipientClassPK() {
		return _kaleoNotificationRecipient.getRecipientClassPK();
	}

	/**
	* Sets the recipient class p k of this kaleo notification recipient.
	*
	* @param recipientClassPK the recipient class p k of this kaleo notification recipient
	*/
	public void setRecipientClassPK(long recipientClassPK) {
		_kaleoNotificationRecipient.setRecipientClassPK(recipientClassPK);
	}

	/**
	* Gets the recipient role type of this kaleo notification recipient.
	*
	* @return the recipient role type of this kaleo notification recipient
	*/
	public int getRecipientRoleType() {
		return _kaleoNotificationRecipient.getRecipientRoleType();
	}

	/**
	* Sets the recipient role type of this kaleo notification recipient.
	*
	* @param recipientRoleType the recipient role type of this kaleo notification recipient
	*/
	public void setRecipientRoleType(int recipientRoleType) {
		_kaleoNotificationRecipient.setRecipientRoleType(recipientRoleType);
	}

	/**
	* Gets the address of this kaleo notification recipient.
	*
	* @return the address of this kaleo notification recipient
	*/
	public java.lang.String getAddress() {
		return _kaleoNotificationRecipient.getAddress();
	}

	/**
	* Sets the address of this kaleo notification recipient.
	*
	* @param address the address of this kaleo notification recipient
	*/
	public void setAddress(java.lang.String address) {
		_kaleoNotificationRecipient.setAddress(address);
	}

	public boolean isNew() {
		return _kaleoNotificationRecipient.isNew();
	}

	public void setNew(boolean n) {
		_kaleoNotificationRecipient.setNew(n);
	}

	public boolean isCachedModel() {
		return _kaleoNotificationRecipient.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_kaleoNotificationRecipient.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _kaleoNotificationRecipient.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_kaleoNotificationRecipient.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoNotificationRecipient.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoNotificationRecipient.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoNotificationRecipient.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _kaleoNotificationRecipient.clone();
	}

	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient kaleoNotificationRecipient) {
		return _kaleoNotificationRecipient.compareTo(kaleoNotificationRecipient);
	}

	public int hashCode() {
		return _kaleoNotificationRecipient.hashCode();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient toEscapedModel() {
		return _kaleoNotificationRecipient.toEscapedModel();
	}

	public java.lang.String toString() {
		return _kaleoNotificationRecipient.toString();
	}

	public java.lang.String toXmlString() {
		return _kaleoNotificationRecipient.toXmlString();
	}

	public KaleoNotificationRecipient getWrappedKaleoNotificationRecipient() {
		return _kaleoNotificationRecipient;
	}

	private KaleoNotificationRecipient _kaleoNotificationRecipient;
}