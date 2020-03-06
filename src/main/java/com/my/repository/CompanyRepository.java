package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{
}