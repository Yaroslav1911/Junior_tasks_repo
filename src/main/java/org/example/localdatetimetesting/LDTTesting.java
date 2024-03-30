package org.example.localdatetimetesting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LDTTesting {
    public static void main(String[] args) {

//        System.out.println(inputDate());

        System.out.println(formatterFromString("12-06-30 12:00"));

    }

    public static String inputDate(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the month number");
        int month = scn.nextInt();
        System.out.println("Enter the day number");
        int day = scn.nextInt();
        System.out.println("Enter the hour");
        int hour = scn.nextInt();

        LocalDate date = LocalDate.of(2024, month, day);
        LocalTime time = LocalTime.of(hour, 0);

        LocalDateTime lcd = LocalDateTime.of(date, time);

        return formatterToLDT(lcd);
    }

    public static LocalDateTime formatterFromString(String string) {
        String[] text = string.split("[-: ]");
        String date = "";
        if(text.length == 5){
            date = String.format("20%s-%s-%sT%s:%s", text[0], text[1], text[2], text[3], text[4]);
        } else if (text.length == 4){
            date = String.format("20%s-%s-%sT%s:00", text[0], text[1], text[2], text[3]);
        }
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        return LocalDateTime.parse(date, dtf);
    }
    public static String formatterToLDT(LocalDateTime localDateTime){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM d k m");
        return dtf.format(localDateTime);
    }


}
