package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> a = new ArrayList<String>();
        for (int j=0;j<5; j++){
            //a.add(j,"qwerty");
            a.add("a");
            a.add("b");
            a.add("c");
            a.add("d");
            a.add("e");

        }
        int n=a.size();
        System.out.println(n);
        for (int i=0; i<5;i++){
            System.out.println(a.get(i));
        }
    }
}
