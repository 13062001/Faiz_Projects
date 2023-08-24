package com.cjc.dev.abstracts.setData;
import java.util.Scanner;
import com.cjc.dev.pojos.*;
import com.cjc.dev.interfaces.*;
public abstract class SetTeacherData extends SetStudentData {
	Scanner sc = new Scanner(System.in);
	public Teacher setTeacherData(Teacher t)
	{
	System.out.println("Enter Teacher ID");
	t.setTid(sc.nextInt());

	System.out.println("Enter Teacher Name");
	t.setTname(sc.next()+sc.nextLine());

	System.out.println("Enter Teacher Mobile Number");
	t.setTmobno(sc.nextLong());

	System.out.println("Enter Teacher Status");
	t.setTstatus(sc.nextBoolean());

	System.out.println("Enter Teacher Blood Group");
	t.setTbgroup(sc.next().charAt(0));



	return t ;
	}
}
