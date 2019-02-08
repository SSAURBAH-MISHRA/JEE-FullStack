package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.beans.Course;
import com.capgemini.beans.Student;
import com.capgemini.bl.StudentScheduler;

public class MainProgram {
	public static Scanner sc=new Scanner (System.in);
	public static StudentScheduler ss=new StudentScheduler();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		while (true)
		{
			System.out.println("Enter 1:Add Student. \n 2:Add Student Course. \n 3:Show Student Details. \n 4:Show all student details. \n 5:Exit.");
			n=sc.nextInt();
			switch(n)
			{
			case 1: addStudent();
			break;
			
			case 2:studentcourse();
			break;
			
			case 3: showStudent();
			break;
			
			case 4: showallstudent();
			break;
			
			case 5: System.exit(0);
			break;
			
			default:System.out.println("Invalid choice. \n");
			}
		}
	}

	private static void addStudent() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter roll no:");
		int rl=sc.nextInt();
		System.out.println("Enter name:");
		String na=sc.next();
		char message=ss.addData(rl,na);
		if(message=='y') {
		System.out.println("Student added successfully \n.");}
		else {
			System.out.println("Roll number already exist \n.");
		}
	}
	
	private static void studentcourse() {
		// TODO Auto-generated method stub
		System.out.println("Enter Roll number to add course:");
		int rl=sc.nextInt();
		System.out.println("Enter the no. of course:");
		int no=sc.nextInt();
		Course[] c1=new Course[no];
		for(int i=0;i<no;i++) {
			c1[i] = new Course();
			System.out.print("Enter "+(i+1)+" course id : ");
			int cId = sc.nextInt();
			System.out.print("Enter "+(i+1)+" course name : ");
			String cName = sc.next();
			c1[i].setId(cId);
			c1[i].setCname(cName);
		}
		char message=ss.studentcourse(rl,c1,no);
		if(message!='y') {
			System.out.println("Invalid roll number.");
		}
		else {
			System.out.println("Course stored sucessfully.");
		}
		
		
	}
	
	private static void showStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter rollno:");
		int rl=sc.nextInt();
		ss.showData(rl);
		Student student=ss.showData(rl);
		if(student!=null) {
			System.out.println("Roll Number : "+student.getRollno());
			System.out.println("Student Name : "+student.getName());
			System.out.println("Courses of Student are : ");
			Course[] course=student.getEnroll();
			for(int j=0;j<student.getNoOfCourse();j++) {
				System.out.println(course[j].getId()+" "+course[j].getCname());
			}
		}
		else {
			System.out.println("invalid roll number. \n");
		}
		
	}

	private static void showallstudent() {
		// TODO Auto-generated method stub
		Student[] students = ss.showallstudent();
		for(int i=0;students[i]!=null;i++) {
			System.out.println((i+1)+".Student Roll Number : "+students[i].getRollno());
			System.out.println("Student Name : "+students[i].getName());
			Course[] course = students[i].getEnroll();
			System.out.println("Student Courses : "+students[i].getRollno());
			for(int j=0;j<students[i].getNoOfCourse();j++) {
				System.out.println("Id : "+course[j].getId()+" Name: "+course[j].getCname());
			}
			
		}
		
		
		
	}
}



