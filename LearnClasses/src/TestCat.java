import com.Cat;


public class TestCat {

	public static void main(String[] args) {
		Cat sasha = new Cat();
		sasha.init("Саша", "Кошка", "серая", 8);
		sasha.meow();
		System.out.println(sasha.getDescription());
	}

}
