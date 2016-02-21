package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        ArrayList<String> listS = new ArrayList<String>();
        int N=Integer.parseInt(reader.readLine());
        int M=Integer.parseInt(reader.readLine());
        for (int j = 0; j < N; j++)
        {
            String s=reader.readLine();
            listS.add(s);

        }
        for (int k = 0; k < M; k++)
        {

            listS.add(listS.get(0));
            listS.remove(0);
        }
        for (int c = 0; c < listS.size(); c++)
        {
            System.out.println(listS.get(c));
        }
    }
}
