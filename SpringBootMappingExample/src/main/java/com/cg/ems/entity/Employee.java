package com.cg.ems.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee_tbl")
public class Employee {

	@Id
	@GeneratedValue(generator="eseq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="eseq",sequenceName="employee_seq",allocationSize=1)
	@Column(name="empid")
	private int employeeId;
	
	@Column(name="ename")
	private String employeeName;
	
	@Column(name="esal")
	private double employeeSalary ;
	
	
	@ManyToOne
	@JoinColumn(name="deptid")
	private Department  department ;

	public Employee(int employeeId, String employeeName, double employeeSalary, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
