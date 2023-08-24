package com.cjc.dev.pojos;

public class School {
	String scname;
	boolean scstatus;
	String scaddr;
	Teacher th;
	public	void	setScname(String scname)
	{
	this.scname = scname ;
	}
	public	void	setScstatus(boolean scstatus)
	{
	this.scstatus = scstatus ;
	}
	public	void	setScaddr(String scaddr)
	{
	this.scaddr = scaddr ;
	}
	public	void	setTeacher(Teacher th)
	{
	this.th = th ;
	}
	public	String	getScname()
	{

	 return 	 scname ;
	}
	public	boolean	getScstatus()
	{

	 return 	 scstatus ;
	}
	public	String	getScaddr()
	{

	 return 	 scaddr ;
	}
	public	Teacher	getTeacher()
	{

	 return 	 th ;
	}


}
