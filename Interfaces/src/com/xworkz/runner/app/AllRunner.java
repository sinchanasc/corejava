package com.xworkz.runner.app;

import  com.xworkz.intel.app.*;
     class AllRunner {
		 public static void main(String[] args) {
			 System.out.println("ARMY RULES");
			   
			ArmyRule army = new GeneralRule(); 
			army.getHairCut();
			army.getUniforms();
			System.out.println("Everyone should talk :"+army.everyone_should_talk);
			System.out.println("**************************************");
			   
			System.out.println("AIRPORT RULES");   
		    Airport air = new AirportRule();
		    air.getLimitsLiquids();
		    air.getBodyScanners();
		    System.out.println("Must bring Passport:"+air.should_have_passports);
		    System.out.println("**************************************");
		    
		    System.out.println("HOSPITAL RULES");
		    Hospital hospital=new HospitalRule();
		    hospital.getFee();
		    hospital.getMedicine();
		    System.out.println("Follow some rules:"+hospital.keep_silent);
		    System.out.println("**************************************");
		    
		    System.out.println("HOSTEL RULES");
		    Hostel rule = new HostelRules();
		    rule.getDonotDoRagging();
		    rule.getFee();
		    System.out.println("Maintances times:"+rule.Launch_time);
		    System.out.println("**************************************");
		    
		    
		    System.out.println("METRO RULES");
		   Metro metrorule = new MetroRules();
		   metrorule.getCoins();
		   metrorule.getWithinTime();
		   System.out.println("Follow metro rules:"+metrorule.buy_tickets);
		   System.out.println("**************************************");
		   
		   System.out.println("PUB RULES");
		   Pub pubrule = new PubRules();
		   pubrule.dontDurgs();
		   pubrule.getPartner();
		   System.out.println("Follow pub rules:"+pubrule.Open_Time);
		   System.out.println("**************************************");
		   
		   System.out.println("TEMPLE RULES");
		   Temple temple = new TempleRules();
		   temple.getDontTakePicture();
		   temple.getKeepSilent();
		   System.out.println("Follow rules:"+temple.donot_partywear_dress);
		   System.out.println("**************************************");
		   
		   System.out.println("THEATER RULES");
		   Theater theater = new TheaterRules();
		   theater.donttake_Outside_Food();
		   theater.getMaintance_Clean();
		   System.out.println("Follow rules:"+theater.fees_tickets);
		   System.out.println("**************************************");
		   
		   System.out.println("VTU RULES");
		   Vtu vturule = new VtuRules();
		   vturule.getPass();
		   vturule.getStudent_Info();
		   System.out.println("Follow rules:"+vturule.HeadQuarter);
		   
		   
		}
		

	}


