package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        TreeMap<Byte,Integer> mapBytes = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream is = new FileInputStream(new File(fileName));
        byte arr[] = new byte[is.available()];
        if (is.available() > 0)
        {
            is.read(arr);
        }
        is.close();
        for (byte n : arr)
        {
            int count = 0;
            for (byte n1 : arr)
            {
                if (n == n1)
                {
                    count++;
                }

            }
            mapBytes.put(n, count);

        }
        int minBytes = mapBytes.firstEntry().getValue();
        for (Map.Entry<Byte, Integer> map : mapBytes.entrySet())
        {
            if(minBytes > map.getValue())
            {
                minBytes = map.getValue();
            }

        }
        for (Map.Entry<Byte, Integer> map:mapBytes.entrySet())
        {
            if(map.getValue().equals(minBytes)){
                System.out.println(map.getKey()+" ");
            }
            
        }


    }
}
