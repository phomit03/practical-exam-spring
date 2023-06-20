package com.example.practicalexamspring.service;

import com.example.practicalexamspring.entity.Employee;
import com.example.practicalexamspring.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    public String createEmployee(Employee employee) {
        try {
            iEmployeeRepository.save(employee);
            return "success";
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "error";
        }
    }

    public List<Employee> findAllEmployees(){
        return iEmployeeRepository.findAll();
    }

}
