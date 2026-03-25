package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.student.model.Student;

public class StudentService {
   
	private List<Student> students = new ArrayList<>();
	
	
	public void addStudent(Student s) {  // add Student
		students.add(s);
	}
	
	public void veiwAll() {       // view allStudent
		students.forEach(System.out::println);
	}
	
	public void getTopStudents() {   //sortStudent
		students.stream()
		.filter(s -> s.getMarks() > 70)
		.forEach(System.out::println);
	}
	
	
	public void viewAll() {
	    students.forEach(System.out::println);
	}

	public void groupByCourse() {
	    Map<String, List<Student>> map =
	        students.stream().collect(Collectors.groupingBy(Student::getCourse));

	    map.forEach((course, list) -> {
	        System.out.println("Course: " + course);
	        list.forEach(System.out::println);
	    });
	}
	
	
	public void sortByMarks() {
	    students.stream()
	        .filter(s -> s.getMarks() > 70)
	        .sorted((s1, s2) -> s2.getMarks() - s1.getMarks())
	        .forEach(System.out::println);
	}
	
	
	
}
