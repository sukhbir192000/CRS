/**
 * 
 */
package com.deutsche.bean;

/**
 * @author sukhb
 *
 */
public class Grade {
	
	
	private Student student;
	private Course course;
	private String grade;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
