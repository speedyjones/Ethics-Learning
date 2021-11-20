package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Location;
import com.mahindra.eng.model.LocationDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LocationService {

    public List<Location> getLocationList(Integer companyId);
    public Location saveLocation(LocationDTO locationDTO);
    public Location saveOrUpdate(Long id, LocationDTO locationDTO);

}
