package com.nit.views;

public class Student implements Comparable<Student> {
private String name;
private int id;
private int school_CodeNo;
public Student(String name, int id, int school_CodeNo) {
	super();
	this.name = name;
	this.id = id;
	this.school_CodeNo = school_CodeNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSchool_CodeNo() {
	return school_CodeNo;
}
public void setSchool_CodeNo(int school_CodeNo) {
	this.school_CodeNo = school_CodeNo;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", school_CodeNo=" + school_CodeNo + "]";
}
@Override
public int compareTo(Student o) {
	return this.getName().compareTo(o.getName());
}

}
