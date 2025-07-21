package cource.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SetStudents {

	@Id
	private int id;
	private String StudentName;

	private String CourseName;
	private String regdate;

	private int feesPaid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	@Override
	public String toString() {
		return "SetStudents [id=" + id + ", StudentName=" + StudentName + ", CourseName=" + CourseName + ", regdate="
				+ regdate + ", feesPaid=" + feesPaid + "]";
	}

}
