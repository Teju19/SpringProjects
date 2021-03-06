package com.hcl.stereotypeannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("employeeController")
public class EmployeeController {
	@Autowired
	EmployeeOfficer officer;

	public Employee createNewEmployee() {
		return officer.createNewEmployee();
	}
}