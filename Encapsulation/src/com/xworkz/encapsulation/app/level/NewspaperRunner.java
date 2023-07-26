package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Newspaper;


public class NewspaperRunner {
	

	public static void main(String[] args) {
		Newspaper newspaper = new Newspaper();
		System.out.println(newspaper);
		
		newspaper.setArticles("issues");
		newspaper.setEdition("evening");
		newspaper.setLanguage("english");
		newspaper.setPrice(6);
		newspaper.setSections("sports");
		System.out.println(newspaper);
	}

}
