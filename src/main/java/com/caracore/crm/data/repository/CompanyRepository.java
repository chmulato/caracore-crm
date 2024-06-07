package com.caracore.crm.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caracore.crm.data.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
