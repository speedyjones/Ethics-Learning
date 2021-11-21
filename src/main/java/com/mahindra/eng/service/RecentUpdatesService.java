package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.RecentUpdates;
import com.mahindra.eng.model.RecentUpdatesDTO;

import java.util.List;

public interface RecentUpdatesService {

    public List<RecentUpdates>  getRecentUpdates();
    public RecentUpdates getById(Long id);
    public RecentUpdates saveUpdates(RecentUpdatesDTO recentUpdatesDTO);
    public RecentUpdates saveOrUpdate(Long id, RecentUpdatesDTO recentUpdatesDTO);

}
