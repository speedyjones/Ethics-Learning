package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.UserModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserModuleRepository extends JpaRepository<UserModule,Long> {



}
