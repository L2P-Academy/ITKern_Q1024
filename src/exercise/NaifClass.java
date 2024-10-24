package exercise;

public class NaifClass {

	public String getZodiacSign(int day, int month) {
		String zodiacSign = "";
		
		if ( day < 1 || day > 31 ) {
			return "ERROR: Der Tag muss zwischen 1 und 31 liegen.";
		} else if ( month < 1 || month > 12 ) {
			return "ERROR: Der Monat muss zwischen 1 und 12 liegen.";
		}
		
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Wassermann";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Fische";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Widder";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Stier";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiacSign = "Zwillinge";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiacSign = "Krebs";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Löwe";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Jungfrau";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Waage";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Skorpion";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Schütze";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiacSign = "Steinbock";
        }

        return "Dein Sternzeichen ist: " + zodiacSign;
	}

}
