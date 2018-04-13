/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notix.services;

import com.notix.model.Employee;
import com.notix.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jibin
 */
@Service
public class EmployeeService {

     @Autowired
    private EmployeeRepository empRepository;

    public Employee getEmp(String empId) {
        return empRepository.findById(empId);
    }
}
