package birthday;

import java.util.Scanner;

public class DOB {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Month,Day And Year of your Birthday");
	System.out.print("Day");
	byte a = sc.nextByte();
	System.out.print("Month");
	byte b = sc.nextByte();
	System.out.print("Year");
	int c = sc.nextInt();
	if(b>0 && b<13)
	{
		if(a>0 && a<31)
		{
			if(b==2)
			{
				if(c%4==0)
				{
				if(a>=1 && a<=29)
				{
				System.out.println(a+"\\"+b+"\\"+c);
				}
				}
				else
				{
				if(a>=1 && a<=28)
				{
				System.out.println(a+"\\"+b+"\\"+c);
				}
				}
			}

			else if(b==1||b==3||b==5||b==7||b==8||b==10||b==12)
			{
			if(a>=1 && a<=31)
			{
			System.out.println(a+"\\"+b+"\\"+c);
			}
			}


			else if(b==4||b==6||b==9||b==11)
			{
			if(a>=1 && a<=31)
			{
			System.out.println(a+"\\"+b+"\\"+c);
			}
			}


			else
			{
			System.out.println("Invalid Birth Date");
			}
			}
			
		}
		else
		{
		System.out.println("Invalid Day");
		}
	
	
	}
}
