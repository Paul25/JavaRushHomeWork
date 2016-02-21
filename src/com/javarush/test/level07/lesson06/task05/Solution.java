package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            String stroka=reader.readLine();
            list.add(stroka);
        }
        for (int k = 0; k < 13 ; k++)

        {
            String s=list.get(list.size()-1);
            String delete=list.remove(list.size()-1);
            list.add(0,s);
        }
        for (int j = 0; j < 5; j++)
        {
            System.out.println(list.get(j));
        }
    }
}
