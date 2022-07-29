/**
 * 
 */
package com.deutsche.bean;

import java.util.ArrayList;

/**
 * @author sukhb
 *
 */
public class GradeCard {
	
	private Student student;
	private ArrayList<Grade> gradeList;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public ArrayList<Grade> getGradeList() {
		return gradeList;
	}
	public void setGradeList(ArrayList<Grade> gradeList) {
		this.gradeList = gradeList;
	}

}
