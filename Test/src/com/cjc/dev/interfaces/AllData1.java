package com.cjc.dev.interfaces;
import com.cjc.dev.pojos.*;
public interface AllData1 {
	/*Student setStudentData();
	Teacher setTeacherData(Teacher th);
	School setSchoolData(School sc);*/
	Student setStudentData();
	Teacher setTeacherData(Student s);
	School setSchoolData(Teacher t);
}
