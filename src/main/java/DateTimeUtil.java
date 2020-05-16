package leapyear.src.main.java;

public class DateTimeUtil {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0){
            if(year % 100 != 0)
                return true;
        }
        if(year % 400 == 0)
            return true;
        else
            return false;
    }
}
