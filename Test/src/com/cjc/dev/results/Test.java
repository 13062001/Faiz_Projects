package com.cjc.dev.results;
import  com.cjc.dev.concrete.getdata.*;
import com.cjc.dev.pojos.*;
public class Test {
	public static void main(String args[])
	{

	/*
	 GetAllData d1= new GetAllData();
	 

	Student s = d1.setStudentData();
	
	Teacher t = new Teacher();
	t.setStudent(s);
	t = d1.setTeacherData(t);
	
	School sc =new School();
	sc.setTeacher(t);
	sc = d1.setSchoolData(sc);
	
	College c = new College();
	c.setSchool(sc);
	c = d1.setCollegeData(c);
	
	University u = new University();
	u.setCollege(c);
	u = d1.setUniversity(u);
	

	d1.getAllData(u);
	*/
		GetAllData d1= new GetAllData();
		 

		Student s = d1.setStudentData();
		
		Teacher t = new Teacher();
		t = d1.setTeacherData(s);
		
		School sc =new School();
		sc = d1.setSchoolData(t);
		
		College c = new College();
		c = d1.setCollegeData(sc);
		
		University u = new University();
		u = d1.setUniversity(c);
		

		d1.getAllData(u);
	}
}
