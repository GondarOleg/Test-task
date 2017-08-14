package utils;

public class TimeOfDay {
    public static String getTimeOfDay(int hour) {
        if (hour >= 6 && hour < 9) {
            return "morning";
        } else if (hour >= 9 && hour < 19) {
            return "day";
        } else if (hour >= 19 && hour < 23) {
            return "evening";
        } else {
            return "night";
        }
    }
}
