package utils;
import java.util.Calendar;

public class DateSelector {


    public static String getFirstDate() {
        Calendar date = Calendar.getInstance();
        if (date.get(Calendar.MONTH) == 11) {
            return ((date.get(Calendar.YEAR) + 1) +  "-" + "01" + "-" + "01");
        }
        else {
            return (date.get(Calendar.YEAR) + "-" + (date.get(Calendar.MONTH) + 2) + "-" + "01");
        }
    }

    public static String getSecondDate() {
        Calendar date = Calendar.getInstance();
        if (date.get(Calendar.MONTH) == 11) {
            return ((date.get(Calendar.YEAR) + 1) +  "-" + "01" + "-" + "02");
        }
        else {
            return (date.get(Calendar.YEAR) + "-" + (date.get(Calendar.MONTH) + 2) + "-" + "10");
        }
    }

}
