package com.flipkart.application;
import com.flipkart.service.UserServiceImplementation;
import com.flipkart.service.UserServiceInterface;
public class UserApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserServiceInterface userRef = new UserServiceImplementation();
		userRef.createAdmin(null);
		userRef.createProfessor(null);
		userRef.createStudent(null);
		userRef.createUser(null);
		userRef.deleteUser(0, null);
		userRef.displayAdmins();
		userRef.displayProfessors();
		userRef.displayStudents();
		userRef.fetchAdmin(0);
		userRef.fetchProfessor(0);
		userRef.fetchStudent(0);
		userRef.updateAdmin(0, null);
		userRef.updateProfessor(0, null);
		userRef.updateStudent(0, null);
		userRef.updateUser(0, null);
		userRef.validateUser(null, null);
	}

}
