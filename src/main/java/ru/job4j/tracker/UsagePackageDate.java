package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Current date and time formatted: " + currentDateTimeFormat);
    }
}
