
public class StringsTask2 {

	public static void main(String[] args) {
		String str=new String("1. <HTML> <HEAD> 2. <TITLE>Управление разрывом строк </Title> 3. </HEAD>	4. <BODY> 5. <marquee>Это моя учебная  страница.</marquee> 6. <H2>Меня зовут <kbd>Ольга. </kbd></H2> 7. <H3 align=center>Я живу во <em>Владивостоке</em>. </H3> 8.  <H4 align=right> Моя маленькая родина -  <font face=Academy color=Red>Сахалин</font>. </H4> 9. <H5 align=left>ДВГУ - ВУЗ в котором я работаю.</H5> 10. <B>Здесь</B> 11. <I>продемонстрированы</I> 12. <Blink>различные</Blink> 13. <U> способы </U> 14. <KBD>управления </KBD> 15. <FONT SIZE=5 COLOR=FF80C0>шрифтом:</FONT>  его  16. <FONT SIZE=5 COLOR=FF00FF>цветом</FONT> и 17. <FONT SIZE=+3 COLOR=FF00FF> размером. </FONT> 18. </BODY> </HTML>");
		System.out.println(str);
		
		/*Считает кол-во тэгов в коде*/
		String[] strParts;
		strParts = str.split(">"); /*Массив из строк разбит по ">"*/
		int num=strParts.length; /*Кол-во эл-ов в массиве=кол-ву тэгов*/
		System.out.println("Всего тэгов:"+num);
		System.out.println();
		
		
		/*Показывает текст бегущей строки*/
		int start=str.indexOf("<marquee>"); /*Поиск индекса тэга<marquee>*/
		int end=str.indexOf("</marquee>"); /*Поиск индекса тэга</marquee>*/
		System.out.println("Текст бегущей строки:");
		System.out.println(str.substring(start+9,end));
		System.out.println();
		
		
		/*Выводит все использования тэга <kbd>*/
		String str1=new String();
		str1=str.toLowerCase();
		System.out.println("Использования тэга <kbd>:");
		start=str1.indexOf("<kbd>"); /*Поиск индекса тэга<kbd>*/
		end=str1.indexOf("</kbd>"); /*Поиск индекса тэга</kbd>*/
		System.out.println(str1.substring(start+5,end));
		int start1=str1.lastIndexOf("<kbd>"); /*Поиск индекса тэга<kbd>*/
		int end1=str1.lastIndexOf("</kbd>"); /*Поиск индекса тэга</kbd>*/
		System.out.println(str1.substring(start1+5,end1));
		System.out.println();

		
		/*Значение цвета, исспользуемого в строке 16*/
		int n1=str.indexOf("16");/*Поиск индекса "16"*/
		int n2=str.indexOf("17");/*Поиск индекса "17"*/
		String str2=new String(); 
		str2=str.substring(n1+3, n2); /*Выделение строчки №16*/
		int  n3=str2.indexOf("COLOR=");
		System.out.println("Значение цвета в 16 строке:");
		System.out.println(str2.substring(n3+6,n3+12));
		System.out.println();
		
		/*Работает хреново
		String str3=new String();
		str3=str;
		int i=0;
		num-кол-во тэгов
		while(i<num){
		int start2=str3.indexOf("<");
		int end2=str3.indexOf(">");
		String str4=new String();
		str4=str3.substring(start2,end2+1);
		str3=str3.replaceAll(str4, "");
		i++;}
		System.out.println(str3);*/
	
	
		/*Выводит верный код*/
		String str5=new String();
		str5=str;
		str5=str5.replace("=", "=\"");/*Заменяет все = на ="*/
		String str8=new String();
			/* Считает Кол-во знаков =*/
			String[] strParts1;
			strParts1 = str.split("="); /*Массив из строк разбит по "="*/
			int m=strParts1.length; 
		int j=0;
		while ( j<m){
			int r=str5.indexOf("=\""); /*Поиск первого индекса =""*/
			str8=str8+str5.substring(0,r+2); /*Запись в итоговую строчку всех символов до знака =""*/
			String str6=new String();
			str6=str5.substring(r+2,str5.length()); /*Запись в строку str6 всех символов после знака =""*/
			int p=str6.indexOf(" "); /*Поиск в str6 первого пробела*/
			int k=str6.indexOf(">"); /*Поиск в str6 первого знака >*/
			String str7=new String();
			/*Определяет что встречается первее: пробел или >*/			
			if (p<k){
				str6=str6.replaceFirst(" ","\" ");/*Ставит перед пробелом ковычку*/ 
				int last=str6.indexOf("\""); /*Поиск индекса первой ковычки*/
				str7=str6.substring(0, last+2); /*В str7 записывается все что заключено в ковычки*/
				str6=str6.substring(last+2,str6.length()); /*в str6 удаляется все что заключено в ковычки*/
				str8=str8+str7; /*к str8 прибавляем заключенное в ковычки слово*/
				str5=str5.substring(r+str7.length()); /*в строке str5 оставляем все, что идет после слова заключенного в ковычках*/
			}
			else{
				str6=str6.replaceFirst(">","\">");
				int last=str6.indexOf("\"");
				str7=str6.substring(0, last+2);
				str6=str6.substring(last+2,str6.length());
				str8=str8+str7;
				str5=str5.substring(r+str7.length()+1);
			}
			j++;
			}
		str8=str8+str5;
		System.out.println(str8);
	
	}

}
