package com.cjc.dev.pojos;

public class Student {
	int sid;
	String sname;
	long smobno;
	boolean sstatus;
	char sbgroup;
	String saddr;
	public	void	setSid(int sid)
	{
	this.sid=sid;
	}
	public	void	setSname(String sname)
	{
	this.sname=sname;
	}
	public	void	setSmobno(long smobno)
	{
	this.smobno=smobno;
	}
	public	void	setSstatus(boolean sstatus)
	{
	this.sstatus=sstatus;
	}
	public	void	setSbgroup(char sbgroup)
	{
	this.sbgroup=sbgroup;
	}
	public	void	setSaddr(String saddr)
	{
	this.saddr=saddr;
	}
	public	int	getSid()
	{

	 return 	 sid ;
	}
	public	String	getSname()
	{

	 return 	sname  ;
	}
	public	long	getSmobno()
	{

	 return 	  smobno ;
	}
	public	boolean	getSstatus()
	{

	 return 	 sstatus ;
	}
	public	char	getSbgroup()
	{

	 return 	  sbgroup;
	}
	public	String	getSaddr()
	{

	 return 	 saddr ;
	}



}
