package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(args[0]);
        FileInputStream fis = new FileInputStream(file);
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        byte values[];
        char chars[] = new char[0];
        while(fis.available()>0){
            values=new byte[fis.available()];
            fis.read(values);
            chars=new String(values).toCharArray();
        }
        for (char ch:chars)
        {
            if(treeMap.containsKey(ch)){
                int d=treeMap.get(ch)+1;
                treeMap.put(ch,d);
            }
            else {
                treeMap.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> tm:treeMap.entrySet())
        {
            System.out.println(tm.getKey()+" "+tm.getValue());
            
        }
        fis.close();
    }
}
