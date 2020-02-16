package com.week2;

import com.week3.User;

import java.time.LocalDate;

public class AppUser
{
    public static User [] USERS = {
      new User("flet", "flet@o2.pl", LocalDate.parse("1990-01-02")),
      new User("bilbo", "dildobagins@o2.pl", LocalDate.parse("1991-06-22")),
      new User("tusk", "bibelotytuska@o2.pl", LocalDate.parse("1970-11-12")),

    };
}
