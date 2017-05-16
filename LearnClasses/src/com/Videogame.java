package com;

public class Videogame {

	private String name;
	private int year;
	private String genre;
	private String developer;
	private String publisher;
	private int playersnum;
	private String esbrRating;
	private double mcScore;
	
	
	public void init(String name, int year, String genre, String developer, String publisher, int playersnum, String esbrRating, double mcScore) {
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.developer = developer;
		this.publisher = publisher;
		this.playersnum = playersnum;
		this.esbrRating = esbrRating;
		this.mcScore = mcScore;
		System.out.println("Игра " + name + " добавлена\n");
	}

	public String getName() {
		return name;
	}
	
	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getInformation() {
		System.out.println("Название: " + name);
		System.out.println("Год выпуска: " + year);
		System.out.println("Жанр: " + genre);
		System.out.println("Разработчик: " + developer);
		System.out.println("Издатель: " + publisher);
		System.out.println("Мультиплеер: " + (playersnum > 1 ? "есть" : "нет"));
		System.out.println("Возрастной рейтинг: " + esbrRating);
		System.out.println("Рейтинг игры на Metascore: " + mcScore);
	}
	
}
