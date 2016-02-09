package servlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Bonus;

/**
 * Servlet implementation class BonusServlet
 */
@WebServlet("/BonusServlet")
public class BonusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bonus mBonus;
		
		List<Bonus> listBonus=new LinkedList<Bonus>();
		
		if(request.getParameter("ssn1")!=null){
			mBonus=new Bonus();
			mBonus.setSsn(request.getParameter("ssn1"));
			mBonus.setBonus(request.getParameter("bonus1"));			
			mBonus.calculateBonus();
			listBonus.add(mBonus);

			mBonus=new Bonus();
			mBonus.setSsn(request.getParameter("ssn2"));
			mBonus.setBonus(request.getParameter("bonus2"));			
			mBonus.calculateBonus();
			listBonus.add(mBonus);
			
			System.out.println("bonus: "+mBonus.getSsn());
			
			request.setAttribute("bonus", listBonus);
			request.getRequestDispatcher("/WEB-INF/bonus.jsp").forward(request, response);
		}
		else{
			String error="no Param got from the request context!";
			request.setAttribute("error", error);
			request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
		}
		
	}
		

}
	
