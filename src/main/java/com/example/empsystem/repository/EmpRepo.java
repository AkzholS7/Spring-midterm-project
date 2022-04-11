package com.example.empsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.empsystem.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}