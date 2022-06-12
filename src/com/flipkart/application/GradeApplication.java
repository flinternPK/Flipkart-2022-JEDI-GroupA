package com.flipkart.application;
import com.flipkart.service.GradeServiceInterface;
import com.flipkart.service.GradeServiceImplementation;
public class GradeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeServiceInterface gradeRef = new GradeServiceImplementation();
		gradeRef.displayGrades(null);
		gradeRef.uploadGrades(0, 0, null);
	}

}
