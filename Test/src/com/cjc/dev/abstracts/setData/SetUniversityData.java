package com.cjc.dev.abstracts.setData;
import java.util.Scanner;
import com.cjc.dev.pojos.College;
import com.cjc.dev.pojos.University;

public abstract class SetUniversityData extends SetCollegeData {
	Scanner sc = new Scanner(System.in);
	public University setUniversity(College clg)
	{
	University u = new University();
	System.out.println("Enter University Id");
	u.setUid(sc.nextInt());

	System.out.println("Enter University Status");
	u.setUstatus(sc.nextBoolean());

	System.out.println("Enter University Address");
	u.setUaddr(sc.next()+sc.nextLine());

	System.out.println("Enter University Mobile Number");
	u.setUno(sc.nextLong());

	u.setCollege(clg);

	return u ;

	}
}
