public class TrafficSignals {
	final static int noOfColors = 3;
	final static String inventedby = "Garrett Morgan";
	Colors redIndicate;
	ColorsIndicate signals2;

	
	public static void main(String[] args)
	{
		TrafficSignals signals = new TrafficSignals();
		System.out.println(signals.inventedby);
	    System.out.println(signals.noOfColors);
		signals.redIndicate = Colors.RED;
		signals.signals2 = ColorsIndicate.STOP;
		System.out.println(signals.redIndicate);
		System.out.println(signals.signals2);
		
		
		Seasons season = new Seasons();
		System.out.println(season.noOfSeasons);
		System.out.println(season.coldSeason);
		season.seasonsOfYear=MainSeasons.WINTER;
		season.climateInSeasons = Climate.COLD;
		System.out.println(season.seasonsOfYear);
		
		Month month = new Month();
		System.out.println(month.noOfMonths);
		System.out.println(month.noOfDays);
		month.monthsInYear = Months.JAN;	
		month.daysInWeek = Days.SUN;
		System.out.println(month.monthsInYear);
		System.out.println(month.daysInWeek);
		
		Exam exam = new Exam();
		System.out.println(exam.inventedBy);
		System.out.println(exam.inventedYear);
		exam.mode = ExamModes.ONLINE;
		exam.result = ExamResult.PASS;
		System.out.println(exam.mode);
		System.out.println(exam.result);
		
	
	}
}

	
		
		enum Colors {
			RED,YELLOW,GREEN;
		}
		
		enum ColorsIndicate {
			STOP,SLOWDOWN,GO;
		}
		
		
        class Seasons{
		final static int noOfSeasons = 4;
		final static String coldSeason = "WINTER";
		MainSeasons seasonsOfYear;
		Climate climateInSeasons;
	    }
	    enum MainSeasons{
		SUMMER , WINTER , SPRING , RAINY;
	    }
	    enum Climate{
		HOT , COLD ,NEW;
	    }
		
		class Month{
			final static int noOfDays = 7;
			final static int  noOfMonths = 12;
			Months monthsInYear;
			Days daysInWeek;
		}
        enum Months{
				JAN , FEB , MAR , APR , MAY , JUN , JUL , AUG , SEP ,OCT , NOV , DEC;
		}
		enum Days{
			MON , TUE , WED , THUR , FRI , SAT , SUN;
		}
		
		class Exam {
			final static String inventedBy = "Henry Fischel";
            final static String inventedYear = "19C";
			ExamModes mode;
			ExamResult result;
		}
		
		enum ExamModes{
			ONLINE,OFFLINE;
		}
		enum ExamResult{
			PASS,FAIL,ABSENT,WITHHELD;
		}
			
			
		
			
			
	
		
		
		
			
			
		
		
	