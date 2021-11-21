package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.EthicsHelpline;
import com.mahindra.eng.infrastructure.repository.EthicsHelpLineRepository;
import com.mahindra.eng.model.EthicsHelplineDTO;
import com.mahindra.eng.service.EthicsHelpLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EthicsHelpLineImpl implements EthicsHelpLineService {

    @Autowired
    private EthicsHelpLineRepository ethicsHelpLineRepository;

    @Autowired
    public void EthicsHelpLineImpl(EthicsHelpLineRepository ethicsHelpLineRepository)
    {
        this.ethicsHelpLineRepository = ethicsHelpLineRepository;
    }

    @Override
    public List<EthicsHelpline> getHelpLineList() {
        return ethicsHelpLineRepository.findAll();
    }

    @Override
    public EthicsHelpline getHelplineById(Long id) {
        return ethicsHelpLineRepository.findById(id).get();
    }

    @Override
    public EthicsHelpline saveHelpline(EthicsHelplineDTO ethicsHelplineDTO) {
            EthicsHelpline ethicsHelpline = EthicsHelpline.builder()
                            .id(ethicsHelplineDTO.getId())
                            .Url(ethicsHelplineDTO.getUrl())
                            .TollFreeNumber(ethicsHelplineDTO.getTollFreeNumber())
                            .email(ethicsHelplineDTO.getEmail())
                            .createdDate(ethicsHelplineDTO.getCreatedDate())
                            .updatedBy(ethicsHelplineDTO.getUpdatedBy())
                            .updatedBy(ethicsHelplineDTO.getUpdatedBy())
                            .status(ethicsHelplineDTO.getStatus())
                            .build();
            return ethicsHelpLineRepository.save(ethicsHelpline);
    }

    @Override
    public EthicsHelpline saveOrUpdate(Long id, EthicsHelplineDTO ethicsHelplineDTO) {
        if(ethicsHelpLineRepository.existsById(id))
        {
            EthicsHelpline ethicsHelpline = ethicsHelpLineRepository.findById(id).get();
            ethicsHelpline.setUrl(ethicsHelplineDTO.getUrl());
            ethicsHelpline.setTollFreeNumber(ethicsHelpline.getTollFreeNumber());
            ethicsHelpline.setEmail(ethicsHelpline.getEmail());
            ethicsHelpline.setCreatedDate(ethicsHelpline.getCreatedDate());
            ethicsHelpline.setUpdatedBy(ethicsHelpline.getUpdatedBy());
            ethicsHelpline.setStatus(ethicsHelpline.getStatus());
            return ethicsHelpLineRepository.save(ethicsHelpline);
        }
        else {
            return null;
        }
    }
}
