package com.cjc.dev.abstracts.setData;
import java.util.Scanner;

import com.cjc.dev.pojos.College;
import com.cjc.dev.pojos.School;
public abstract class SetCollegeData extends SetSchoolData {
	Scanner sc = new Scanner(System.in);

	public College setCollegeData(School sc1)
	{
		College c1 = new College();
	System.out.println("Enter College Name");
	c1.setCname(sc.next()+sc.nextLine());

	System.out.println("Enter College Status");
	c1.setCstatus(sc.nextBoolean());

	System.out.println("Enter College Address");
	c1.setCaddr(sc.next()+sc.nextLine());

	System.out.println("Enter College Mobile Number");
	c1.setCno(sc.nextLong());
	
	c1.setSchool(sc1);
	
	return c1 ;


	} 
}
