package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printCatSet(createMap().keySet());
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        Map<String, Cat> cat1 = new HashMap<>();
        for (int i = 0; i <10 ; i++)
        {
            cat1.put(cats[i], new Cat(cats[i]));
        }
        return cat1;
    }


    public static void printCatSet(Set<String> catNames) {
        for (String catName : catNames) {
            System.out.println(catName);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
