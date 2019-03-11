package com.mile1.bean;

import java.util.Arrays;

public class Student {
	String name;
	int[] marks = new int[3];
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
}
