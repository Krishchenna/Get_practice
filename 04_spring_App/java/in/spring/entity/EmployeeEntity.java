package in.spring.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class EmployeeEntity {
	@Id
private int empId;
private String empName;
private double empSalary;
private String empGender;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpGender() {
	return empGender;
}
public void setEmpGender(String empGender) {
	this.empGender = empGender;
}

}
