package com.student.model;

public class Student {

	private int studentId;
	private String name;
	private String course;
	private int marks;
	
	public Student() {
		super();
	}

	public Student(int studentId, String name, String course, int marks) {
	    this.studentId = studentId;
	    this.name = name;
	    this.course = course;
	    this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
	
	
	
}
