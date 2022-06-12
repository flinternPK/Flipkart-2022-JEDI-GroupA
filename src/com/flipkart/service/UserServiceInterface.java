package com.flipkart.service;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;

/** 
 * @desc this interface is implemented by UserServiceOperation class
 * @author Anushka
 */
public interface UserServiceInterface {
	
	public User validateUser(String username, String password);
	public Student fetchStudent(int studentId);
	 public Admin fetchAdmin(int adminId);
	 public Professor fetchProfessor(int professorId);
	 public void createUser(User user);
	 public void createStudent(Student student) ;
	 public void createProfessor(Professor professor);
	 public void createAdmin(Admin admin);
	 public void updateUser(int userId,User user);
	  public void updateStudent(int sudentId,Student student);
	  public void updateProfessor(int professsorId,Professor professor) ;
	  public void updateAdmin(int adminId,Admin admin) ;
	  public void deleteUser(int userId,String query) ;
	 public void displayStudents();
	 public void displayProfessors();
	 public void displayAdmins() ;

}