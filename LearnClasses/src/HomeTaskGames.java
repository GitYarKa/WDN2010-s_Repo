import com.*;

public class HomeTaskGames {

	public static void main(String[] args) {
		Videogame mario = new Videogame();
		mario.init("Super Mario Bros.", 1985, "Platformer", "Nintendo", "Nintendo", 2, "E", 8.6);
		mario.getInformation();
		System.out.println();
		Computer peka = new Computer();
		peka.init("peka", 1996);
		peka.potyanet(mario);
		System.out.println();
		Player vasya = new Player();
		vasya.init("Вася", peka, "Sports, Platformer, Shooter, MOBA");
		vasya.willplay(mario);
		secondary();
	}
	
	public static void secondary(){
		Videogame zelda = new Videogame();
		zelda.init("The Legend of Zelda: Breath of the Wild", 2017, "Action", "Nintendo", "Nintendo", 1, "T", 9.2);
		zelda.getInformation();
	}

}
