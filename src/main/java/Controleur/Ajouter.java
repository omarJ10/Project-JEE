package Controleur;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.GestionLivre;
import model.Livre;

/**
 * Servlet implementation class Ajouter
 */
@WebServlet("/Ajouter")
public class Ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Ajout.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        int nbPages = Integer.parseInt(request.getParameter("nbP"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String categorie =request.getParameter("cat");
        float prix = Float.parseFloat(request.getParameter("prix"));
        float rate = Float.parseFloat(request.getParameter("rate"));
        String StringDate = request.getParameter("date");
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date publishDate = null;
		try {
			java.util.Date utilDate = simpleDate.parse(StringDate);
			publishDate = new java.sql.Date(utilDate.getTime());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        Livre l = new Livre(title,author,categorie,nbPages,publishDate,rate,prix);
        GestionLivre g = new GestionLivre();
        g.save(l);
        response.sendRedirect(request.getContextPath() + "/Liste");
	}

}
