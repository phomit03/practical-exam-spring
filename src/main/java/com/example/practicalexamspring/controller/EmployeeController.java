package com.example.practicalexamspring.controller;

import com.example.practicalexamspring.entity.Employee;
import com.example.practicalexamspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public String createEmployee(@RequestBody Employee employee) {
        try {
            return employeeService.createEmployee(employee);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "error";
        }
    }

    @GetMapping("/list")
    public List<Employee> getListEmployees() {
        try {
            return employeeService.findAllEmployees();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return getListEmployees();
    }

}
