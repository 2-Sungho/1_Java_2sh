package edu.kh.collection.run;

import edu.kh.collection.model.service.ListService;
import edu.kh.collection.model.service.MapService;
import edu.kh.collection.model.service.SetService;
import edu.kh.collection.view.StudentView;

public class Run {

	public static void main(String[] args) {

		ListService service1=new ListService();
		
//		service1.ex1();
		
		StudentView view=new StudentView();
		
		view.displayMenu();
		
		SetService service2=new SetService();
		
//		service2.ex1();
//		service2.ex2();
//		service2.ex3();
		
		MapService service3=new MapService();
		
//		service3.ex1();
//		service3.ex2();
//		service3.ex3();
	}

}
