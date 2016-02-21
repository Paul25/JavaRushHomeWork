package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> a=new ArrayList<>();
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++){
            String s=r.readLine();
            a.add(s);
        }

        System.out.println(a);


        a.sort(new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return o1.length() - o2.length();
            }
        });

        System.out.println(a);
        int minLength = a.get(0).length();
        int i = 0;
while (i < 5 && a.get(i).length()<=minLength){
    System.out.println(a.get(i));
    i++;
}

        int q=a.get(0).length();
    String z=a.get(0);;
        for(int j=1; j<5; j++){
            if (a.get(j).length()<q){
                q=a.get(j).length();
                z=a.get(j);
            }

        }
        for (int k=0; k<5;k++){
            if (a.get(k).length()==q){
                System.out.println(a.get(k));
            }
        }

    }
}
