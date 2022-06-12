package com.flipkart.application;
import com.flipkart.service.CourseServiceImplementation;
import com.flipkart.service.CourseServiceInterface;
public class CourseApplication {
	public static void main(String[] args) {
		CourseServiceInterface courseRef = new CourseServiceImplementation();
		courseRef.displayCourses(null);
		courseRef.deleteCourse(0);
		courseRef.displayCoursesProfessor();
		
	}
}
