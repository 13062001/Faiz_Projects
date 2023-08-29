package com.cjc.dev.interfaces;
import com.cjc.dev.pojos.*;
public interface AllData2 extends AllData1 {
	/*College setCollegeData(College c);
	University setUniversity(University u);
	University getAllData(University u);*/
	College setCollegeData(School sc);
	University setUniversity(College clg);
	University getAllData(University u);
}
