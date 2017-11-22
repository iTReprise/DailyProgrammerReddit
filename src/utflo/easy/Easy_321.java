package utflo.easy;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Easy_321 {

    public static void main(String[] args) {

        String currentTime = ZonedDateTime.now(ZoneId.of("Europe/Berlin")).toString().replace("-", "").replace(":", "");
        dateToString(getCurrentHour(currentTime), getCurrentMinute(currentTime));
    }

    private static int getCurrentHour(String currentTime) {

        String currentTimeHour = "";
        currentTimeHour += currentTime.charAt(9);
        currentTimeHour += currentTime.charAt(10);

        int hour = Integer.parseInt(currentTimeHour);
        return hour;
    }

    private static int getCurrentMinute(String currentTime) {

        String currentTimeMinute = "";
        currentTimeMinute += currentTime.charAt(11);
        currentTimeMinute += currentTime.charAt(12);

        int minute = Integer.parseInt(currentTimeMinute);
        return minute;
    }

    private static void dateToString(int hour, int minute) {
        String[] hours = new String[]{"null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn",
                "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achzehn", "neunzehn",
                "zwanzig", "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig", "vierundzwanzig", "fünfundzwanzig",
                "sechsundzwanzig", "siebenundzwanzig", "achtundzwanzig", "neunundzwanzig", "dreißig", "einunddreißig",
                "zweiunddreißig", "dreiunddreißig", "vierunddreißig", "fünfunddreißig", "sechsunddreißig",
                "siebenunddreißig", "achtunddreißig", "neununddreißig", "vierzig", "einundvierzig", "zweiundvierzig",
                "dreiundvierzig", "vierundvierzig", "fünfundvierzig", "sechsundvierzig", "siebenundvierzig",
                "achtundvierzig", "neunundvierzig", "fünfzig", "einundfünfzig", "zweiundfünfzig", "dreiundfünfzig",
                "vierundfünfzig", "fünfundfünfzig", "sechsundfünfzig", "siebenundfünfzig", "achtundfünfzig", "neunundfünfzig"};

        String hourCurrent = hours[hour];
        String minuteCurrent = hours[minute];

        if (hourCurrent.equals("eins")) hourCurrent = "ein";
        if (minuteCurrent.equals("null")) minuteCurrent = "punkt";

        String gruss = "";
        if (hour <= 6 || hour >= 23) gruss = "Gute Nacht!";
        else if (hour <= 11 && hour >= 7) gruss = "Guten Morgen!";
        else if (hour <= 14 && hour >= 12) gruss = "Guten Mittag!";
        else if (hour <= 17 && hour >= 15) gruss = "Guten Nachmittag!";
        else if (hour <= 22 && hour >= 18) gruss = "Guten Abend!";

        System.out.println("Es ist " + hourCurrent + " Uhr " + minuteCurrent + ".");
        System.out.println(gruss);

    }
}
