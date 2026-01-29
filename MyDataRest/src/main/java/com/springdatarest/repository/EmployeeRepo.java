package com.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.springdatarest.entity.Employee;

@RepositoryRestResource(path="emps")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
