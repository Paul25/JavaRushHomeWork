package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        *//*String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();*//*

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < 32; i++)
        {
            alphabet.add((char)( 'a'+i));
        }
        alphabet.add(6, 'ё');
        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код

        String stroka="";
        for (int i = 0; i <list.size() ; i++)
        {
            stroka+=list.get(i).toString();
        }
        for (Character char1: alphabet)
        {
            int count=0;
            for (Character char2: stroka.toCharArray())
            {
                if(char2.equals(char1)){
                    count++;
                }
            }
            System.out.println(char1 +" "+count);
        }*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }

        //склеить все строки в одну
        String s ="";
        for (int i=0;i<list.size();i++)
            s += list.get(i).toString();

        //бежим по массиву букв
        for (Character c1 : alphabet)
        {
            int count = 0;
            for (Character c2 : s.toCharArray()) //бежим по массиву строки
            {
                if (c2.equals(c1)) count++; //если символы совпадают, то счетчик +1
            }
            System.out.println(c1 + " " + count); // по окончании проверки печатаем и переходим к следующей букве
        }
    }

}
