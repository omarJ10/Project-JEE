package Dao;

import java.sql.SQLException;
import java.util.List;

import Dao.Singleton;
import model.Livre;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class GestionLivre {

	public Livre save(Livre p) {
		Singleton.setUselog("root");
		Singleton.setPass("");
		java.sql.Connection conn= Singleton.seConnecter();
		try {

		PreparedStatement ps= (PreparedStatement) conn.prepareStatement("INSERT INTO idlivre(title,	author	,nbPages	,publishDate	,rate ,categorie ,prix) VALUES(?,?,?,?,?,?,?);");
		//	id	title	author	nbPages	publishDate	rate categorie prix
		ps.setString(1, p.getTitle());
		ps.setString(2,p.getAuthor());
		ps.setInt(3, p.getNbPages());
		ps.setDate(4,(java.sql.Date) p.getPublishDate());
		ps.setFloat(5,p.getRate());
		ps.setString(6, p.getCategorie());
		ps.setFloat(7,p.getPrix());

		ps.executeUpdate();

		ps.close();
		} catch (SQLException e)
		{
		e.printStackTrace();
	}
		return p;
	}

	
	public List<Livre> produitsParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Livre getProduit(String Réf) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Livre updateProduit(Livre p) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteProduit(String Réf) {
		// TODO Auto-generated method stub
		
	}

	
	public List<Livre> livres() {
		Singleton.setUselog("root");
		Singleton.setPass("");
		Connection conn = (Connection) Singleton.seConnecter();
		ArrayList<Livre> list = new ArrayList<>();
		try {
			Statement ps = (Statement) conn.createStatement();
			ResultSet rs = ps.executeQuery("SELECT * FROM idlivre");
			
			while(rs.next()) {
				Livre l = new Livre();
				l.setTitle(rs.getString("title"));
				l.setAuthor(rs.getString("author"));
				l.setNbPages(rs.getInt("nbPages"));
				l.setPublishDate(rs.getDate("publishDate"));
				l.setRate(rs.getFloat("rate"));
				l.setCategorie(rs.getString("categorie"));
				l.setPrix(rs.getFloat("prix"));
				list.add(l);
				
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		Livre l = new Livre( "bb","bb","bb",130, new Date(1,1,2020) , 12.5F,50F);
		GestionLivre g = new GestionLivre();
		g.save(l);
	}

	
	
}
