
public class Task43 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				if (i==0 && j==0)
					a[i][j] = (int) (Math.random()*10);
				else if (j==0)
					a[i][j] = (int) (Math.random()*10) + a[i-1][4];
				else a[i][j] = (int) (Math.random()*10) + a[i][j-1];
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
			
		}
		int jr = (int) ((Math.random()*4));
		int ir = (int) ((Math.random()*4));
		int num = a[ir][jr];
		System.out.println("Число, которое нужно найти: " + num);
		
		int i,j,f = 0,posmin=0,posmax=24,pos = 12, steps = 1;
		while(f==0) {
			i = pos/5;
			j = pos%5;
			if (a[i][j] == num) {
				System.out.println("Строка "+(i+1)+" Столбец "+(j+1));
				System.out.println("Количество шагов: " + steps);
				f=1;
			}
			else if (a[i][j] > num) {
				{
					posmax = pos;
					pos = (pos + posmin)/2;
					steps++;
				}
			}
			else if (a[i][j] < num) {
				posmin = pos;
				pos = (pos + posmax)/2;
				steps++;
				}				
		}
	}
}