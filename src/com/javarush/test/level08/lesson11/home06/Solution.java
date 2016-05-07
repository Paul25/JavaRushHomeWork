package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human son1=new Human("Son", true, 10,new ArrayList<Human>());
        Human son2=new Human("Sen", true, 14,new ArrayList<Human>());
        Human daut1=new Human("Pon", false, 8,new ArrayList<Human>());
        ArrayList<Human> child=new ArrayList<Human>();
        child.add(son1);
        child.add(son2);
        child.add(daut1);
        Human father = new Human("pap", true, 40, child);
        Human mother = new Human("mam", false, 35, child);
        ArrayList<Human> par1 = new ArrayList<Human>();
        ArrayList<Human> par2 = new ArrayList<Human>();
        par2.add(father);
        par1.add(mother);

        Human gfather1 = new Human("ded1", true, 70, par1);
        Human gmother1 = new Human("bab1", false, 65, par1);
        Human gfather2 = new Human("ded2", true, 70, par2);
        Human gmother2 = new Human("bab2", false, 65, par2);
        //output
        System.out.println(gfather1.toString());
        System.out.println(gmother1.toString());
        System.out.println(gfather2.toString());
        System.out.println(gmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daut1.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        Human gfather;
        Human gmother;
        Human father;
        Human mother;
        ArrayList<Human> children;



        public  Human(String name, boolean sex,int age,ArrayList<Human> children)

        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;

        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
