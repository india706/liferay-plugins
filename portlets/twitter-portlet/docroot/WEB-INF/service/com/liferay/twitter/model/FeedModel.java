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

package com.liferay.twitter.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Feed service. Represents a row in the &quot;Twitter_Feed&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.twitter.model.impl.FeedModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.twitter.model.impl.FeedImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a feed model instance should use the {@link Feed} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Feed
 * @see com.liferay.twitter.model.impl.FeedImpl
 * @see com.liferay.twitter.model.impl.FeedModelImpl
 * @generated
 */
public interface FeedModel extends BaseModel<Feed> {
	/**
	 * Gets the primary key of this feed.
	 *
	 * @return the primary key of this feed
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this feed
	 *
	 * @param pk the primary key of this feed
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the feed id of this feed.
	 *
	 * @return the feed id of this feed
	 */
	public long getFeedId();

	/**
	 * Sets the feed id of this feed.
	 *
	 * @param feedId the feed id of this feed
	 */
	public void setFeedId(long feedId);

	/**
	 * Gets the twitter user id of this feed.
	 *
	 * @return the twitter user id of this feed
	 */
	public long getTwitterUserId();

	/**
	 * Sets the twitter user id of this feed.
	 *
	 * @param twitterUserId the twitter user id of this feed
	 */
	public void setTwitterUserId(long twitterUserId);

	/**
	 * Gets the twitter user uuid of this feed.
	 *
	 * @return the twitter user uuid of this feed
	 * @throws SystemException if a system exception occurred
	 */
	public String getTwitterUserUuid() throws SystemException;

	/**
	 * Sets the twitter user uuid of this feed.
	 *
	 * @param twitterUserUuid the twitter user uuid of this feed
	 */
	public void setTwitterUserUuid(String twitterUserUuid);

	/**
	 * Gets the twitter screen name of this feed.
	 *
	 * @return the twitter screen name of this feed
	 */
	@AutoEscape
	public String getTwitterScreenName();

	/**
	 * Sets the twitter screen name of this feed.
	 *
	 * @param twitterScreenName the twitter screen name of this feed
	 */
	public void setTwitterScreenName(String twitterScreenName);

	/**
	 * Gets the create date of this feed.
	 *
	 * @return the create date of this feed
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this feed.
	 *
	 * @param createDate the create date of this feed
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this feed.
	 *
	 * @return the modified date of this feed
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this feed.
	 *
	 * @param modifiedDate the modified date of this feed
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the last status id of this feed.
	 *
	 * @return the last status id of this feed
	 */
	public long getLastStatusId();

	/**
	 * Sets the last status id of this feed.
	 *
	 * @param lastStatusId the last status id of this feed
	 */
	public void setLastStatusId(long lastStatusId);

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

	public int compareTo(Feed feed);

	public int hashCode();

	public Feed toEscapedModel();

	public String toString();

	public String toXmlString();
}