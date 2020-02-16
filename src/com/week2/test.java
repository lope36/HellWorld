package com.week2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test
{
    //acount
    //acount2
    //acount3
    //acount4
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("account\\d?");
        Matcher account = pattern.matcher("account");
        if (account.matches()) {
            System.out.println("tak pasuje");}
         else {
            System.out.println("nie nie pasuje");
        }
    }}


