package com.cjc.dev.abstracts.setData;
import java.util.Scanner;
import com.cjc.dev.pojos.*;
import com.cjc.dev.interfaces.*;
public abstract class SetStudentData implements AllData2 {
	Scanner sc = new Scanner(System.in);
	public Student setStudentData()
	{
	Student s = new Student();
	System.out.println("Enter Student ID");
	s.setSid(sc.nextInt());
	System.out.println("Enter Student Name");
	s.setSname(sc.next()+sc.nextLine());
	System.out.println("Enter Student Mobile Number");
	s.setSmobno(sc.nextLong());
	System.out.println("Enter Student Status");
	s.setSstatus(sc.nextBoolean());
	System.out.println("Enter Student Blood Group");
	s.setSbgroup(sc.next().charAt(0));
	System.out.println("Enter Student Address");
	s.setSaddr(sc.next()+sc.nextLine());

	return s ;
	}
}
