package com.dbpackage.model;

public class Student{
	int sNo;
	String sName;
	String sMajor;
	
	public Student() {
		super();
	}

	public Student(int sNo, String sName, String sMajor) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sMajor = sMajor;
		
		
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsMajor() {
		return sMajor;
	}

	public void setsMajor(String sMajor) {
		this.sMajor = sMajor;
	}
	
	

}
