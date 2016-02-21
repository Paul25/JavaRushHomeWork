package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        String s2=reader.readLine();
        String s3=reader.readLine();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n3=Integer.parseInt(s3);
        if (n1>n2 && (n1<n3)&& (n3>n2))
        {
            System.out.println(n1);
        }
        if (n1<n2 && (n1>n3)&& (n3<n2))
        {
            System.out.println(n1);
        }
        if (n2>n1 && (n2<n3)&& (n3>n1))
        {
            System.out.println(n2);
        }
        if (n2<n1 && (n2>n3)&& (n3<n1))
        {
            System.out.println(n2);
        }
        if (n3>n1 && (n2>n3)&& (n2>n1))
        {
            System.out.println(n3);
        }
        if (n3<n1 && (n2<n3)&& (n2<n1))
        {
            System.out.println(n3);
        }
    }
}
