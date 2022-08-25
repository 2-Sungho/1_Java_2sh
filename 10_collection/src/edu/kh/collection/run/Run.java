package edu.kh.collection.run;

import edu.kh.collection.model.service.ListService;
import edu.kh.collection.view.StudentView;

public class Run {

	public static void main(String[] args) {

		ListService service1=new ListService();
		
//		service1.ex1();
		
		StudentView view=new StudentView();
		
		view.displayMenu();
	}

}
