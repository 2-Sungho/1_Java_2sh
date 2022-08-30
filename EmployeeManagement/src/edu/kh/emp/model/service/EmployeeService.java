package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService {
	
	private List<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmp(int empID,String empName,String empNO,String email,String phone,String departmentTitle,String jobName,int salary){
		
		Employee emp=new Employee(empID, empName, empNO, email, phone, departmentTitle, jobName, salary);
		return empList.add(emp);
	}
	
	public List<Employee> getEmpList(){
		return empList;
	}
	
	
	

}
