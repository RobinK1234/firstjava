package week1;

public class Ex5 {
    public static void main(String[] args) {

        int secondsInMinute = 60;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        int totalSecondsInYear = secondsInMinute * minutesInHour * hoursInDay * daysInYear;

        // Print the result
        System.out.println("Aastas on " + totalSecondsInYear + " sekundit");
    }
}

