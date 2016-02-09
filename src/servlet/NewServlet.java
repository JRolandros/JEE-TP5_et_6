package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Coyote;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/servlet")
public class NewServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
		HttpServletResponse response)throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		Coyote chacal = new Coyote();
		if(request.getParameter("name")!=null){
			chacal.setNom(request.getParameter("name"));
			chacal.setPrenom(request.getParameter("firstname"));
			
			System.out.println("\n hello world :"+chacal.getPrenom()+"helooo "+chacal.getNom());
			
			request.setAttribute("coyote", chacal);
			request.getRequestDispatcher("/WEB-INF/affichage.jsp").forward(request,response);
		}
		else
		request.getRequestDispatcher("/index.jsp").forward(request,response);
	}
}
