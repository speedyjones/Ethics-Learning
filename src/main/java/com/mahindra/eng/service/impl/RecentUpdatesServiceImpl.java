package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.RecentUpdates;
import com.mahindra.eng.infrastructure.repository.RecentUpdatesRepository;
import com.mahindra.eng.model.RecentUpdatesDTO;
import com.mahindra.eng.service.RecentUpdatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecentUpdatesServiceImpl implements RecentUpdatesService {


    @Autowired
    private RecentUpdatesRepository recentUpdatesRepository;

    @Autowired
    public void RecentUpdatesServiceImpl(RecentUpdatesRepository recentUpdatesRepository)
    {
        this.recentUpdatesRepository = recentUpdatesRepository;
    }

    @Override
    public List<RecentUpdates> getRecentUpdates()
    {
        return recentUpdatesRepository.findAll();
    }

    @Override
    public RecentUpdates getById(Long id) {
        return recentUpdatesRepository.findById(id).get();
    }

    @Override
    public RecentUpdates saveUpdates(RecentUpdatesDTO recentUpdatesDTO) {
        RecentUpdates recentUpdates = RecentUpdates.builder()
                      .id(recentUpdatesDTO.getId())
                      .RecordType(recentUpdatesDTO.getRecordType())
                      .SubType(recentUpdatesDTO.getSubType())
                      .RecordId(recentUpdatesDTO.getRecordId())
                      .Date(recentUpdatesDTO.getDate())
                      .Details(recentUpdatesDTO.getDetails())
                      .Url(recentUpdatesDTO.getUrl())
                       .build();

        return recentUpdatesRepository.save(recentUpdates);
    }

    @Override
    public RecentUpdates saveOrUpdate(Long id, RecentUpdatesDTO recentUpdatesDTO) {
            if(recentUpdatesRepository.existsById(id))
            {
                RecentUpdates recentUpdates = recentUpdatesRepository.findById(id).get();
                recentUpdates.setRecordType(recentUpdatesDTO.getRecordType());
                recentUpdates.setSubType(recentUpdates.getSubType());
                recentUpdates.setRecordId(recentUpdates.getRecordId());
                recentUpdates.setDate(recentUpdates.getDate());
                recentUpdates.setDetails(recentUpdates.getDetails());
                recentUpdates.setUrl(recentUpdates.getUrl());
                return recentUpdatesRepository.save(recentUpdates);
            }
            else {
                return null;
            }
    }


}
