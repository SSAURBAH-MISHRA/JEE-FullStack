package com.capgemini.bl;

import com.capgemini.beans.Course;
import com.capgemini.beans.Student;

public class StudentScheduler {
	private Student[] a = new Student[10];
	private int c;
	public char addData(int rl, String na) {
		// TODO Auto-generated method stub
		for(int i=0;i<c;i++)
		{
			if( a[i].getRollno()==rl) {
				return 'n';
			}
		}
		a[c]=new Student();
		a[c].setRollno(rl);
		a[c].setName(na);
		c++;
		
		return 'y';
		
	}
	
	public char studentcourse(int rl, Course[] c1, int no) {
		// TODO Auto-generated method stub
		for(int i=0;i<c;i++) {
			if(a[i].getRollno()==rl) {
				int len = no+a[i].getNoOfCourse();
				Course[] c2 = new Course[len];
				Course[] temp = a[i].getEnroll();
				int j;
				for(j=0;j<a[i].getNoOfCourse();j++) {
					c2[j] = new Course();
					c2[j].setId(temp[j].getId());
					c2[j].setCname(temp[j].getCname());
				}
				int k=0;
				for(;j<len;j++) {
					c2[j] = new Course();
					c2[j].setId(c1[k].getId());
					c2[j].setCname(c1[k].getCname());
					k++;
				}
				a[i].setEnroll(c2);
				a[i].setNoOfCourse(len);
				return 'y';
			}
		}
		
		return 'n';
	}
	public Student showData(int rl) {
		// TODO Auto-generated method stub
		for(int i=0;i<c;i++)
		{
			if( a[i].getRollno()==rl) {
				return a[i];
			}
		}
		return null;
		
}
	
	public Student[] showallstudent() {
		// TODO Auto-generated method stub
		return a;
	}
}