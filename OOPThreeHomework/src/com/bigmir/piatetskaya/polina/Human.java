package com.bigmir.piatetskaya.polina;

import java.util.Comparator;

public class Human implements Comparator {
	private String Name;
	private String Surname;
	private int age;
	private boolean sex;

	public Human() {
		super();
	}

	public Human(String name, String surname, int age, boolean sex) {
		super();
		Name = name;
		Surname = surname;
		this.age = age;
		this.sex = sex;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
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
	public int compare(Object o1, Object o2) {
		if (o1 != null && o2 == null) {
			return 1;
		} else if (o1 == null && o2 != null) {
			return -1;
		} else if (o1 == null && o2 == null) {
			return 0;
		}

		Human humA = (Human) o1;
		Human humB = (Human) o2;
		return humA.getSurname().compareTo(humB.getSurname());
	}

	@Override
	public String toString() {
		return ", Name=" + Name + ", Surname=" + Surname + ", age=" + age + ", sex=" + sex + "]";
	}

}
