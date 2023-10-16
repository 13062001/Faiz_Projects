package com.bms.client;

import java.util.Scanner;

import com.bms.exception.AccNoException;
import com.bms.service.RBI;
import com.bms.serviceImpl.SBI;
public class Test
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in) ;
RBI ba = new SBI();
System.out.println("Choose the Option\n1]Create Account\n2]Display All Details\n3]Deposit Money\n4]Withdraw Money\n5]Check Balance");
boolean b = true ;
while(b)
{
System.out.print("Enter Choice :  ");
byte a = sc.nextByte();
switch(a)
{
case 1 :
	try {
	ba.createAccount() ;
	}
	catch(AccNoException e)
	{
		a=1 ;
	}
	break ;
case 2 :
	ba.displayAllDetails() ;
	break ;
case 3 :
	ba.depositeMoney() ;
	break ;
case 4 :

	ba.withdrawal() ;
	break ;
case 5 :
	ba.balanceCheck() ;
	break ;
default :
	b = false ;
	System.out.println(" Wrong Input ") ;
	break ;
}
}

}
}
