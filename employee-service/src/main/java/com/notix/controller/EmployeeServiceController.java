/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notix.controller;

import com.notix.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.notix.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jibin
 */
@RestController
@RequestMapping("v1/employees")
public class EmployeeServiceController {
    @Autowired
    private EmployeeService empService;
    
    Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value="/{empId}", method= RequestMethod.GET)
    public Employee getEmployee( @PathVariable("empId") String empId) {
        Employee value = empService.getEmp(empId);
        logger.info("{}",value);
         return value;
    }
    
}
