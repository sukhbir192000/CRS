/**
 * 
 */
package com.deutsche.bean;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author sukhb
 *
 */
public class Student extends User {
	private int id;
	private String branch;
	private String dept;
	private int year;
	private Map<Course, String> courseList;
	private ArrayList<Course> unpaidList;
	private ArrayList<Course> preferenceList;
	private GradeCard gradeCard;
	private int registrationId;
	
	

	public ArrayList<Course> getUnpaidList() {
		return unpaidList;
	}
	public void setUnpaidList(ArrayList<Course> unpaidList) {
		this.unpaidList = unpaidList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Map<Course, String> getCourseList() {
		return courseList;
	}
	public void setCourseList(Map<Course, String> courseList) {
		this.courseList = courseList;
	}
	public ArrayList<Course> getPreferenceList() {
		return preferenceList;
	}
	public void setPreferenceList(ArrayList<Course> preferenceList) {
		this.preferenceList = preferenceList;
	}
	public GradeCard getGradeCard() {
		return gradeCard;
	}
	public void setGradeCard(GradeCard gradeCard) {
		this.gradeCard = gradeCard;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	
	
}
