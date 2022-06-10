package Observers;

import java.util.*;

import Observers.model.Assignment.Assignment;

public class Teacher extends Observable{
	
	List<Assignment> assignments;
	
	public Teacher() {
		assignments = new ArrayList<>();
	}
	
	public void update(List<Assignment> assignments) {
		this.assignments.addAll(assignments);
		setChanged();
		notifyObservers(assignments);
		clearChanged();
	}

	public void addStudents(List<Student> group1) {
		group1.stream().forEach((Student student)-> addObserver(student));
		
	}

	public void addAssignment(List<Assignment> assignments) {
		update(assignments);
	}

}
