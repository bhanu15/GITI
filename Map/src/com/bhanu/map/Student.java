package com.bhanu.map;

public class Student implements Comparable<Student> {

	int marks;
	public Student(int marks) {
		this.marks = marks;
	}
	public int compareTo(Student student){
		System.out.println("test");
		return new Integer(marks).compareTo(student.marks);
	}
	
	public String toString(){
		return "Marks "+ marks;
	}
	
}
