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
	}
	
}
