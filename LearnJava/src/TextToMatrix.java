public class TextToMatrix {

	public static void main(String[] args) {
		String text = "Нет в доме кошек, кроме меня…\nСладко тянусь на упругом ложе…\nВ хищных глазах убавлю огня -\nНирвана… Мой Боже!\n\nОн - за порог, и - сразу\nГрязну в любимый порок -\nНет, не ню и не стразы –\nИ даже не черный чулок -\n\nБелая чашка квадратом,\nЧерный кофе со сливками,\nВ молекулах каждый атом\nРождает свои улыбки.\n\nСмакую, предвижу строчки\nИ, набираясь отваги,\nВ мятой ночной сорочке\nТянусь к перу и бумаге…";
		int n=0,prob=0,maxprob=0;
		for (int i = 0;i<text.length();i++)
		{
			if (text.charAt(i)==' ')
					prob++;
			if (text.charAt(i)=='\n')
				{
					n++;
					if (prob>maxprob)
						maxprob = prob;
					prob = 0;
				}

		}
		String[][] words = new String[n+1][maxprob];
		String[] stroki = text.split("\n");
		for (int i=0; i<stroki.length;i++)
				words[i] = stroki[i].split(" ");
		for (int i=0; i<stroki.length; i++)
			{
			for (int j=0; j<words[i].length; j++)
				System.out.print(words[i][j]+" ");
			System.out.println();
			}
		System.out.println();
		for (int i=0; i<stroki.length; i++)
		{
		for (int j=0; j<words[i].length; j++)
			if (words[i][j].indexOf("а") != -1)
				System.out.print(words[i][j]+" ");
		}
	}

}
