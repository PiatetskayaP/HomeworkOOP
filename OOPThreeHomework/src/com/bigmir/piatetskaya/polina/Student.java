package com.bigmir.piatetskaya.polina;

public class Student extends Human {
	private int recordBookNumber;

	public Student() {
		super();
	}

	public Student(String name, String surname, int age, boolean sex, int recordBookNumber) {
		super(name, surname, age, sex);
		this.recordBookNumber = recordBookNumber;
	}

	public int getRecordBookNumber() {
		return recordBookNumber;
	}

	public void setRecordBookNumber(int recordBookNumber) {
		this.recordBookNumber = recordBookNumber;
	}

	@Override
	public String toString() {
		return "Student [recordBookNumber=" + recordBookNumber + super.toString();
	}

}
