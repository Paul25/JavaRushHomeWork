package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        Map<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Ptallone", new Date("JULY 1 1980"));
        map.put("Qtallone", new Date("AUGUST 1 1980"));
        map.put("Wtallone", new Date("MAY 1 1980"));
        map.put("Etallone", new Date("MARCH 1 1980"));
        map.put("Rtallone", new Date("APRIL 1 1980"));
        map.put("Dtallone", new Date("JANUARY 1 1980"));
        map.put("Ftallone", new Date("FEBRUARY 1 1980"));
        map.put("Gtallone", new Date("OCTOBER 1 1980"));
        map.put("Vtallone", new Date("DECEMBER 1 1980"));
        //напишите тут ваш код
        return (HashMap<String, Date>) map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {


        //напишите тут ваш код
       /* Iterator<Map.Entry<String,Date>> s=map.entrySet().iterator();
        while (s.hasNext()){
            if(s.next().getValue().getMonth()>4 && s.next().getValue().getMonth()<8 )
               s.remove();
        }*/
        ArrayList<String> array = new ArrayList<String>();
        for(Map.Entry<String, Date> m : map.entrySet())
        {
            if (m.getValue().getMonth() > 4 && m.getValue().getMonth() < 8)
            {

                array.add(m.getKey());
            }
        }
        for (int i = 0; i < array.size(); i++)
        {
            map.remove(array.get(i));
        }
    }
}
