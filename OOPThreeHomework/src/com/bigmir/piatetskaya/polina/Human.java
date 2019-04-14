package com.bigmir.piatetskaya.polina;

public class Human {
	private String Name;
	private String Surname;
	private int age;

	public Human() {
		super();
	}

	public Human(String name, String surname, int age) {
		super();
		Name = name;
		Surname = surname;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return ", Name=" + Name + ", Surname=" + Surname + ", age=" + age + "]";
	}

}
