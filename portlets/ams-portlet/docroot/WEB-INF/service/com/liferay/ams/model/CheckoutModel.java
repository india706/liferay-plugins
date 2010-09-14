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

package com.liferay.ams.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Checkout service. Represents a row in the &quot;AMS_Checkout&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.ams.model.impl.CheckoutModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.ams.model.impl.CheckoutImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a checkout model instance should use the {@link Checkout} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Checkout
 * @see com.liferay.ams.model.impl.CheckoutImpl
 * @see com.liferay.ams.model.impl.CheckoutModelImpl
 * @generated
 */
public interface CheckoutModel extends BaseModel<Checkout> {
	/**
	 * Gets the primary key of this checkout.
	 *
	 * @return the primary key of this checkout
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this checkout
	 *
	 * @param pk the primary key of this checkout
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the checkout id of this checkout.
	 *
	 * @return the checkout id of this checkout
	 */
	public long getCheckoutId();

	/**
	 * Sets the checkout id of this checkout.
	 *
	 * @param checkoutId the checkout id of this checkout
	 */
	public void setCheckoutId(long checkoutId);

	/**
	 * Gets the company id of this checkout.
	 *
	 * @return the company id of this checkout
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this checkout.
	 *
	 * @param companyId the company id of this checkout
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this checkout.
	 *
	 * @return the user id of this checkout
	 */
	public long getUserId();

	/**
	 * Sets the user id of this checkout.
	 *
	 * @param userId the user id of this checkout
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this checkout.
	 *
	 * @return the user uuid of this checkout
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this checkout.
	 *
	 * @param userUuid the user uuid of this checkout
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this checkout.
	 *
	 * @return the user name of this checkout
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this checkout.
	 *
	 * @param userName the user name of this checkout
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this checkout.
	 *
	 * @return the create date of this checkout
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this checkout.
	 *
	 * @param createDate the create date of this checkout
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this checkout.
	 *
	 * @return the modified date of this checkout
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this checkout.
	 *
	 * @param modifiedDate the modified date of this checkout
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the asset id of this checkout.
	 *
	 * @return the asset id of this checkout
	 */
	public long getAssetId();

	/**
	 * Sets the asset id of this checkout.
	 *
	 * @param assetId the asset id of this checkout
	 */
	public void setAssetId(long assetId);

	/**
	 * Gets the check out date of this checkout.
	 *
	 * @return the check out date of this checkout
	 */
	public Date getCheckOutDate();

	/**
	 * Sets the check out date of this checkout.
	 *
	 * @param checkOutDate the check out date of this checkout
	 */
	public void setCheckOutDate(Date checkOutDate);

	/**
	 * Gets the expected check in date of this checkout.
	 *
	 * @return the expected check in date of this checkout
	 */
	public Date getExpectedCheckInDate();

	/**
	 * Sets the expected check in date of this checkout.
	 *
	 * @param expectedCheckInDate the expected check in date of this checkout
	 */
	public void setExpectedCheckInDate(Date expectedCheckInDate);

	/**
	 * Gets the actual check in date of this checkout.
	 *
	 * @return the actual check in date of this checkout
	 */
	public Date getActualCheckInDate();

	/**
	 * Sets the actual check in date of this checkout.
	 *
	 * @param actualCheckInDate the actual check in date of this checkout
	 */
	public void setActualCheckInDate(Date actualCheckInDate);

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

	public int compareTo(Checkout checkout);

	public int hashCode();

	public Checkout toEscapedModel();

	public String toString();

	public String toXmlString();
}