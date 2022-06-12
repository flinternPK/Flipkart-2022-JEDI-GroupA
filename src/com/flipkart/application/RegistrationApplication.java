package com.flipkart.application;
import com.flipkart.service.RegistrationServiceImplementation;
import com.flipkart.service.RegistrationServiceInterface;
public class RegistrationApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationServiceInterface registrationRef = new RegistrationServiceImplementation();
		registrationRef.checkCourseSelectionStatus(null);
		registrationRef.displayRegisteredStudentsInCourse(0);
		registrationRef.generateRegistrationReciept(null, 0, 0);
		registrationRef.submitRegistration(null);
	}

}
