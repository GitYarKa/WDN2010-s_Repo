package com;

public class Computer {
	private String name;
	private int year;
	
	public int getYear() {
		return year;
	}
	public void init(String name, int year) {
		this.name = name;
		this.year = year;
		System.out.println("Компьютер добавлен\n");
	}
	public void potyanet(Videogame game) {
		int y = game.getYear();
		System.out.println(y-year-5<0?("Игра " + game.getName() + " пойдет на компьютере " + name ):("Игра " + game.getName() + " не пойдет на компьютере " + name ));
	}
}
