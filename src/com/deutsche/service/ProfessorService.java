/**
 * 
 */
package com.deutsche.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.deutsche.bean.Course;
import com.deutsche.bean.Professor;
import com.deutsche.bean.Student;

/**
 * @author sukhb
 *
 */
public class ProfessorService {

	public void addGrades(Student s, Course c, String grade) {
		
		if(s.getCourseList() != null && s.getCourseList().containsKey(c)) {
			if(s.getCourseList().get(c) == null || s.getCourseList().get(c) == "") {
				s.getCourseList().put(c, grade);
				System.out.println("Successfully added grades..");
			}
			else {
				System.out.println("Grades for this student is already recorded!!!!");
			}
		}
		else {
			System.out.println("Student hasn't enrolled in that course !!!");
		}
		
	}
	
	
	public List<Student> viewEnrolledStudents(Professor professor) {
		
		Set<Student> enrolledStudents = new HashSet<>();
		
		for(Course c : viewCourses(professor)) {
			for(Student s : c.getRegisteredStudents()) {
				enrolledStudents.add(s);
			}
		}
		
		return new ArrayList<Student>(enrolledStudents);
	}
	

	public List<Course> viewCourses(Professor professor){
		return professor.getAssignedCourseList();
	}

	
}
