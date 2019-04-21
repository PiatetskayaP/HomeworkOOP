package com.bigmir.piatetskaya.polina;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Group groupOne = new Group();
		groupOne.addStudent();
		groupOne.addStudent();
		groupOne.addStudent();
		groupOne.addStudent();
		System.out.println(groupOne.toString());

		groupOne.sort();

		System.out.println(groupOne.toString());

		System.out.println(Arrays.toString(groupOne.recruiters()));
	}

}
