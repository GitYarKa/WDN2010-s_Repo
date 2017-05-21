package com;

public class Cat extends Animal{
	protected String name;
	
	public Cat(String name, Double mass){
	this.name = name;
	super.mass = mass;
	}

	public Cat(){
		
	}
	
	public void meow() {
		System.out.println("Голубая луна");
		System.out.println("ГОЛУБАЯ");
	}
}
