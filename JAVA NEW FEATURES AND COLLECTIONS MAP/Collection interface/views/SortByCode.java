package com.nit.views;

import java.util.Comparator;

public class SortByCode implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getSchool_CodeNo()-
				 o2.getSchool_CodeNo();
	}

}
