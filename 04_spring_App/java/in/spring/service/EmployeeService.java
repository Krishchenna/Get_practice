package in.spring.service;

import in.spring.entity.EmployeeEntity;
import in.spring.rep.EmployeeRepositry;

public class EmployeeService {
	
	private EmployeeRepositry emprpo;
	
	public EmployeeService (EmployeeRepositry emprpo) {
		this.emprpo=emprpo;
	}
	
	
	public void save() {
		EmployeeEntity emp=new EmployeeEntity();
		emp.setEmpId(1);
		emp.setEmpName("krish");
		emp.setEmpSalary(5000);
		emp.setEmpGender("male");
		emprpo.save(emp);
	} 

}
