package utils;
import java.util.Date;

public class DateSelector {


    public static String getFirstDate() {
        Date date = new Date();
        if (date.getMonth() == 12) {
            return ("01" + "-" + "01" + "-" + (date.getYear() + 1));
        }
        else {
            return ("01" + "-" + (date.getMonth() + 1) + "-" + date.getYear());
        }
    }

    public static String getSecondDate() {
        Date date = new Date();
        if (date.getMonth() == 12) {
            return ("10" + "-" + "01" + "-" + (date.getYear() + 1));
        }
        else {
            return ("10" + "-" + (date.getMonth() + 1) + "-" + date.getYear());
        }
    }

}
