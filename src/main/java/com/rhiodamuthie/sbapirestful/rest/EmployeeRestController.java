package com.rhiodamuthie.sbapirestful.rest;

import com.rhiodamuthie.sbapirestful.model.Employee;
import com.rhiodamuthie.sbapirestful.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> all(){
        return (List<Employee>) employeeRepository.findAll();
    }
}
