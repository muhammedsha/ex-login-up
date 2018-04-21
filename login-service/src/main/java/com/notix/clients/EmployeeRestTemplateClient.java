/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notix.clients;

import com.notix.model.Employee;
import com.notix.utils.UserContext;
import com.notix.utils.UserContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author jibin
 */
@Component
public class EmployeeRestTemplateClient {
    @Autowired
    RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeRestTemplateClient.class);
    public Employee getEmployee(String empId){
        logger.debug(">>> In Licensing Service.getOrganization: {}. Thread Id: {}", UserContextHolder.getContext().getCorrelationId(), Thread.currentThread().getId());
        ResponseEntity<Employee> restExchange =
                restTemplate.exchange(
                        "http://employeeservice/v1/employees/{empId}",
                        HttpMethod.GET,
                        null, Employee.class, empId);

        return restExchange.getBody();
    }
    
}
