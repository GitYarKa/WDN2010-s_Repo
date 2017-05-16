import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dec;
		short ibuf;
		char cbuf = 0;
		String hex = "";
		System.out.println("Введите число. Ответом будет это число в 16-ричной системе счисления");
		dec = scan.nextInt();
		if (dec == 0)
			System.out.println("Ответ: 0");
		else
			while (dec > 0)
			{
				ibuf = (short) (dec % 16);
				if ((ibuf >= 10) && (ibuf <=15))
					switch (ibuf)
					{
					case 10:
						cbuf = 'A';
						break;
					case 11:
						cbuf = 'B';
						break;
					case 12:
						cbuf = 'C';
						break;
					case 13:
						cbuf = 'D';
						break;
					case 14:
						cbuf = 'E';
						break;
					case 15:
						cbuf = 'F';
						break;
					}			
				else
					cbuf = (char) (ibuf + 48); //48 - знак 0 в ASCII
				hex = cbuf + hex;
				dec = dec / 16;
			}
		System.out.println("Ответ: " + hex);
		scan.close();
	}
}
