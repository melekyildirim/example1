package com.melekyildirim.example1;

import com.melekyildirim.example1.model.Person;

public class Main {

	public static void main(String[] args) {
		Person melek = new Person();
		melek.setAge(25);
		melek.setName("Melek");
		melek.setSurName("Yildirim");
		System.out.println("Hello World my name is: " + melek.getName());
		System.out.println("my surname is: " + melek.getSurName());
		System.out.println("my age is: " + melek.getAge());

	}

}
