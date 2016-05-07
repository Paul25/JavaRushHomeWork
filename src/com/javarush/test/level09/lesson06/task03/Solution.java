package com.javarush.test.level09.lesson06.task03;

/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        try
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (RuntimeException e){
            System.out.println(e);
        }

        //напишите тут ваш код

    }
}
