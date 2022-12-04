package com.hillel.nukutiuk.homeworks.homework14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentYear {
    public static String Date(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}