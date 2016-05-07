package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String,String> map=new HashMap<String,String>();
        map.put("Big","Ben");
        map.put("Bog","Bin");
        map.put("Bag","Bon");
        map.put("Bod","Bin");
        map.put("Buyg","Ban");
        map.put("Byg","Bun");
        map.put("Bug","Byn");
        map.put("Bleg","Beln");
        map.put("Belg","Blen");
        map.put("Balg","Blan");
        return  (HashMap) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count=0;
        /*Iterator<HashMap.Entry<String,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String,String> data=iterator.next();
            String value=data.getKey();
            if (value.equals(name)){
                count++;
            }
        }*/
        for(Map.Entry<String, String> m : map.entrySet()){
                if(m.getValue().equals(name))
                count++;
            }
        return  count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count1=0;
        /*Iterator<HashMap.Entry<String,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String,String> data=iterator.next();
            String key=data.getValue();
            if (key.equals(lastName)){
                count++;
            }
        }*/
        for(Map.Entry<String, String> m1 : map.entrySet()){
            if(m1.getKey().equals(lastName))
                count1++;
            }
        return  count1;

    }

}
