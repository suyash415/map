package com.tka.oct_18_Copy_1;

public class Student {
	private int studentId;
	private String studentName;
	private int mob;
	private String city;

	public Student() {

	}

	public Student(int studentId, String studentName, int mob, String city) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mob = mob;
		this.city = city;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
