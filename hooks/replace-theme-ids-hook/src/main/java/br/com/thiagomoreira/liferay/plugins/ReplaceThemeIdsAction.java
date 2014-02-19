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
package br.com.thiagomoreira.liferay.plugins;

import java.util.List;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.LayoutSetLocalServiceUtil;

/**
 * @author Thiago Leão Moreira
 */
public class ReplaceThemeIdsAction extends SimpleAction {

	public void run(String[] companyIds) throws ActionException {
		String[] oldThemeIdPatterns = PropsUtil.getArray("replace.themeIds.old");
		String[] newThemeIdPatterns = PropsUtil.getArray("replace.themeIds.new");

		for (int i = 0; i < newThemeIdPatterns.length; i++) {
			String oldThemeIdPattern = oldThemeIdPatterns[i];
			String newThemeIdPattern = newThemeIdPatterns[i];

			if (Validator.isNotNull(oldThemeIdPattern) && Validator.isNotNull(newThemeIdPattern) && !oldThemeIdPattern.equals(newThemeIdPattern)) {
				try {
					updateLayouts(oldThemeIdPattern, newThemeIdPattern);
				} catch (Exception ex) {
					throw new ActionException(ex);
				}
			}
		}
	}

	protected void updateLayouts(String oldThemeIdPattern, String newThemeIdPattern) throws Exception {
		List<Layout> layouts =  LayoutLocalServiceUtil.getLayouts(-1, -1);
		for (Layout layout : layouts) {
			String themeId = layout.getThemeId();

			if (themeId.indexOf(newThemeIdPattern) == -1) {
				String newThemeId = themeId.replace(oldThemeIdPattern, newThemeIdPattern);

				if (!newThemeId.equals(themeId)) {
					LayoutLocalServiceUtil.updateLookAndFeel(layout.getGroupId(), layout.getPrivateLayout(), layout.getLayoutId(), newThemeIdPattern, layout.getColorSchemeId(), layout.getCss(), false);
				}
			}
		}
		List<LayoutSet> layoutSets =  LayoutSetLocalServiceUtil.getLayoutSets(-1, -1);
		for (LayoutSet layoutSet : layoutSets) {
			String themeId = layoutSet.getThemeId();

			if (themeId.indexOf(newThemeIdPattern) == -1) {
				String newThemeId = themeId.replace(oldThemeIdPattern, newThemeIdPattern);

				if (!newThemeId.equals(themeId)) {
					LayoutSetLocalServiceUtil.updateLookAndFeel(layoutSet.getGroupId(), layoutSet.getPrivateLayout(), newThemeIdPattern, layoutSet.getColorSchemeId(), layoutSet.getCss(), false);
				}
			}
		}
	}
}