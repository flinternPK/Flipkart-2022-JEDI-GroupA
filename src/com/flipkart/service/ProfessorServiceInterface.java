package com.flipkart.service;

import com.flipkart.bean.Professor;

public interface ProfessorServiceInterface {
	public void selectCourse(int courseId ,Professor professor);
	public void deselectCourse(int courseId, Professor professor);
	public void displaySelectedCoursesProfessor(Professor professor);

}