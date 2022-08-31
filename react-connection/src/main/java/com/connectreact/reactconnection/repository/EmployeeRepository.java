package com.connectreact.reactconnection.repository;

import com.connectreact.reactconnection.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}
