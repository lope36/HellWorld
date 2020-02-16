package com.week3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        // matcher
        // account1
        // account2
        // account3
        String napis = "\\"; //     \\\\
        String forward = "/";
        // 01.02.2020
        // UUID
        // 8-4-4-4-12
        // 0 - F
        // 123e4567-e89b-12d3-a456-426655440000
      /*
      Hasło musi zawierać:
      - co najmniej jedną literkę małą
      - co najmniej jedną literkę wielką
      - co najmniej jedną cyfrę
      - co najmniej jeden znak specjalny (!@#$%^&*_)
      - mieć długość co najmniej 14
       */
        String password = "asd&FGH*eee89001";
        Pattern lowerCaseLetters = Pattern.compile("[a-z]+");
        Matcher lowerCaseLettersMatcher = lowerCaseLetters.matcher(password);
        Pattern upperCaseLetters = Pattern.compile("[A-Z]+");
        Matcher upperCaseLettersMatcher = upperCaseLetters.matcher(password);
        Pattern numbers = Pattern.compile("[0-9]+");
        Matcher numbersMatcher = numbers.matcher(password);
        Pattern specials = Pattern.compile("[!@#$%^&*_]+");
        Matcher specialsMatcher = specials.matcher(password);
        Pattern length = Pattern.compile(".{14,}");
        Matcher lengthMatcher = length.matcher(password);
        if (lowerCaseLettersMatcher.find() &&
                upperCaseLettersMatcher.find() &&
                numbersMatcher.find() &&
                specialsMatcher.find() &&
                lengthMatcher.find()) {
            System.out.println("Hasło jest poprawne!!!");
        } else {
            System.out.println("Niepoprawne hasło");
        }
    }
}
