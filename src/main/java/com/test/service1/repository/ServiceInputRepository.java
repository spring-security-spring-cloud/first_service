package com.test.service1.repository;

import com.test.service1.model.ServiceInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceInputRepository extends JpaRepository<ServiceInput, Integer>, JpaSpecificationExecutor<ServiceInput> {
}
