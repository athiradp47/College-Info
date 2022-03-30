package org.college;

//child class
public class College {
	
	private void collegeName() {
		System.out.println("NIT");

	}
	private void collegeCode() {
		System.out.println("123");

	}
	private void collegeRank() {
		System.out.println("1st");

	}
	public static void main(String[] args) {
		College c = new College();    // Child object
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		Student s = new Student();   // 1st parent class
		s.studentName();
		s.studentDept();
		s.studentId();
		
		Hostel h = new Hostel();    // 2nd parent class
		h.hostelName();
		
		Dept d = new Dept();       // 3rd parent class
		d.deptName();
	}

}
