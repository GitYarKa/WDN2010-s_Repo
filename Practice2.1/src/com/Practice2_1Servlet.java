package com;
import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Practice2_1Servlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse resp)
			 throws IOException {
	 	
	 	 resp.setContentType("text/html;charset=UTF-8");
	 	 int task = Integer.parseInt(req.getParameter("task"));
	 	 switch (task)
	 	 {
	 	 case 1:
	 		 //task 3.1
	 		 String var1 = req.getParameter("var1");
	 		 int b = Integer.parseInt(var1);
	 		 String var2 = req.getParameter("var2");
	 		 int a = Integer.parseInt(var2);
	 		 int abuf = Math.abs(a - 10);
	 		 int bbuf = Math.abs(b - 10);
	 		 if (abuf > bbuf)
	 			 resp.getWriter().println(b);
	 		 else
	 			 resp.getWriter().println(a);
	 		 break;
	 	 case 2:
	 		String var3 = req.getParameter("var3");
		 	int ax = Integer.parseInt(var3);
		 	String var4 = req.getParameter("var4");
		 	int bx = Integer.parseInt(var4);
		 	String var5 = req.getParameter("var5");
		 	int cx = Integer.parseInt(var5);
		 	if (bx*bx - (4*ax*cx) < 0)
		 		resp.getWriter().println("Корней нет");
			else
			{
				if (bx*bx - (4*ax*cx) == 0)
					resp.getWriter().println("Ответ: " + (-bx/(2*ax)));
				else
				{
					resp.getWriter().println("Ответ 1: " + ((-bx + Math.sqrt(bx*bx - (4*ax*cx)))/(2*ax)));
					resp.getWriter().println("Ответ 2: " + ((-bx - Math.sqrt(bx*bx - (4*ax*cx)))/(2*ax)));
				}
			}
		 	break;
	 	 case 3:
	 		Random rnd = new Random(System.currentTimeMillis());
			int[][] ar1 = new int[8][5];
			for (int i1 = 0; i1<8; i1++)
			{
				for (int j1 = 0; j1<5; j1++)
				{
					ar1[i1][j1] = 10 + rnd.nextInt(90);
					resp.getWriter().print(ar1[i1][j1] + " ");
				}
				resp.getWriter().println("<br />");
			}
			break;
	 	 case 4:
	 		Random rnd2 = new Random(System.currentTimeMillis());
			int[][] ar2 = new int[5][8];
			int max = -100;
			for (int i2 = 0; i2<5; i2++)
			{
				for (int j2 = 0; j2<8; j2++)
				{
					ar2[i2][j2] = -99 + rnd2.nextInt(199);
					if (ar2[i2][j2] > max)
						max = ar2[i2][j2];
					resp.getWriter().print(ar2[i2][j2] + " ");
				}
				resp.getWriter().println("<br />");
			}
			resp.getWriter().println("Максимальное значение: " + max);
	 		break;
	 	 }
		 
		
}
}