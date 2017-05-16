import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Введите 3 числа. Ответом будут корни уравнения ax^2+bx+c=0 или сообщение о том, что корней нет");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if (b*b - (4*a*c) < 0)
			System.out.println("Корней нет");
		else
		{
			if (b*b - (4*a*c) == 0)
				System.out.println("Ответ: " + (-b/(2*a)));
			else
			{
				System.out.println("Ответ 1: " + ((-b + Math.sqrt(b*b - (4*a*c)))/(2*a)));
				System.out.println("Ответ 2: " + ((-b - Math.sqrt(b*b - (4*a*c)))/(2*a)));
			}
		}
		scan.close();
	}
}
