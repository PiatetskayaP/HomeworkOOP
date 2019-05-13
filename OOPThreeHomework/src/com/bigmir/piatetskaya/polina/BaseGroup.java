package com.bigmir.piatetskaya.polina;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BaseGroup {
	
	public BaseGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void saveGroup(Group group, String file) {
		try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(file))) {
			OOS.writeObject(group);
		} catch (IOException e) {
			System.out.println("Невозможно записать группу");
		}
	}

	public Group readGroup(String file) {
		Group grOne = new Group();
		try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(file))) {
			grOne = (Group) OIS.readObject();
		} catch (IOException e) {
			System.out.println("Невозможно загрузить группу");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grOne;
	}
	
	
}
