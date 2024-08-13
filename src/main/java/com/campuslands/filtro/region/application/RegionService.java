package com.campuslands.filtro.region.application;

import java.util.List;

import com.campuslands.filtro.region.domain.Region;

/**
 * CityService
 */
public interface RegionService {

    Region saveRegion(Region region);

    Region updateRegion(Long id, Region region);

    void deleteRegion(Long id);

    Region getRegionById(Long id);

    List<Region> fetchRegionsList();

    List<Region> fetchRegionsListView();

}