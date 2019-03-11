package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarks(Student data){
	

			
				return data.getMarks()==null?1:0;
			
			//return 0;
		}
		
		//return count;
	
	public int findNumberOfNullNames(Student data){
		
			//if(data.getName()==null){
				return 1;
			//}
		
		//return 0;
	}
	
	public int findNumberOfNullObjects(Student data){
			if(data== null){
				return 1;
			}
		
		return 0;
	}
}
