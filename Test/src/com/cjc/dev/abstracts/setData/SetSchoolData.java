package com.cjc.dev.abstracts.setData;
import java.util.Scanner;
import com.cjc.dev.pojos.*;

public abstract class SetSchoolData extends SetTeacherData {
	Scanner sc1 = new Scanner(System.in);
	public School setSchoolData(Teacher t)
	{
		School sc = new School();
	System.out.println("Enter School Name");
	sc.setScname(sc1.next()+sc1.nextLine());
	System.out.println("Enter School Status");
	sc.setScstatus(sc1.nextBoolean());
	System.out.println("Enter School Address");
	sc.setScaddr(sc1.next()+sc1.nextLine());
	sc.setTeacher(t);


	return sc ;
	}
}
