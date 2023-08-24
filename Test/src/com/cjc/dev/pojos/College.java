package com.cjc.dev.pojos;

public class College {
	boolean cstatus;
	String cname;
	long cno;
	String caddr;
	School sch;
	public	void	setCstatus(boolean cstatus)
	{
	this.cstatus = cstatus ;
	}
	public	void	setCname(String cname)
	{
	this.cname = cname ;
	}
	public	void	setCno(long cno)
	{
	this.cno = cno ;
	}
	public	void	setCaddr(String caddr)
	{
	this.caddr = caddr ;
	}
	public	void	setSchool(School sch)
	{
	this.sch = sch ;
	}
	public	Boolean	getCstatus()
	{

	 return 	 cstatus ;
	}
	public	String	getCname()
	{

	 return 	cname  ;
	}
	public	long	getCno()
	{

	 return 	cno  ;
	}
	public	String	getCaddr()
	{

	 return 	caddr  ;
	}
	public	School	getSchool()
	{

	 return 	sch  ;
	}


}
