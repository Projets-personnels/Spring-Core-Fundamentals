package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String EmpName;
	private List<String> phNum;
	private Set<String> address;
	private Map<String, String> courses;
	
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhNum() {
		return phNum;
	}
	public void setPhNum(List<String> phNum) {
		this.phNum = phNum;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	
	public Employee(String empName, List<String> phNum, Set<String> address, Map<String, String> courses) {
		super();
		EmpName = empName;
		this.phNum = phNum;
		this.address = address;
		this.courses = courses;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", phNum=" + phNum + ", address=" + address + ", courses=" + courses
				+ "]";
	}
	
	
}
