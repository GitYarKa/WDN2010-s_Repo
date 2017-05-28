
public class StringsTask2 {

	public static void main(String[] args) {
		String str=new String("1. <HTML> <HEAD> 2. <TITLE>Óïðàâëåíèå ðàçðûâîì ñòðîê </Title> 3. </HEAD>	4. <BODY> 5. <marquee>Ýòî ìîÿ ó÷åáíàÿ  ñòðàíèöà.</marquee> 6. <H2>Ìåíÿ çîâóò <kbd>Îëüãà. </kbd></H2> 7. <H3 align=center>ß æèâó âî <em>Âëàäèâîñòîêå</em>. </H3> 8.  <H4 align=right> Ìîÿ ìàëåíüêàÿ ðîäèíà -  <font face=Academy color=Red>Ñàõàëèí</font>. </H4> 9. <H5 align=left>ÄÂÃÓ - ÂÓÇ â êîòîðîì ÿ ðàáîòàþ.</H5> 10. <B>Çäåñü</B> 11. <I>ïðîäåìîíñòðèðîâàíû</I> 12. <Blink>ðàçëè÷íûå</Blink> 13. <U> ñïîñîáû </U> 14. <KBD>óïðàâëåíèÿ </KBD> 15. <FONT SIZE=5 COLOR=FF80C0>øðèôòîì:</FONT>  åãî  16. <FONT SIZE=5 COLOR=FF00FF>öâåòîì</FONT> è 17. <FONT SIZE=+3 COLOR=FF00FF> ðàçìåðîì. </FONT> 18. </BODY> </HTML>");
		System.out.println(str);
		
		/*Ñ÷èòàåò êîë-âî òýãîâ â êîäå*/
		String[] strParts;
		strParts = str.split(">"); /*Ìàññèâ èç ñòðîê ðàçáèò ïî ">"*/
		int num=strParts.length; /*Êîë-âî ýë-îâ â ìàññèâå=êîë-âó òýãîâ*/
		System.out.println("Âñåãî òýãîâ:"+num);
		System.out.println();
		
		
		/*Ïîêàçûâàåò òåêñò áåãóùåé ñòðîêè*/
		int start=str.indexOf("<marquee>"); /*Ïîèñê èíäåêñà òýãà<marquee>*/
		int end=str.indexOf("</marquee>"); /*Ïîèñê èíäåêñà òýãà</marquee>*/
		System.out.println("Òåêñò áåãóùåé ñòðîêè:");
		System.out.println(str.substring(start+9,end));
		System.out.println();
		
		
		/*Âûâîäèò âñå èñïîëüçîâàíèÿ òýãà <kbd>*/
		String str1=new String();
		str1=str.toLowerCase();
		System.out.println("Èñïîëüçîâàíèÿ òýãà <kbd>:");
		start=str1.indexOf("<kbd>"); /*Ïîèñê èíäåêñà òýãà<kbd>*/
		end=str1.indexOf("</kbd>"); /*Ïîèñê èíäåêñà òýãà</kbd>*/
		System.out.println(str1.substring(start+5,end));
		int start1=str1.lastIndexOf("<kbd>"); /*Ïîèñê èíäåêñà òýãà<kbd>*/
		int end1=str1.lastIndexOf("</kbd>"); /*Ïîèñê èíäåêñà òýãà</kbd>*/
		System.out.println(str1.substring(start1+5,end1));
		System.out.println();

		
		/*Çíà÷åíèå öâåòà, èññïîëüçóåìîãî â ñòðîêå 16*/
		int n1=str.indexOf("16");/*Ïîèñê èíäåêñà "16"*/
		int n2=str.indexOf("17");/*Ïîèñê èíäåêñà "17"*/
		String str2=new String(); 
		str2=str.substring(n1+3, n2); /*Âûäåëåíèå ñòðî÷êè ¹16*/
		int  n3=str2.indexOf("COLOR=");
		System.out.println("Çíà÷åíèå öâåòà â 16 ñòðîêå:");
		System.out.println(str2.substring(n3+6,n3+12));
		System.out.println();
	
	
		/*Âûâîäèò âåðíûé êîä*/
		String str5=new String();
		str5=str;
		str5=str5.replace("=", "=\"");/*Çàìåíÿåò âñå = íà ="*/
		String str8=new String();
			/* Ñ÷èòàåò Êîë-âî çíàêîâ =*/
			String[] strParts1;
			strParts1 = str.split("="); /*Ìàññèâ èç ñòðîê ðàçáèò ïî "="*/
			int m=strParts1.length; 
		int j=0;
		while ( j<m){
			int r=str5.indexOf("=\""); /*Ïîèñê ïåðâîãî èíäåêñà =""*/
			str8=str8+str5.substring(0,r+2); /*Çàïèñü â èòîãîâóþ ñòðî÷êó âñåõ ñèìâîëîâ äî çíàêà =""*/
			String str6=new String();
			str6=str5.substring(r+2,str5.length()); /*Çàïèñü â ñòðîêó str6 âñåõ ñèìâîëîâ ïîñëå çíàêà =""*/
			int p=str6.indexOf(" "); /*Ïîèñê â str6 ïåðâîãî ïðîáåëà*/
			int k=str6.indexOf(">"); /*Ïîèñê â str6 ïåðâîãî çíàêà >*/
			String str7=new String();
			/*Îïðåäåëÿåò ÷òî âñòðå÷àåòñÿ ïåðâåå: ïðîáåë èëè >*/			
			if (p<k){
				str6=str6.replaceFirst(" ","\" ");/*Ñòàâèò ïåðåä ïðîáåëîì êîâû÷êó*/ 
				int last=str6.indexOf("\""); /*Ïîèñê èíäåêñà ïåðâîé êîâû÷êè*/
				str7=str6.substring(0, last+2); /*Â str7 çàïèñûâàåòñÿ âñå ÷òî çàêëþ÷åíî â êîâû÷êè*/
				str6=str6.substring(last+2,str6.length()); /*â str6 óäàëÿåòñÿ âñå ÷òî çàêëþ÷åíî â êîâû÷êè*/
				str8=str8+str7; /*ê str8 ïðèáàâëÿåì çàêëþ÷åííîå â êîâû÷êè ñëîâî*/
				str5=str5.substring(r+str7.length()); /*â ñòðîêå str5 îñòàâëÿåì âñå, ÷òî èäåò ïîñëå ñëîâà çàêëþ÷åííîãî â êîâû÷êàõ*/
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
