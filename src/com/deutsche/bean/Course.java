/**
 * 
 */
package com.deutsche.bean;

import java.util.ArrayList;

/**
 * @author sukhb
 *
 */
public class Course {
	final private int MAX_SEATS = 10;
	final private int MIN_SEATS = 3;
	
	
	private String courseName;
	private String courseCode;
	private ArrayList<Student> registeredStudents;
	private Professor professor;
	private String prerequisites;
	private int fee;
	
	
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}
	public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}
	public int getMAX_SEATS() {
		return MAX_SEATS;
	}
	public int getMIN_SEATS() {
		return MIN_SEATS;
	}

}
