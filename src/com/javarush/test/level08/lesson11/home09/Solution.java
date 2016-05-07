package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    //сколько миллисекунд в одних сутках
    public static final long MILLIS_IN_DAY = 24 * 60 * 60 * 1000L;

    public static void main(String[] args) {
        System.out.println(isDateOdd("MARCH 15 2016"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStart = new Date(2016 - 1900, 0, 1); // year from 1900, like 98 for 1998 year
        Date currentTime = new Date();
        System.out.println(yearStart);
        System.out.println(currentTime);
        long msTimeDistance = currentTime.getTime() - yearStart.getTime();
        double daysFromNewYear = (double) msTimeDistance / MILLIS_IN_DAY; // can be float
        int dayCount = (int) Math.ceil(daysFromNewYear); //количество целых дней

        return isOdd(dayCount);
    }

    private static boolean isOdd(int dayCount) {
        return dayCount % 2 == 0 ? true : false;
    }
}
