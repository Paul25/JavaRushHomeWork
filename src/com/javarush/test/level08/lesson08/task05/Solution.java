package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> mas = new HashMap<String, String>(map);
        for (String value : mas.values())
            if (Collections.frequency(mas.values(), value) > 1)
                removeItemFromMapByValue(map, value);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
