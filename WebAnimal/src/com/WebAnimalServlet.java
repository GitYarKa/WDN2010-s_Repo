package com;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WebAnimalServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		String name1 = req.getParameter("cat1_name");
		String name2 = req.getParameter("cat2_name");
		
		Double weight1 = Double.parseDouble(req.getParameter("cat1_weight"));
		Double weight2 = Double.parseDouble(req.getParameter("cat2_weight"));
		
		Cat cat1 = new Cat(name1, weight1);
		Cat cat2 = new Cat(name2, weight2);
		Spider parker = Spider.getSpider();
		
		Double result1 = parker.poison(cat1.getMass());		
		Double result2 = parker.poison(cat2.getMass());	
		
		resp.getWriter().println("<html><body>");
		
		resp.getWriter().println(result1 + ", " + result2);
		
		resp.getWriter().println("</body></html>");
		
	}
}
