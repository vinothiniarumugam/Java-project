package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {
	public String findGrade(Student studentObject){
		int sum=0,i;
		for(i=0;i<studentObject.getMarks().length;i++){
			if(studentObject.getMarks()[i] < 35){
				return "F";
			}
			else{
				sum += studentObject.getMarks()[i];
			}
		}
		if(sum <= 150){
			return "D";
		}
		else if(sum > 150 && sum <= 200){
			return "C";
		}
		else if(sum > 200 && sum <= 250){
			return "B";
		}
		else{
			return "A";
		}
		
	}
	public String validate(Student studentObject)throws NullMarksArrayException,NullNameException,NullStudentException{
		if(studentObject == null){
			throw new NullStudentException();
		}
		else{
		if(studentObject.getName()==null){
			throw new NullNameException() ;
		}
		else if(studentObject.getMarks()==null){
			throw new NullMarksArrayException() ;
		}
		
		else{
			return this.findGrade(studentObject);
		}
		}
	}
	
}
