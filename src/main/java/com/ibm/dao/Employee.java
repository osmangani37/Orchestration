package com.ibm.dao;

public class Employee {
	int EmpID;
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpAddress=" + EmpAddress + ", EmpSalary="
				+ EmpSalary + "]";
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	public String getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(String empSalary) {
		EmpSalary = empSalary;
	}
	String EmpName;
	String EmpAddress;
	String EmpSalary;
}
