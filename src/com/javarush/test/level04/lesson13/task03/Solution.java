package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i;
        int k;
        String s="8";
        for (i=0;i<=9;i++)
        {
//            for (k = 2; k <= 10; k--)
//            {
//                System.out.println(s);

            System.out.println(s);
            s=s+8;


           }


    }
}
