package com.hcl.stereotypeannotation;

import org.springframework.stereotype.Repository;

@Repository("employeeData")
public class EmployeeDataImple implements EmployeeData {

	public Employee createNewEmployee() {
		Employee emp = new Employee();

		emp.seteName("Tejaswini");
		emp.seteCity("Nagpur");
		return emp;
	}
}
