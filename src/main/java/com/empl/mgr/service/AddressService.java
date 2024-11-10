package com.empl.mgr.service;

import com.empl.mgr.support.JSONReturn;

public abstract interface AddressService {

	public abstract JSONReturn findProvinceAll();

	public abstract JSONReturn findCityByProvinceId(long provinceId);

	public abstract JSONReturn findCountyByCityId(long cityId);

	public abstract JSONReturn findTownshipByCountyId(long countyId);

	public abstract JSONReturn findVillageByTownshipId(long towhshipId);

}
