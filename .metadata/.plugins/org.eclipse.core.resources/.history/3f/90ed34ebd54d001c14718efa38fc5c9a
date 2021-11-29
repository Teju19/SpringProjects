package com.hcl.stereotypeannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("employeeOfficer")
public class EmployeeOfficerImple implements EmployeeOfficer
{
    @Autowired
    EmployeeData data;
     
    public Employee createNewEmployee()
    {
        return data.createNewEmployee();
    }
}