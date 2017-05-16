
public class LearnStrings {

	public static void main(String[] args) {
		String s = "Доброе утро страна!";
		int num = 0, buf = 0;
		while (s.indexOf('о', buf) != -1)
		{
			if (s.indexOf('о', buf) != -1)
				{
					num++;
					buf = s.indexOf('о', buf)+1;

				}
		}

		System.out.println(num);
		
		String[] words = s.split(" ");
		System.out.println(words[1]);
	}
	
}
