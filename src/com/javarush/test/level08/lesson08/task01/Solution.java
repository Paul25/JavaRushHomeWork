package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++)
        {
            set.add("Лой");
            set.add("Лоц");
            set.add("Лоу");
            set.add("Лок");
            set.add("Лое");
            set.add("Лон");
            set.add("Лог");
            set.add("Лош");
            set.add("Лоф");
            set.add("Лов");
            set.add("Лоа");
            set.add("Лоп");
            set.add("Лор");
            set.add("Лоо");
            set.add("Лол");
            set.add("Лод");
            set.add("Лож");
            set.add("Лоч");
            set.add("Лос");
            set.add("Лот");

        }
        return (HashSet<String>) set;

    }
}
