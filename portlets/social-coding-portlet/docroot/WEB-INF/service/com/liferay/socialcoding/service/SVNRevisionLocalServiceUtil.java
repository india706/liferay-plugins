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

package com.liferay.socialcoding.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the s v n revision local service. This utility wraps {@link com.liferay.socialcoding.service.impl.SVNRevisionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.liferay.socialcoding.service.impl.SVNRevisionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SVNRevisionLocalService
 * @see com.liferay.socialcoding.service.base.SVNRevisionLocalServiceBaseImpl
 * @see com.liferay.socialcoding.service.impl.SVNRevisionLocalServiceImpl
 * @generated
 */
public class SVNRevisionLocalServiceUtil {
	/**
	* Adds the s v n revision to the database. Also notifies the appropriate model listeners.
	*
	* @param svnRevision the s v n revision to add
	* @return the s v n revision that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.socialcoding.model.SVNRevision addSVNRevision(
		com.liferay.socialcoding.model.SVNRevision svnRevision)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSVNRevision(svnRevision);
	}

	/**
	* Creates a new s v n revision with the primary key. Does not add the s v n revision to the database.
	*
	* @param svnRevisionId the primary key for the new s v n revision
	* @return the new s v n revision
	*/
	public static com.liferay.socialcoding.model.SVNRevision createSVNRevision(
		long svnRevisionId) {
		return getService().createSVNRevision(svnRevisionId);
	}

	/**
	* Deletes the s v n revision with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param svnRevisionId the primary key of the s v n revision to delete
	* @throws PortalException if a s v n revision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSVNRevision(long svnRevisionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSVNRevision(svnRevisionId);
	}

	/**
	* Deletes the s v n revision from the database. Also notifies the appropriate model listeners.
	*
	* @param svnRevision the s v n revision to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteSVNRevision(
		com.liferay.socialcoding.model.SVNRevision svnRevision)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteSVNRevision(svnRevision);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the s v n revision with the primary key.
	*
	* @param svnRevisionId the primary key of the s v n revision to get
	* @return the s v n revision
	* @throws PortalException if a s v n revision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.socialcoding.model.SVNRevision getSVNRevision(
		long svnRevisionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevision(svnRevisionId);
	}

	/**
	* Gets a range of all the s v n revisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s v n revisions to return
	* @param end the upper bound of the range of s v n revisions to return (not inclusive)
	* @return the range of s v n revisions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.socialcoding.model.SVNRevision> getSVNRevisions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevisions(start, end);
	}

	/**
	* Gets the number of s v n revisions.
	*
	* @return the number of s v n revisions
	* @throws SystemException if a system exception occurred
	*/
	public static int getSVNRevisionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevisionsCount();
	}

	/**
	* Updates the s v n revision in the database. Also notifies the appropriate model listeners.
	*
	* @param svnRevision the s v n revision to update
	* @return the s v n revision that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.socialcoding.model.SVNRevision updateSVNRevision(
		com.liferay.socialcoding.model.SVNRevision svnRevision)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSVNRevision(svnRevision);
	}

	/**
	* Updates the s v n revision in the database. Also notifies the appropriate model listeners.
	*
	* @param svnRevision the s v n revision to update
	* @param merge whether to merge the s v n revision with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s v n revision that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.socialcoding.model.SVNRevision updateSVNRevision(
		com.liferay.socialcoding.model.SVNRevision svnRevision, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSVNRevision(svnRevision, merge);
	}

	public static com.liferay.socialcoding.model.SVNRevision addSVNRevision(
		java.lang.String svnUserId, java.util.Date createDate,
		long svnRepositoryId, long revisionNumber, java.lang.String comments)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addSVNRevision(svnUserId, createDate, svnRepositoryId,
			revisionNumber, comments);
	}

	public static com.liferay.socialcoding.model.SVNRevision getFirstSVNRevision(
		java.lang.String svnUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFirstSVNRevision(svnUserId);
	}

	public static com.liferay.socialcoding.model.SVNRevision getLastSVNRevision(
		java.lang.String svnUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLastSVNRevision(svnUserId);
	}

	public static java.util.List<com.liferay.socialcoding.model.SVNRevision> getSVNRevisions(
		java.lang.String svnUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevisions(svnUserId, start, end);
	}

	public static java.util.List<com.liferay.socialcoding.model.SVNRevision> getSVNRevisions(
		long svnRepositoryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevisions(svnRepositoryId, start, end);
	}

	public static java.util.List<com.liferay.socialcoding.model.SVNRevision> getSVNRevisions(
		java.lang.String svnUserId, long svnRepositoryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSVNRevisions(svnUserId, svnRepositoryId, start, end);
	}

	public static int getSVNRevisionsCount(java.lang.String svnUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevisionsCount(svnUserId);
	}

	public static int getSVNRevisionsCount(long svnRepositoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevisionsCount(svnRepositoryId);
	}

	public static int getSVNRevisionsCount(java.lang.String svnUserId,
		long svnRepositoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSVNRevisionsCount(svnUserId, svnRepositoryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SVNRevisionLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					SVNRevisionLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					portletClassLoader);

			_service = new SVNRevisionLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(SVNRevisionLocalService service) {
		_service = service;
	}

	private static SVNRevisionLocalService _service;
}