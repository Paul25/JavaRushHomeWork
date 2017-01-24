package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception

        //1
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
//2
        try
        {
           int a[]=new int[-1];

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        //3
        try
        {
            int a[]=new int[1];
            for (int i = 0; i <=a.length; i++)
            {
                a[i]=i;
            }

        } catch (Exception e)
        {
            exceptions.add(e);
        }
//4
        try
        {
            String s = "edwrwer";
            int i = Integer.parseInt(s);
            System.out.println( i);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
//5
        try
        {
            String s = "ss";
            char chr = s.charAt(10);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        //6
        try
        {
            int[] array = new int[5];
            array = null;
            int i = array.length;
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
//7
        try
        {
            InputStream is = new FileInputStream("111.txt");
        }
        catch (Exception  e)
        {
            exceptions.add(e);
        }
        //8
        try
        {
            Integer.parseInt("fwefwegwag");
        }
        catch (Exception  e)
        {
            exceptions.add(e);
        }
        //9
        try
        {
            Object i = Integer.valueOf(10);
            String s = (String)i;
        }
        catch (Exception  e)
        {
            exceptions.add(e);
        }
        try
        {
            List list = null;
            list.add(1);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
