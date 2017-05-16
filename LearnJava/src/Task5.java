import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		short a, b;
		char buf;
		System.out.println("Введите 2 неотрицательных числа так, чтобы второе было больше первого. Программа выведет все символы в указанном промежутке");
		a = scan.nextShort();
		b = scan.nextShort();
		if ((a > b) || (a<0) || (b<0))
			System.out.println("Ошибка");
		else
			for (int i = a; i < b; i++)
			{
				buf = (char) i;
				System.out.println(buf);
			}
		scan.close();
	}
}