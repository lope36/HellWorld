package com.week2;


import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

public class data1
         {
    public static void main(String[] args) {
        Date date53 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = dateFormat.format(date53);
        System.out.println("1995/11/11");
        Date date1 = new Date();
        LocalDate date2 = LocalDate.now();
        System.out.println(date2);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm");
        String strDate1 = dateFormat1.format(date1);
        System.out.println(strDate1);

        LocalDate of = LocalDate.of(2019, 1, 26);
        System.out.println(of);

        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("Asia/Kamchatka"));
        System.out.println(pst);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm EEEE");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(dateTimeFormatter));


        DateTimeFormatter asd = DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH);
        LocalDate date = LocalDate.of(1025,4, 18);
        System.out.println(date.format(asd));

        Duration between = Duration.between(LocalDateTime.of(1995, 11, 11, 15, 15), LocalDateTime.now());
        System.out.println(between.getSeconds());

        Duration dur = Duration.between(LocalDateTime.of(1995, 11, 11, 15, 15), LocalDateTime.now());
        System.out.println(dur.toDays());

        Duration bolek = Duration.between(LocalDateTime.of(1025, 4, 18, 0, 0), LocalDateTime.now());
        System.out.println(bolek.toDays());

        LocalDateTime nowe = LocalDateTime.now();
        LocalDateTime dateTime = nowe.plusSeconds(56_342);
        System.out.println(dateTime);


        long betweenn = ChronoUnit.DAYS.between(LocalDate.of(1025,4,18), LocalDate.now());
        System.out.println(betweenn);




    }
}