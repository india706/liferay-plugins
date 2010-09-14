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

package com.liferay.chat.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Status service. Represents a row in the &quot;Chat_Status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.chat.model.impl.StatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.chat.model.impl.StatusImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a status model instance should use the {@link Status} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Status
 * @see com.liferay.chat.model.impl.StatusImpl
 * @see com.liferay.chat.model.impl.StatusModelImpl
 * @generated
 */
public interface StatusModel extends BaseModel<Status> {
	/**
	 * Gets the primary key of this status.
	 *
	 * @return the primary key of this status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this status
	 *
	 * @param pk the primary key of this status
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the status id of this status.
	 *
	 * @return the status id of this status
	 */
	public long getStatusId();

	/**
	 * Sets the status id of this status.
	 *
	 * @param statusId the status id of this status
	 */
	public void setStatusId(long statusId);

	/**
	 * Gets the user id of this status.
	 *
	 * @return the user id of this status
	 */
	public long getUserId();

	/**
	 * Sets the user id of this status.
	 *
	 * @param userId the user id of this status
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this status.
	 *
	 * @return the user uuid of this status
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this status.
	 *
	 * @param userUuid the user uuid of this status
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the modified date of this status.
	 *
	 * @return the modified date of this status
	 */
	public long getModifiedDate();

	/**
	 * Sets the modified date of this status.
	 *
	 * @param modifiedDate the modified date of this status
	 */
	public void setModifiedDate(long modifiedDate);

	/**
	 * Gets the online of this status.
	 *
	 * @return the online of this status
	 */
	public boolean getOnline();

	/**
	 * Determines if this status is online.
	 *
	 * @return <code>true</code> if this status is online; <code>false</code> otherwise
	 */
	public boolean isOnline();

	/**
	 * Sets whether this {$entity.humanName} is online.
	 *
	 * @param online the online of this status
	 */
	public void setOnline(boolean online);

	/**
	 * Gets the awake of this status.
	 *
	 * @return the awake of this status
	 */
	public boolean getAwake();

	/**
	 * Determines if this status is awake.
	 *
	 * @return <code>true</code> if this status is awake; <code>false</code> otherwise
	 */
	public boolean isAwake();

	/**
	 * Sets whether this {$entity.humanName} is awake.
	 *
	 * @param awake the awake of this status
	 */
	public void setAwake(boolean awake);

	/**
	 * Gets the active panel id of this status.
	 *
	 * @return the active panel id of this status
	 */
	@AutoEscape
	public String getActivePanelId();

	/**
	 * Sets the active panel id of this status.
	 *
	 * @param activePanelId the active panel id of this status
	 */
	public void setActivePanelId(String activePanelId);

	/**
	 * Gets the message of this status.
	 *
	 * @return the message of this status
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this status.
	 *
	 * @param message the message of this status
	 */
	public void setMessage(String message);

	/**
	 * Gets the play sound of this status.
	 *
	 * @return the play sound of this status
	 */
	public boolean getPlaySound();

	/**
	 * Determines if this status is play sound.
	 *
	 * @return <code>true</code> if this status is play sound; <code>false</code> otherwise
	 */
	public boolean isPlaySound();

	/**
	 * Sets whether this {$entity.humanName} is play sound.
	 *
	 * @param playSound the play sound of this status
	 */
	public void setPlaySound(boolean playSound);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Status status);

	public int hashCode();

	public Status toEscapedModel();

	public String toString();

	public String toXmlString();
}