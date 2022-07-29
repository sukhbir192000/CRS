/**
 * 
 */
package com.deutsche.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import com.deutsche.bean.Course;
import com.deutsche.bean.Student;

/**
 * @author sukhb
 *
 */
public class StudentService {
	
	public boolean checkRegistration(Student student, Course course) {
		return student.getUnpaidList().contains(course) || student.getCourseList().containsKey(course);
	}

	public void registerCourse(Student student, Course course) {
		if(checkRegistration(student, course)) {
			System.out.println("Course already registered.");
			return;
		}
		ArrayList<Course> preferenceList = student.getPreferenceList();
		if(preferenceList.contains(course)) {
			preferenceList.remove(course);
			student.getUnpaidList().add(course);
		}
		else {
			System.out.println("Course not selected as a preference.");
		}
		
	}
	
	public void addCourse(Student student, Course course) {
		if(checkRegistration(student, course)) {
			System.out.println("Course already registered.");
			return;
		}
		ArrayList<Course> preferenceList = student.getPreferenceList();
		if(!preferenceList.contains(course)) {
			preferenceList.add(course);
		}
		else {
			System.out.println("Course already added as a preference.");
		}
		
	}
	
	public void dropCourse(Student student, Course course) {
		if(!checkRegistration(student, course)) {
			System.out.println("Course already registered.");
			return;
		}
		ArrayList<Course> preferenceList = student.getPreferenceList();
		if(preferenceList.contains(course)) {
			preferenceList.remove(course);
		}
		else {
			System.out.println("Course not added as a preference.");
		}
	}
	
	public void viewGrades(Student s) {
		Map<Course,String>result = s.getCourseList();
		System.out.println("The grades are as follows:");
		for(Map.Entry<Course,String> entry:result.entrySet()) {
			System.out.println(entry.getKey().getCourseCode() +  "......"
		+entry.getKey().getCourseName() +  "......" + entry.getValue());
		}
	}
	
	public String payFees(Student s) {
		ArrayList<Course> temp = s.getUnpaidList();
		
		int total_amount=0;
		for(Iterator<Course> iter = temp.iterator();iter.hasNext();) {
			Course t= iter.next();
			total_amount = total_amount + t.getFee();
		}
		
		System.out.println("Choose the mode: 1->Offline 2->Online");
		
		//input
		
		System.out.println("Enter the Transaction Id");
		//id
		Map<Course,String> courselist=s.getCourseList();
		for(Iterator<Course> iter = temp.iterator();iter.hasNext();) {
			courselist.put(iter.next(),"");
		}
		
		temp.clear();
		
		return "Paid";
	}
	
}
