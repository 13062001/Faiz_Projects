package com.cjc.dev.abstracts.setData;
import java.util.Scanner;

import com.cjc.dev.pojos.College;
public abstract class SetCollegeData extends SetSchoolData {
	Scanner sc = new Scanner(System.in);

	public College setCollegeData(College c1)
	{
	System.out.println("Enter College Name");
	c1.setCname(sc.next()+sc.nextLine());

	System.out.println("Enter College Status");
	c1.setCstatus(sc.nextBoolean());

	System.out.println("Enter College Address");
	c1.setCaddr(sc.next()+sc.nextLine());

	System.out.println("Enter College Mobile Number");
	c1.setCno(sc.nextLong());

	return c1 ;


	} 
}
