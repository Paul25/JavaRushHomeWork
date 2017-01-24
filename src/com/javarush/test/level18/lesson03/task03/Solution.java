package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<Byte, Integer> findByte=new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        byte arr []= new byte[inputStream.available()];
        if (inputStream.available() > 0)
        {
            inputStream.read(arr);
        }
        inputStream.close();
        for (byte n:arr)
        {int count=0;
            for (byte n1:arr)
            {
                if (n==n1){
                    count++;
                }

            }
            findByte.put(n, count);

        }
        int maxByte=0;
        for (Map.Entry<Byte,Integer> map:findByte.entrySet() )
        {
            if(map.getValue()>maxByte)
            {
                maxByte = map.getValue();
            }

        }
        for (Map.Entry<Byte, Integer> map : findByte.entrySet())
        {
            if (map.getValue().equals(maxByte))
            {
                System.out.println(map.getKey() + " ");
            }
        }

    }
}
