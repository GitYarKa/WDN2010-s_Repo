package com;

public class Cat {

	private String name;
	private String sex;
	private String color;
	private int age;
	
	public static void meow() {
		System.out.println("МЯУ");
	}
	public void init(String name, String sex, String color, int age) {
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.age = age;
		System.out.println("Я родился!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		if (sex == "Кот")
			return "Я кот и меня зовут " + name;
		else
			return "Я кошка и меня зовут " + name;
	}
}
