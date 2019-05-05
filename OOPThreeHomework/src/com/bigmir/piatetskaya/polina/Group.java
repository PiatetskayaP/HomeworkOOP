package com.bigmir.piatetskaya.polina;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voencom {
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

	public boolean checkSpace() {
		boolean free = false;
		try {
			for (int i = 0; i < gr.length; i++) {
				if (gr[i] == null) {
					free = true;
				}
			}
			if (free == false) {
				throw new NoFreeSpaceException("¬ группе уже нет свободных мест");
			}
		} catch (NoFreeSpaceException e) {
			System.out.println(e.getUserMessage());
		}
		return free;
	}

	public Student studentScanner() {
		Scanner sc = new Scanner(System.in);
		Student stOne = new Student();
		System.out.println("¬ведите им€ нового студента");
		stOne.setName(sc.nextLine());
		System.out.println("¬ведите фамилию нового студента");
		stOne.setSurname(sc.nextLine());
		System.out.println("¬ведите номер зачЄтки нового студента");
		stOne.setRecordBookNumber(sc.nextInt());
		System.out.println("¬ведите возраст нового студента");
		stOne.setAge(sc.nextInt());
		System.out.println("¬ведите м, если пол нового студента мужской, и ж, если пол нового студента женский");
		if (sc.nextLine().equalsIgnoreCase("ж")) {
			stOne.setSex(false);
		} else if (sc.nextLine().equalsIgnoreCase("м")) {
			stOne.setSex(true);
		}
		return stOne;
	}

	public void addStudent() {
		boolean free = checkSpace();
		if (free == true) {
			for (int j = 0; j < gr.length; j++) {
				if (gr[j] == null) {
					gr[j] = studentScanner();
					break;
				}
			}
		}
	}

	public void deleteStudent(int numb) {
		for (int i = 0; i < gr.length; i++) {
			if ((gr[i] != null) && (gr[i].getRecordBookNumber() == numb)) {
				gr[i] = null;
			}
		}
	}

	public Student findStudent(String surn) {
		for (int i = 0; i < gr.length; i++) {
			if ((gr[i] != null) && (gr[i].getSurname().equalsIgnoreCase(surn))) {
				return gr[i];
			}
		}
		return null;
	}

	public void sort() {
		Arrays.sort(gr, new Student());
	}

	@Override
	public Student[] recruiters() {
		Student[] recr = new Student[0];
		for (int i = 0; i < gr.length; i++) {
			if ((gr[i] != null) && (gr[i].getAge() > 18) && (gr[i].isSex() == true)) {
				recr = changeSize(recr, gr[i]);
			}
		}
		return recr;
	}

	public Student[] changeSize(Student[] group, Student a) {
		Student[] newGroup = new Student[group.length + 1];
		newGroup = Arrays.copyOf(group, (group.length + 1));
		newGroup[newGroup.length - 1] = a;
		return newGroup;
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
