package com.bms.serviceImpl;

import com.bms.exception.AadharNoException;
import com.bms.exception.AccNoException;
import com.bms.exception.AgeException;
import com.bms.exception.BalanceException;
import com.bms.exception.GenderException;
import com.bms.exception.MobNoException;
import com.bms.jdbc.JDBC;
import com.bms.model.Account;
import com.bms.model.Address;
import com.bms.service.RBI;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
	public void InsertData(Account a)
	{
		Connection con = JDBC.getConn();
		String s = "insert into bankaccount values("+a.getAccNo()+",'"+a.getName()+"',"+a.getAge()+","+a.getMobNo()+",'"+a.getGender()+"',"+a.getAdharNo()+","+a.getBalance()+");";
		String s1 = "insert into address values("+a.getAdharNo()+",'"+a.getA().getCountry()+"','"+a.getA().getState()+"','"+a.getA().getRegion()+"','"+a.getA().getArea()+"',"+a.getA().getPincode()+");";
		try {
			Statement smt = con.createStatement();
			smt.execute(s1);
			smt.execute(s);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public boolean AccNo(Account a) {
		System.out.println("Enter Account Number");
		int b = sc.nextInt();
		if (Integer.toString(b).length() == 8) {
			a.setAccNo(b);
			return false;
		} else
			throw new AccNoException("Invalid Account Number");
	}
	public boolean MobNo(Account a) {
		System.out.println("Enter Account Holder's Mobile Number");
		long b = sc.nextLong();
		if (Long.toString(b).length() == 10) {
			a.setMobNo(b);
			return false;
		} else
			throw new MobNoException("Invalid Mobile Number");
	}
	public boolean AadhNo(Account a) {
		System.out.println("Enter Account Holder's Aadhar Number");
		long b = sc.nextLong();
		if (Long.toString(b).length() == 12) {
			a.setAdharNo(b);
			return false ;
		} else
			throw new AadharNoException("Invalid Aadhar Number");
	}
	public boolean Age(Account a) {
		System.out.println("Enter  Account Holder's Age");
		byte b = sc.nextByte();
		if (b>=18) {
			a.setAge(b);
			return false;
		} else
			throw new AgeException("Invalid Age");
	}
	public boolean Balance(Account a) {
		System.out.println("Enter  Account Holder's Initial Amount");
		double b = sc.nextDouble();
		if (b >= 2000) {
			a.setBalance(b);
			return false ;
		} else
			throw new BalanceException("Amount Should be Greater Then 1000");
	}
	public boolean Gender(Account a) {
		System.out.println("Enter Account Holder's Gender");
		String gen=sc.next();
		if(gen.equalsIgnoreCase("male")||gen.equalsIgnoreCase("female"))
				{
				a.setGender(gen);
			return false ;
		} else
			throw new GenderException("Invalid Gender");
	}

	
	@Override
	public void createAccount() {
		Account a = new Account();
		boolean c1 = true;
		while (c1) {
				c1 = AccNo(a);
		}

		System.out.println("Enter Account Holder's Name");
		a.setName(sc.next() + sc.nextLine());
		boolean c2 = true;
		while (c2) {
				c2 = MobNo(a);	
		}

			boolean c3 = true;
			while (c3) {
					c3 = AadhNo(a);
			}

		
		boolean c4 = true;
		while (c4) {
				c4 = Age(a);
		}
		boolean c5 = true;
		while (c5) {
				c5 = Gender(a);
					}
		boolean c6 = true;
		while (c6) {
				c6 = Balance(a);
					}
		Address ad = new Address();
		System.out.println("Enter Account Holder's Address");
		System.out.print("Nationality");
		ad.setCountry(sc.next()+sc.nextLine());
		System.out.print("State");
		ad.setState(sc.next()+sc.nextLine());
		System.out.print("Region");
		ad.setRegion(sc.next()+sc.nextLine());
		System.out.print("Area");
		ad.setArea(sc.next()+sc.nextLine());
		System.out.print("Pin-Code");
		ad.setPincode(sc.nextInt());
		a.setA(ad);
		InsertData(a);
	}

	@Override
	public void displayAllDetails() {
		String s = "select * from bankaccount;" ;
		
		try {
			ResultSet rs = JDBC.getConn().createStatement().executeQuery(s);
			while(rs.next())
			{
				System.out.println("Enter Account Holder's Account Number");
				int accNo = sc.nextInt();
				if(rs.getInt(1)==accNo)
				{
					System.out.println("Account Holder's Account Number : "+rs.getInt(1));
					System.out.println("Account Holder's Name : "+rs.getString(2));
					System.out.println("Account Holder's Age : "+rs.getByte(3));
					System.out.println("Account Holder's Mobile Number : "+rs.getLong(4));
					System.out.println("Account Holder's Gender : "+rs.getString(5));
					System.out.println("Account Holder's Aadhar Number : "+rs.getLong(6));
					System.out.println("Account Holder's Balance : "+rs.getDouble(7));
					String s1 = "select * from address where AadhNo="+rs.getLong(6)+";" ;
					ResultSet rs1 = JDBC.getConn().createStatement().executeQuery(s1);
					if(rs1.next())
					{
							System.out.println("Account Holder's Address");
							System.out.println("Nationality : "+rs1.getString(2));
							System.out.println("State : "+rs1.getString(3));
							System.out.println("Region : "+rs1.getString(4));
							System.out.println("Area : "+rs1.getString(5));
							System.out.println("Pin-Code : "+rs1.getInt(6));
					}
					}
//				else
//					throw new AccNoException("Invalid Account Number");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void depositeMoney() {
		String s = "select * from bankaccount" ;
		try {
			ResultSet rs = JDBC.getConn().createStatement().executeQuery(s);
			while(rs.next())
			{
				System.out.println("Enter Account Holder's Account Number");
				int accNo = sc.nextInt();
				if(rs.getInt(1)==accNo)
				{
					System.out.println("Enter The Amount You Want To Credit");
					double l = sc.nextDouble();
					l=l+rs.getDouble(7);
					String s1="update bankaccount set Balance=? where AccNo=? ;";
					PreparedStatement ps = JDBC.getConn().prepareStatement(s1);
					ps.setDouble(1, l);
					ps.setInt(2, accNo);
					ps.execute();
				}
//				else
//					throw new AccNoException("Invalid Account Number");	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void withdrawal() {
		String s = "select * from bankaccount" ;
		try {
			ResultSet rs = JDBC.getConn().createStatement().executeQuery(s);
			while(rs.next())
			{
				System.out.println("Enter Account Holder's Account Number");
				int accNo = sc.nextInt();
				if(rs.getInt(1)==accNo)
				{
					System.out.println("Enter The Amount You Want To Debit");
					double l = sc.nextDouble();
					l=rs.getDouble(7)-l;
					if(l>=2000)
					{
					String s1="update bankaccount set Balance=? where AccNo=? ;";
					PreparedStatement ps = JDBC.getConn().prepareStatement(s1);
					ps.setDouble(1, l);
					ps.setInt(2, accNo);
					ps.execute();
					}
					else
					{
						throw new BalanceException("Insuffient Balance");
					}
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void balanceCheck() {
		String s = "select * from bankaccount" ;
		try {
			ResultSet rs = JDBC.getConn().createStatement().executeQuery(s);
			while(rs.next())
			{
				System.out.println("Enter Account Holder's Account Number");
				int accNo = sc.nextInt();
				if(rs.getInt(1)==accNo)
				{
					System.out.println("Account Holder's Account Number : "+rs.getInt(1));
					System.out.println("Account Holder's Available Balance is : "+rs.getDouble(7));
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
