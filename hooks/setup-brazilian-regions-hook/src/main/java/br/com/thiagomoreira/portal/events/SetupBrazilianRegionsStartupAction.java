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

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.model.Country;
import com.liferay.portal.model.Region;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.service.RegionServiceUtil;

import java.util.List;

/**
 * @author Thiago Leão Moreira
 */
public class SetupBrazilianRegionsStartupAction extends SimpleAction {

	public void run(String[] companyIds) throws ActionException {
		try {

			PermissionThreadLocal.setPermissionChecker(new OminAdminPermissionChecker());

			Country brazil = CountryServiceUtil.getCountryByA2("BR");
			long countryId = brazil.getCountryId();

			List<Region> regions = RegionServiceUtil.getRegions(countryId);

			if (regions.isEmpty()) {
				RegionServiceUtil.addRegion(countryId, "AL","Alagoas", true);
				RegionServiceUtil.addRegion(countryId, "AM","Amazonas", true);
				RegionServiceUtil.addRegion(countryId, "AP","Amapá", true);
				RegionServiceUtil.addRegion(countryId, "BA","Bahia", true);
				RegionServiceUtil.addRegion(countryId, "CE","Ceará", true);
				RegionServiceUtil.addRegion(countryId, "DF","Distrito Federal", true);
				RegionServiceUtil.addRegion(countryId, "ES","Espírito Santo", true);
				RegionServiceUtil.addRegion(countryId, "GO","Goiás", true);
				RegionServiceUtil.addRegion(countryId, "MA","Maranhão", true);
				RegionServiceUtil.addRegion(countryId, "MG","Minas Gerais", true);
				RegionServiceUtil.addRegion(countryId, "MS","Mato Grosso do Sul", true);
				RegionServiceUtil.addRegion(countryId, "MT","Mato Grosso", true);
				RegionServiceUtil.addRegion(countryId, "PA","Pará", true);
				RegionServiceUtil.addRegion(countryId, "PB","Paraíba", true);
				RegionServiceUtil.addRegion(countryId, "PE","Pernambuco", true);
				RegionServiceUtil.addRegion(countryId, "PI","Piauí", true);
				RegionServiceUtil.addRegion(countryId, "PR","Paraná", true);
				RegionServiceUtil.addRegion(countryId, "RJ","Rio de Janeiro", true);
				RegionServiceUtil.addRegion(countryId, "RN","Rio Grande do Norte", true);
				RegionServiceUtil.addRegion(countryId, "RR","Roraima", true);
				RegionServiceUtil.addRegion(countryId, "RO","Rondônia", true);
				RegionServiceUtil.addRegion(countryId, "RS","Rio Grande do Sul", true);
				RegionServiceUtil.addRegion(countryId, "SC","Santa Catarina", true);
				RegionServiceUtil.addRegion(countryId, "SE","Sergipe", true);
				RegionServiceUtil.addRegion(countryId, "SP","São Paulo", true);
				RegionServiceUtil.addRegion(countryId, "TO","Tocantins", true);
			}
		} catch (Exception e) {
			throw new ActionException(e);
		}

	}

}