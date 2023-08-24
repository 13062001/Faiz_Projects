package com.cjc.dev.concrete.getdata;

import com.cjc.dev.pojos.* ;
import com.cjc.dev.abstracts.setData.*;
public class GetAllData extends SetUniversityData {

	public University getAllData(University u)
	{
	System.out.println(u.getUid());
	System.out.println(u.getUstatus());
	System.out.println(u.getUno());
	System.out.println(u.getUaddr());
	System.out.println(u.getCollege().getCstatus());
	System.out.println(u.getCollege().getCno());
	System.out.println(u.getCollege().getCaddr());
	System.out.println(u.getCollege().getSchool().getScname());
	System.out.println(u.getCollege().getSchool().getScaddr());
	System.out.println(u.getCollege().getSchool().getScstatus());
	System.out.println(u.getCollege().getSchool().getTeacher().getTid());
	System.out.println(u.getCollege().getSchool().getTeacher().getTname());
	System.out.println(u.getCollege().getSchool().getTeacher().getTmobno());
	System.out.println(u.getCollege().getSchool().getTeacher().getTstatus());
	System.out.println(u.getCollege().getSchool().getTeacher().getTbgroup());
	System.out.println(u.getCollege().getSchool().getTeacher().getStudent().getSid());
	System.out.println(u.getCollege().getSchool().getTeacher().getStudent().getSname());
	System.out.println(u.getCollege().getSchool().getTeacher().getStudent().getSaddr());
	System.out.println(u.getCollege().getSchool().getTeacher().getStudent().getSbgroup());
	System.out.println(u.getCollege().getSchool().getTeacher().getStudent().getSmobno());
	System.out.println(u.getCollege().getSchool().getTeacher().getStudent().getSstatus());

	return u;
	}

}
