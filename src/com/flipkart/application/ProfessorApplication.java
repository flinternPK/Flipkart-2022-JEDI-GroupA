package com.flipkart.application;
import com.flipkart.service.ProfessorServiceInterface;
import com.flipkart.service.ProfessorServiceImplementation;
public class ProfessorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorServiceInterface professorRef = new ProfessorServiceImplementation();
		professorRef.deselectCourse(0, null);
		professorRef.displaySelectedCoursesProfessor(null);
		professorRef.selectCourse(0, null);

	}

}
