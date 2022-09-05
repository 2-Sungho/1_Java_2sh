package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService {
	
	private List<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeService() {
		empList.add(new Employee(1, "이성호", "1107", "@naver", "6324", "java", "사원", 300));
		empList.add(new Employee(2, "김석환", "0920", "@gmail", "6462", "java", "대리", 400));
		empList.add(new Employee(3, "우동현", "0216", "@apple", "7468", "java", "과장", 500));
		empList.add(new Employee(4, "김규찬", "0730", "@kakao", "8680", "java", "대표", 600));
	}
	
	
	public boolean addEmp(int empId,String empName,String empNO,String email,String phone,String departmentTitle,String jobName,int salary){
		
		Employee emp=new Employee(empId, empName, empNO, email, phone, departmentTitle, jobName, salary);
		return empList.add(emp);
	}
	
	public List<Employee> getEmpList(){
		return empList;
	}
	
	public List<Employee> selectEmpId(int empId){
		List<Employee> resultList=new ArrayList<Employee>();
		for(Employee emp:empList) {
			if(emp.getEmpId()==empId) {
				resultList.add(emp);
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

	public Employee removeEmp(int empId) {
		if(empId<0||empId>=empList.size()) {
			return null;			
		}else {
			return empList.remove(empId+1);
		}
	}

	public List<Employee> sellctDepartmentTitle(String departmentTitle) {
		List<Employee> resultList=new ArrayList<Employee>();
		
		for(Employee emp:resultList) {
			if(emp.getDepartmentTitle().equals(departmentTitle)) {
				resultList.add(emp);
			}
		}
		return resultList;
	}

	public List<Employee> selectSalary(int salary) {
		List<Employee> resultList=new ArrayList<Employee>();
		
		for(Employee emp:resultList) {
			if(emp.getSalary()>=salary) {
				resultList.add(emp);
			}
		}
		return resultList;
	}
	
	

}
