package com.flipkart.application;
import com.flipkart.service.StudentServiceImplementation;
import com.flipkart.service.StudentServiceInterface;
public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServiceInterface studentRef = new StudentServiceImplementation();
		studentRef.addCourse(0, null);
		studentRef.displaySelectedCourses(null);
		studentRef.dropCourse(0, null);
	}

}
