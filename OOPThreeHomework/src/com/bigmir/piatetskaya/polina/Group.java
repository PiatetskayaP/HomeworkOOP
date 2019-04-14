package com.bigmir.piatetskaya.polina;

import java.util.Arrays;
import java.util.Scanner;

public class Group {
	private Student[] gr = new Student[10];

	public Group() {
		super();
	}

	public Group(Student[] gr) {
		super();
		this.gr = gr;
	}

	public Student[] getGr() {
		return gr;
	}

	public void setGr(Student[] gr) {
		this.gr = gr;
	}

	public void addStudent() {
		boolean free = false;
		try {
			for (int i = 0; i < gr.length; i++) {
				if (gr[i] == null) {
					free = true;
				}
			}
			if (free == false) {
				throw new NoFreeSpaceException("В группе уже нет свободных мест");
			} else {
				Scanner sc = new Scanner(System.in);
				Student stOne = new Student();
				System.out.println("Введите имя нового студента");
				stOne.setName(sc.nextLine());
				System.out.println("Введите фамилию нового студента");
				stOne.setSurname(sc.nextLine());
				System.out.println("Введите номер зачётки нового студента");
				stOne.setRecordBookNumber(sc.nextInt());
				System.out.println("Введите возраст нового студента");
				stOne.setAge(sc.nextInt());

				for (int j = 0; j < gr.length; j++) {
					if (gr[j] == null) {
						gr[j] = stOne;
						break;
					}
				}
			}
		} catch (NoFreeSpaceException e) {
			System.out.println(e.getUserMessage());
		}
	}

	public void deleteStudent() {
		Scanner scTwo = new Scanner(System.in);
		System.out.println("Введите номер студента, которого хотите удалить");
		int num = scTwo.nextInt();
		gr[num] = null;
	}

	public String findStudent() {
		String answer = "Такого студента в списке нет";
		Scanner scOne = new Scanner(System.in);
		System.out.println("Введите фамилию студента");
		String surn = scOne.nextLine();
		for (int i = 0; i < gr.length; i++) {
			if ((gr[i] != null) && (gr[i].getSurname().equalsIgnoreCase(surn))) {
				answer = "Номер студента в списке " + i;
			}
		}
		return answer;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < gr.length; i++) {
			if (gr[i] != null) {
				str = str + gr[i] + ", ";
			}
		}
		return str;
	}

}
