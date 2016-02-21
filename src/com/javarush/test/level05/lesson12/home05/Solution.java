package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.IntBuffer;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));


        int s=0;
        String x = "сумма";

        while (true)
        {
            String s1=reader.readLine();
            if (s1.equals("сумма"))
                break;
            int n=Integer.parseInt(s1);
            s = s + n;
          }
        System.out.println(s);
    }
}
