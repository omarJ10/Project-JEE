package model;

import java.util.Date;

public class Livre {
	private String title;
	private String author;
	private String categorie;
	private int nbPages;
	private java.sql.Date publishDate;
	private float rate;
	private float prix;
	
	
	
	
	public Livre(String title, String author, String categorie, int nbPages, Date publishDate, float rate,float prix) {
		super();
		this.title = title;
		this.author = author;
		this.categorie = categorie;
		this.nbPages = nbPages;
		this.publishDate = new java.sql.Date(publishDate.getDay(),publishDate.getMonth(),publishDate.getYear());
		this.rate = rate;
		this.prix=prix;
	}
	public Livre() {
		super();
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getNbPages() {
		return nbPages;
	}
	
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	public Date getPublishDate() {
		return publishDate;
	}
	
	public void setPublishDate(Date publishDate) {
		this.publishDate = new java.sql.Date(publishDate.getDay(),publishDate.getMonth(),publishDate.getYear());
	}
	public void setPublishDate(java.sql.Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public float getRate() {
		return rate;
	}
	
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	
	
}
