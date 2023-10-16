package com.bms.model;

public class Account {
	private int accNo;
	private String name ;
	private long mobNo ;
	private long adharNo ;
	private String gender ;
	private byte age ;
	private double balance ;
	private Address a;
	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public void setAccNo(int accNo)
	{
	this.accNo = accNo ;
	}

	public void setName(String name)
	{
	this.name = name ;
	}

	public void setMobNo(long mobNo)
	{
	this.mobNo = mobNo ;
	}

	public void setAdharNo(long adharNo)
	{
	this.adharNo = adharNo ;
	}

	public void setGender(String gender)
	{
	this.gender = gender ;
	}

	public void setAge(byte age)
	{
	this.age = age ;
	}

	public void setBalance(double balance)
	{
	this.balance = balance ;
	}


	public int getAccNo()
	{
	return accNo ;
	}

	public String getName()
	{
	return name ;
	}

	public long getMobNo()
	{
	return mobNo ;
	}

	public long getAdharNo()
	{
	return adharNo ;
	}

	public String getGender()
	{
	return gender ;
	}

	public byte getAge()
	{
	return age ;
	}

	public double getBalance()
	{
	return balance ;
	}

	}

