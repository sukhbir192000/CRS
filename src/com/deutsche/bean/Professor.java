/**
 * 
 */
package com.deutsche.bean;

import java.util.ArrayList;

/**
 * @author sukhb
 *
 */
public class Professor extends User {
	private int id;
	private ArrayList<Course> assignedCourseList;
	private String dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Course> getAssignedCourseList() {
		return assignedCourseList;
	}
	public void setAssignedCourseList(ArrayList<Course> assignedCourseList) {
		this.assignedCourseList = assignedCourseList;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
