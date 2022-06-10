package Observers;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import Observers.model.Assignment.Assignment;

public class Student implements Observer{
	
	String name;
	List<Assignment> assignments;
	
	public Student(String name) {
		super();
		assignments = new ArrayList<>();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
			List<Assignment> assignment = (List<Assignment>) arg;
			this.assignments.addAll(assignment);
	}
	
	public void show() {
		System.out.println("Student : "+name);
		this.assignments.stream()
		.forEach((assignment) -> System.out.println(String.format("Assignment name: %s, Assignment description: %s, Assignment date: %s", assignment.getTitle(), assignment.getDescription(), assignment.getDateStamp().toString())));
	}
	
}
