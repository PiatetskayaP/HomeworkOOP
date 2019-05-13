package com.bigmir.piatetskaya.polina;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Group groupOne = new Group();
		groupOne.addStudent();
		groupOne.addStudent();
		System.out.println(groupOne.toString());

		groupOne.sort();

		BaseGroup bg = new BaseGroup();
		bg.saveGroup(groupOne, "Group");
		Group gr = new Group();
		gr = bg.readGroup("Group");

		System.out.println(gr.toString());
	}

}
