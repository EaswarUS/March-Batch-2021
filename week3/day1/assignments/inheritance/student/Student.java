package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void StudentName() {
		System.out.println("Easwar.U.S");
		
	}
	public void studentId() {
		System.out.println("963514114011");
		
	}
	public void studentDept() {
         System.out.println("Mechanical");
	}
	
	public static void main(String[] args) {
		Student college = new Student();
		  college.collegeName();
		  college.collegeCode();
		  college.collegeRank();
		  college.departmentName();
		  college.StudentName();
		  college.studentId();
		  college.studentDept();
		
	}

}
