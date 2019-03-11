package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
public class StudentMain {
	static Student data[] = new Student[4];
	static {
		for(int i=0;i<data.length;i++){
			data[i] = new Student();
		}
		data[0] = new Student("sekar",new int[]{35,35,35});
		data[1] = new Student(null,new int[]{11,22,33});
		data[2] = null;
		data[3] = new Student("sekar",null);
	}
	public static void main(String[] args) throws NullMarksArrayException, NullNameException, NullStudentException {
		// TODO Auto-generated method stub
		StudentReport sr = new StudentReport();
		StudentService ss = new StudentService();
		String x = null;
		for(int i=0;i<data.length;i++){
			try{
				x = sr.validate(data[i]);
				}
			catch(NullNameException e){x = "NullNameException occured";}
			catch(NullMarksArrayException e){x = "NullMarksArrayException occured";}
			catch(NullStudentException e){x = "NullStudentException occured";}
			System.out.println("GRADE =" +x);
		}
		int marks=0,names=0,object=0;
		for(int i=0;i<data.length;i++){
		 System.out.println(ss.findNumberOfNullMarks(data[i])) ;
		 names += ss.findNumberOfNullNames(data[i]) ;
		 object += ss.findNumberOfNullObjects(data[i]) ;
		}
		System.out.println("Number of objects with marks array as null :" + marks);
		System.out.println("Number of objects with name as null :" + names );
		System.out.println("Number of objects with student array as null :" + object );
		
		
	}

}
