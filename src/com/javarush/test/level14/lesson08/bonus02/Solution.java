package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int first=Integer.parseInt(reader.readLine());
        int second=Integer.parseInt(reader.readLine());
        /*int a=2;
        int b=2;*/
        while((first>0)& (second>0)){

            if (first > second)
            {
                first = first % second;
            }
            else
            second = second % first;

    }
        System.out.println(first+second);
    }
}
