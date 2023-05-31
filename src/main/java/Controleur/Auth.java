package Controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utilisateur;


/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public Auth() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("login.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String L=request.getParameter("login");
		String P=request.getParameter("password");
		//créer le model
		Utilisateur user =new Utilisateur();
		user.setLogin(L);
		user.setPassword(P);
		//ajouter le modele comme attribut de requete
		String resultat="bienvenue "+L;
		if(user.verfifier())
		{
//			request.setAttribute("resultat", resultat);
			response.sendRedirect(request.getContextPath() + "/Liste");
		}
		else 
			request.getRequestDispatcher("login.jsp").forward(request,response);
					
		}
	}


