package com.campuslands.filtro.unitmeasurement.application;

import java.util.List;

import com.campuslands.filtro.region.domain.Region;

/**
 * CityService
 */
public interface UnitmeasurementService {

    Region saveRegion(Region region);

    Region updateRegion(Long id, Region region);

    void deleteRegion(Long id);

    Region getRegionById(Long id);

    List<Region> fetchRegionsList();

    List<Region> fetchRegionsListView();

}