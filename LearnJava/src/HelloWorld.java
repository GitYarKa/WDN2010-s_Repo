
public class HelloWorld {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				a[i][j] = (int) (Math.random()*100);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
			
		}
		int num = (int) ((Math.random()*100));
		int f=0;
		System.out.println("Число, которое нужно найти: " + num);
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				if (a[i][j] == num)
					{
					System.out.println("Строка "+(i+1)+" Столбец "+(j+1));
					f = 1;
					}
			}
		}
		if (f == 0)
			System.out.println("Такого числа в матрице нет");
	}
}