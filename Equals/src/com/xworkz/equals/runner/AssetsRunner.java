package com.xworkz.equals.runner;

import com.xworkz.equals.app.Assets;

public class AssetsRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Assetsrunner");

		Assets assets = new Assets("Land","Marthalli",50000);
		System.out.println(assets);

		Assets assets2 = new Assets("house","Marthalli",70000);
		System.out.println(assets2);

		boolean same = assets.equals(assets2);
		System.out.println("Both Assets is same" + same);

	}

}
