package com.ims.client;
import com.ims.service.Cjc;
import com.ims.serviceImpl.Karvenagar;

import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Cjc k = new Karvenagar();
	Scanner sc = new Scanner(System.in);
	boolean b = true ;
System.out.println("Enter your choice\n\t1]Add Course \t2]View Course\t3]Add Faculty \t4]View Faculty\n\t5]Add Batch \t6]View Batch\t7]Add Student\t8]View Student");
	while(b)
{
System.out.print("Enter Choice :  ");
byte a = sc.nextByte();
switch(a)
{
case 1 :
	k.addCourse();
	break ;
case 2 :
	k.viewCourse();
	break ;
case 3 :
	k.addFaculty();
	break ;
case 4 :
	k.viewFaculty();
	break ;
case 5 :
	k.addBatch();
	break ;
case 6 :
	k.viewBatch();
	break ;
case 7 :
	k.addStudent();	
	break ;
case 8 :
	k.viewStudent();
	break ;
default :
	b = false ;
	System.out.println(" Exit ") ;
	break ;
}
	
}
}
}
	