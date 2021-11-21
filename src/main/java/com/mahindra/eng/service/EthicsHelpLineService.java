package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.EthicsHelpline;
import com.mahindra.eng.model.EthicsHelplineDTO;


import java.util.List;

public interface EthicsHelpLineService{
    public List<EthicsHelpline> getHelpLineList();
    public EthicsHelpline getHelplineById(Long id);
    public EthicsHelpline saveHelpline(EthicsHelplineDTO ethicsHelplineDTO);
    public EthicsHelpline saveOrUpdate(Long id, EthicsHelplineDTO ethicsHelplineDTO);
}
