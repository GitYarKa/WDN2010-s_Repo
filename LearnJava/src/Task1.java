import java.util.Scanner; 

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, abuf, bbuf;
		System.out.println("Введите 2 числа. Ответом будет то число, которое ближе к 10");
		a = scan.nextInt();
		b = scan.nextInt();
		abuf = Math.abs(a - 10);
		bbuf = Math.abs(b - 10);
		if (abuf > bbuf)
			System.out.println("Ответ: " + b);
		else
			System.out.println("Ответ: " + a);
		scan.close();
		
	}
}