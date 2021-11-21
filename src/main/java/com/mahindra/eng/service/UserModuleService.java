package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.UserModule;
import com.mahindra.eng.model.UserModuleDTO;

import java.util.List;

public interface UserModuleService {

    public UserModule getModuleList(Long id);
    public UserModule saveModule(UserModuleDTO userModuleDTO);
    public UserModule saveOrUpdate(Long id, UserModuleDTO userModuleDTO);

}
