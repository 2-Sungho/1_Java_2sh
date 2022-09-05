package edu.kh.emp.view;

import java.util.List;
import java.util.Scanner;

import edu.kh.emp.model.service.EmployeeService;
import edu.kh.emp.model.vo.Employee;

public class EmployeeManagementView {
	
	private Scanner sc = new Scanner(System.in);
	private EmployeeService service=new EmployeeService();
	
	public void ManagementDisplay() {
		
		int input=0;
		
		do {
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택: ");
			input=sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: this.addEmp();
				break;
			case 2: this.sellectAll();
				break;
			case 3: this.selectEmpIds();
				break;
			case 4: this.updateEmp();
				break;
			case 5: this.removeEmp();
				break;
			case 6: this.selectdepartmentTitle();
				break;
			case 7: this.selectSalary();
				break;
			case 8: this.departmentTitleSumSalary();
				break;
			case 0: System.out.println("프로그램 종료");
				break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}while(input!=0);
		
	}


	/**
	 * 새로운 사원 추가 메서드
	 */
	public void addEmp() {
		System.out.println("==사원 정보 추가==");
		
		System.out.print("사원 번호: ");
		int empId=sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원 이름: ");
		String empName=sc.nextLine();
		
		System.out.print("주민등록번호: ");
		String empNo=sc.nextLine();
		
		System.out.print("이메일: ");
		String email=sc.nextLine();
		
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		
		System.out.print("부서명: ");
		String departmentTitle=sc.nextLine();
		
		System.out.print("직급명: ");
		String jobName=sc.nextLine();
		
		System.out.print("급여: ");
		int salary=sc.nextInt();
		
		if(service.addEmp(empId, empName, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("사원 추가 성공");
		}else {
			System.out.println("사원 추가 실패");
		}
	}
	
	/**
	 * 전체 사원 정보 조회 메서드
	 */
	public void sellectAll() {
		List<Employee> empList=service.getEmpList();
		
		for(Employee e:empList) {
			System.out.println(e);
		}
	}
	
	/**
	 * 사원으로 사원정보조회 메서드
	 */
	public void selectEmpIds() {
		System.out.println("==사번이 일치하는 사원 정보 조회==");
		
		System.out.print("사번 입력: ");
		int idx=sc.nextInt();
		sc.nextLine();
		
		List<Employee> resultList=service.selectEmpId(idx);
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(Employee emp:resultList) {
				System.out.println(emp);
			}
		}
	}
	
	public void updateEmp() {
		System.out.println("==사번이 일치하는 사원 정보 수정==");
		
		System.out.print("사번 입력: ");
		int empId=sc.nextInt();
		sc.nextLine();
		
		System.out.print("수정할 이메일: ");
		String email=sc.nextLine();
		
		System.out.println("수정할 전화번호: ");
		String phone=sc.nextLine();
		
		if(service.updateEmp(empId,email,phone)) {
			System.out.println("성공");
		}else {
			System.out.println("실패(사번 불일치)");
		}
	}
	public void removeEmp() {
		System.out.println("==사번이 일치하는 사원 정보 삭제==");
		
		System.out.print("사번 입력: ");
		int empId=sc.nextInt();
		sc.nextLine();
		
		Employee emp=service.removeEmp(empId);
		if(emp==null) {
			System.out.println("실패(사번 불일치)");
		}else {
			System.out.println(emp.getEmpName()+"사원의 정보가 삭제되었습니다.");
		}
	}
	/**
	 * 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	public void selectdepartmentTitle() {
		System.out.println("==입력 받은 부서와 일치 모든 사원 정보 조회==");
		
		System.out.print("부서명 입력: ");
		String departmentTitle=sc.nextLine();
		
		List<Employee> resultList=service.sellctDepartmentTitle(departmentTitle);
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(Employee emp:resultList) {
				System.out.println(emp);
			}
		}
	}
	public void selectSalary() {
		System.out.println("==입력 받은 급여 이상을 받는 모든 사원 정보 조회==");
		
		System.out.print("급여 입력: ");
		int salary=sc.nextInt();
		sc.nextLine();
		
		List<Employee> resultList=service.selectSalary(salary);
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(Employee emp:resultList) {
				System.out.println(emp);
			}
		}
	}
	private void departmentTitleSumSalary() {
		System.out.println("==부서별 급여 합 전체 조회==");
		
	}
}
