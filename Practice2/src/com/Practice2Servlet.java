package com;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Practice2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		byte b = 127;

		resp.getWriter().print(b+"<br />");

		short s = 32767;

		resp.getWriter().print(s+"<br />");

		int i = 999999999;

		resp.getWriter().print(i+"<br />");

		//для чисел типа long обязательно добавлять 'l'

		long l = 100l;

		resp.getWriter().print(l+"<br />");

		//символьный тип данных

		char c2 = 'c';

		char c3 = 1200;

		resp.getWriter().print(c2+"<br />");

		resp.getWriter().print(c3+"<br />");

		//в шестнадцатиричной системе счисления

		char c = 0x0770;

		resp.getWriter().print(c+"<br />");

		/*

		//вывод символов

		for (char c1 = 1200; c1<1300;c1++){

		resp.getWriter().print(c1+" ");

		if ((c1 % 10)==0){

		resp.getWriter().println("===");

		}

		}*/

		//приведение типов

		resp.getWriter().print((int)c+"<br />");

		int h=3,g=2;

		resp.getWriter().print(h/g+"<br />");

		resp.getWriter().print((float)h/g+"<br />");

		float h1=30000000000000000.0f,g1=2;

		resp.getWriter().print(h1/g1+"<br />");

		resp.getWriter().print((int)(h1/g1)+"<br />");

		resp.getWriter().print("<br />");

		float f = 100000000000000000000000000000000000000.0f;

		resp.getWriter().print(f+"<br />");

		double googol = 1e100;

		double d = 1100.34;

		boolean bool = true;

		//escape-символы

		resp.getWriter().println(googol);

		resp.getWriter().print("Перенос строки"+"<br />");

		//условный оператор switch

		int x=1,y=2,z,operation=0;

		switch (operation){

		case 0:

		z = x+y;

		break;

		case 1:

		z = x-y;

		break;

		case 2:

		z = x*y;

		break;

		default:

		z = x/y;

		}

		resp.getWriter().print("Результат выполнения операции: "+z+"<br />");

		//цикл for

		long factorial=1;

		for (l=1l;l<10;l++){

		factorial*=l;

		}

		resp.getWriter().print(factorial+"<br />");

		//массивы

		int[] m1;

		int[] m2 = new int[5];

		int[] m3 = {1,2,3};

		resp.getWriter().print(m3[0]+"<br />");

		int[][] m4;

		int[][] m5 = {{1,2},{2}};

		resp.getWriter().print(m5[0][0]+"<br />");

		String[] str = new String[4];

		String[] seasons = {"Зима","Весна","Лето","Осень"};

		for(i=0;i<seasons.length;i++){

		resp.getWriter().print(seasons[i]+"<br />");

		}

		double dd = Math.random();

		resp.getWriter().print(dd+"<br />");

		int random = (int)(dd*100);

		resp.getWriter().print(random+"<br />");
	}
}
