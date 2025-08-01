package Firstexample;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeApiExample {
    public static void main(String[] args) {
        // Current Date, Time, and DateTime
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current DateTime: " + dateTime);

        // Formatting DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // Specific Date and Manipulation
        LocalDate republicDay = LocalDate.of(1950, Month.JANUARY, 26);
        System.out.println("Republic Day: " + republicDay);

        LocalDate nextWeek = date.plusWeeks(1);
        LocalDateTime modifiedDateTime = dateTime.withDayOfMonth(24).withYear(2016);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Modified DateTime: " + modifiedDateTime);

        // Time Zone Example
        ZonedDateTime currentZone = ZonedDateTime.now();
        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoTime = currentZone.withZoneSameInstant(tokyoZoneId);
        System.out.println("Tokyo Time: " + tokyoTime.format(formatter));
    }
}
