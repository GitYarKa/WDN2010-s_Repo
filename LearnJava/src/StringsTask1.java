
public class StringsTask1 {

	public static void main(String[] args) {
		String str=new String ("Жила-была коза с козлятами. Уходила коза в лес есть траву шелковую, пить воду студеную. Как только уйдет - козлятки запрут избушку и сами никуда не выходят. Воротится коза, постучится в дверь и запоет: - Козлятки, ребятушки! Отопритеся, отворитеся! Ваша мать пришла - молока принесла; Бежит молоко по вымечку, Из вымечку по копытеччку, Из копытеччку во сыру землю! Козлятки отопрут дверь и впустят мать. Она их покормит, напоит и опять уйдет в лес, козлятки запрутся крепко-накрепко. Волк подслушал, как поет коза. Вот раз коза ушла, волк побежал к избушке и закричал толстым голоском: - Вы, детушки! Вы козлятки! Отопритеся, Отворитеся! Ваша мать пришла, Молока принесла. Полны копытца водицы!");
		str=str.toLowerCase(); 
		String tmp=new String();
			tmp = str.replace(".", ""); 
			str = tmp;
			tmp = str.replace(",", ""); 
			str = tmp;
			tmp = str.replace(":", ""); 
			str = tmp;
			tmp = str.replace("-", " "); 
			str = tmp;
			tmp = str.replace("!", "");
			str = tmp;
			tmp = str.replace(";", ""); 
			str = tmp;
			tmp = str.replace("  ", " "); 
			str = tmp;
			System.out.println(str);
			
		String[] strParts;
		strParts = str.split(" ");
		for (int n=0; n<strParts.length;n++){
			strParts[n].trim(); 
		}
		
		for (int i=0; i<strParts.length;i++){
			int sum=0;
			if (strParts[i]!=" "){
				System.out.print(strParts[i]+":"); 
				int k=0;
				int[] number=new int[104]; 
				for(int j=0;j<strParts.length;j++){
					if (strParts[i].equals(strParts[j]))
					{ 
						sum=sum+1; 
						number[k]=j;
						k++;
					}
				}
				
				System.out.print(sum);
				System.out.println();
				for (k=0;k<104;k ++) 
				{
					strParts[number[k]]=" ";
				} 
			}
			
		}

		
		
	}


	}


