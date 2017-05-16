package com;

public class Player {
	private String name;
	private Computer comp;
	private String genres;
	
	public void init(String name, Computer comp, String genres) {
		this.name = name;
		this.comp = comp;
		this.genres = genres;
	}
	public void willplay(Videogame game) {
		int yc = comp.getYear();
		int yg = game.getYear();
		if (yg-yc-5>0)
			System.out.println("Игра не пойдет на компьютере игрока " + name);
		else if (genres.indexOf(game.getGenre()) == -1)
			System.out.println("Игроку " + name + " не нравятся игры жанра " + game.getGenre());
			else System.out.println("Игрок " + name + " будет играть в игру " + game.getName());
	}
}
