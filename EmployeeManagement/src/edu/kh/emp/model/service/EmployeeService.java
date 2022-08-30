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
	
	public List<Employee> selectEmpId(int empId){
		List<Employee> resultList=new ArrayList<Employee>();
		for(Employee e:empList) {
			if(e.getEmpId()==empId) {
				resultList.add(e);
			}
		}
		return resultList;
	}

	public boolean updateEmp(int empId, String email, String phone) {
		if(empId<0||empId>=empList.size()) {
			return false;
		}else {
			empList.get(empId).setEmail(email);
			empList.get(empId).setPhone(phone);
			return true;
		}
	}
	
	

}
