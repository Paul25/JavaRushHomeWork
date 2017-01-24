package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(s));
        ArrayList<Integer>  list = new ArrayList<Integer> ();
        String s1= in.readLine();

        while ((s1=reader.readLine()) != null)
        {
            int n = Integer.parseInt(s1);

            if (n % 2 == 0)
            {
                list.add(n);

            }
        }

        Collections.sort(list);
        for (int x : list)
        {
            System.out.println(x);
        }


    }
}