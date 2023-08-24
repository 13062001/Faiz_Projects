package com.cjc.dev.pojos;

public class Teacher {
	int tid;
	long tmobno;
	String tname;
	char tbgroup;
	boolean tstatus;
	Student st;
	public	void	setTid(int tid)
	{
	this.tid = tid ;
	}
	public	void	setTmobno(long tmobno)
	{
	this.tmobno = tmobno ;
	}
	public	void	setTname(String tname)
	{
	this.tname = tname ;
	}
	public	void	setTbgroup(char tbgroup)
	{
	this.tbgroup = tbgroup ;
	}
	public	void	setTstatus(boolean tstatus)
	{
	this.tstatus = tstatus ;
	}
	public	void	setStudent(Student st)
	{
	this.st = st ;
	}
	public	int	getTid()
	{

	 return 	tid  ;
	}
	public	long	getTmobno()
	{

	 return 	  tmobno;
	}
	public	String	getTname()
	{

	 return 	 tname ;
	}
	public	char	getTbgroup()
	{

	 return 	 tbgroup ;
	}
	public	boolean	getTstatus()
	{

	 return 	  tstatus;
	}
	public	Student	getStudent()
	{

	 return 	  st ;
	}


}
