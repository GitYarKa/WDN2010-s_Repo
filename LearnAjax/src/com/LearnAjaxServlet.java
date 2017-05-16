package com;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LearnAjaxServlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse resp)
			 throws IOException {
	 	
	 	 resp.setContentType("text/html;charset=UTF-8");
	 	 String var1 = req.getParameter("var1");
	 	 int i1 = Integer.parseInt(var1);
	 	
	 	 String var2 = req.getParameter("var2");
	 	 int i2 = Integer.parseInt(var2);
	 	 resp.getWriter().println("Были переданы следующие значения:"+ i1 + i2);
				
}
}