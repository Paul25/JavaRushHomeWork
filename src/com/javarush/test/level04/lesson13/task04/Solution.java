package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i;
        int k;
        String s = "8";
        String d = "8";
        for (i = 1; i <10; i++)
        {
            System.out.print(d);
        }
            for (k = 1; k <= 11; k++)
            {
                System.out.println(s);
            }
             //s = s + 8;
    }
}