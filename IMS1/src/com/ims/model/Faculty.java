package com.ims.model;

public class Faculty {
	private int fid;
	private String fname;
	private Course course;
	public void setFID(int fid)
	{
		this.fid = fid ;
	}
	public void setFName(String fname)
	{
		this.fname = fname ;
	}
	public void setCourse(Course course)
	{
		this.course = course ;
	}
	public int getFID()
	{
		return fid ;
	}
	public String getFName()
	{
		return fname ;
	}
	public Course getCourse()
	{
		return course ;
	}
}
