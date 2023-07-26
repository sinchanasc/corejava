package com.xworkz.encapsulation.app;

public class Newspaper {
	private String edition = "morning";
	private int price = 4;
	private String language = "kannada";
	private String articles = "events";
	private String sections = "business";
	
	@Override
	public String toString() {
		return "Edition" + this.edition  +  "Price" + this.price  +  "Language" + this.language  +  "Articles" + this.articles +  "Sections" + this.sections;
	}
	
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
		
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getArticles() {
		return articles;
	}
	public void setArticles(String articles) {
		this.articles = articles;
	}
	
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}

	
		


}
