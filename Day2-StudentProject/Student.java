package com.capgemini.beans;

public class Student {
	private int rollno;
	private String name;
	private Course[] enroll;
	private int noOfCourse;
	public int getNoOfCourse() {
		return noOfCourse;
	}
	public void setNoOfCourse(int noOfCourse) {
		this.noOfCourse = noOfCourse;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getEnroll() {
		return enroll;
	}
	public void setEnroll(Course[] enroll) {
		this.enroll = enroll;
	}                                                                     
}