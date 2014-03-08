/**
 * Copyright (C) 2014 Thiago Moreira (tmoreira2020@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.thiagomoreira.portal.events;

import java.util.List;

import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionChecker;

import javax.portlet.PortletRequest;

/**
 * @author Thiago Leão Moreira
 */
public class OminAdminPermissionChecker implements PermissionChecker {

	public PermissionChecker clone() {
		throw new UnsupportedOperationException("Not implemented!");
	}
	
	public long getCompanyId() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public List<Long> getGuestResourceBlockIds(long companyId, long groupId,
			String name, String actionId) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public List<Long> getOwnerResourceBlockIds(long companyId, long groupId,
			String name, String actionId) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public long getOwnerRoleId() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public List<Long> getResourceBlockIds(long companyId, long groupId,
			long userId, String name, String actionId) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public long[] getRoleIds(long arg0, long arg1) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public User getUser() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public long getUserId() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean hasOwnerPermission(long arg0, String arg1, long arg2,
			long arg3, String arg4) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean hasOwnerPermission(long arg0, String arg1, String arg2,
			long arg3, String arg4) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean hasPermission(long arg0, String arg1, long arg2, String arg3) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean hasPermission(long arg0, String arg1, String arg2,
			String arg3) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean hasUserPermission(long arg0, String arg1, String arg2,
			String arg3, boolean arg4) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public void init(User user) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public void init(User arg0, boolean arg1) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isCheckGuest() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isCommunityAdmin(long arg0) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isCommunityOwner(long arg0) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isCompanyAdmin() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isCompanyAdmin(long arg0) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isGroupAdmin(long groupId) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isGroupMember(long groupId) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isGroupOwner(long groupId) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isOmniadmin() {
		return true;
	}

	public boolean isOrganizationAdmin(long organizationId) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isOrganizationOwner(long arg0) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public boolean isSignedIn() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public void resetValues() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public void setCheckGuest(boolean arg0) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	public void setValues(PortletRequest arg0) {
		throw new UnsupportedOperationException("Not implemented!");
	}

}