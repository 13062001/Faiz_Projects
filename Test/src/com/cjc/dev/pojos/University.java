package com.cjc.dev.pojos;

public class University {
	int uid;
	boolean ustatus;
	long uno;
	String uaddr;
	College clg;

	public	void	setUstatus(boolean ustatus)
	{
	this.ustatus = ustatus ;
	}

	public	void	setUid(int uid)
	{
	this.uid = uid ;
	}
	public	void	setUno(long uno)
	{
	this.uno = uno ;
	}
	public	void	setUaddr(String uaddr)
	{
	this.uaddr = uaddr ;
	}
	public	void	setCollege(College clg)
	{
	this.clg = clg ;
	}
	public	Boolean	getUstatus()
	{

	 return 	 ustatus ;
	}
	public	int	getUid()
	{

	 return 	uid  ;
	}
	public	long	getUno()
	{

	 return 	uno  ;
	}
	public	String	getUaddr()
	{

	 return 	uaddr  ;
	}
	public	College	getCollege()
	{

	 return 	clg  ;
	}

}
