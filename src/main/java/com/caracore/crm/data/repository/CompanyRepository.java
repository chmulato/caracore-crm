package com.caracore.crm.data.repository;

import com.caracore.crm.data.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query(value = "select c.* from `caracore_crm`.`company` as c", nativeQuery = true)
    List<Company> findAllNative();

    @Query(value = "select count(c.id) from `caracore_crm`.`contact` c where c.company_id = :id", nativeQuery = true)
    long getEmployeeCount(@Param("id") Long id);
}
