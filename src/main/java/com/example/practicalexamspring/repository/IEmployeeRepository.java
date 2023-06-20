package com.example.practicalexamspring.repository;

import com.example.practicalexamspring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
