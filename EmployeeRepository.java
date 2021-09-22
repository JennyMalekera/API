package com.example.demo1.repository;

import java.lang.*;
import com.example.demo1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // insert method
    //Employee insert(Employee employee);

    }

