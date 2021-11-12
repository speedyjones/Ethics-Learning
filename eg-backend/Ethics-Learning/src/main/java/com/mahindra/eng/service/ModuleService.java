package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.ELModule;
import com.mahindra.eng.infrastructure.entity.UserModule;
import com.mahindra.eng.model.ModuleDTO;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ModuleService {
    public ELModule getModuleList(Long id);
    public ELModule saveModule(ModuleDTO moduleDTO);
    public ELModule saveOrUpdate(Long id, ModuleDTO moduleDTO);

}
