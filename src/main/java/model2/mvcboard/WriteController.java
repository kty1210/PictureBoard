package model2.mvcboard;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


public class WriteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpResponse resp)
		throws ServletException, IOException{
		req.getRequestDispatcher("/14MVCBoard/Write.jsp").forward(req, resp);
		
	}
}

