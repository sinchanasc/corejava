package com.xworkz.topics.app;

public final class Summer extends Seasons {
	
	public Summer(int season) {
		super(season);
	}

	public static void cast(Seasons season) {
		if (season instanceof Seasons) {
			Seasons sun =(Seasons)season;
			System.out.println("summer is a type of season");
		} else {
			System.out.println("is not a season");
		}
	}

	public static void sunny () {
		System.out.println("method of final class which cannot be extended");
	}


	

}
