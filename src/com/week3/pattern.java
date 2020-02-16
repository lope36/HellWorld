package com.week3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern
{
    public static void main(String[] args) {
        String napis = "\\";
        String forward = "/";

        Pattern pattern = Pattern.compile("[\\d\\Wa-zA-Z]{14}");
        Matcher account = pattern.matcher("123e4567-e89b-12d3-a456-426655440000");
        if (account.matches()) {
            System.out.println("tak pasuje");}
        else {
            System.out.println("nie nie pasuje");
        }
    }
}
