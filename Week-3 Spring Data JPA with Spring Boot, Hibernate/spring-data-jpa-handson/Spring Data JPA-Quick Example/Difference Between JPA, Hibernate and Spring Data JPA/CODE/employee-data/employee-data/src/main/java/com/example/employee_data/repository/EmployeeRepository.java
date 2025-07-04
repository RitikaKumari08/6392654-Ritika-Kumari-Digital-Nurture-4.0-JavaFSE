package com.example.employee_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee_data.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // No need to add any methods now — JpaRepository provides CRUD methods by default
}
