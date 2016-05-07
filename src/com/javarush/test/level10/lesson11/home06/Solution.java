package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы

        String name;
        int age;
        boolean sex;
        Human mother;
        Human father;
        Human child;

        public Human(String name, int age, Human mother, Human father)
        {
            this.name = name;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human()
        {

        }

        public Human(String name, int age)
        {

            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex, Human mother, Human father, Human child)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            this.child = child;
        }

        public Human(String name, int age, boolean sex)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, Human mother, Human father)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, Human mother, Human father)
        {

            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, Human mother, Human father)
        {
            this.name = name;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, Human mother, Human father, Human child)
        {

            this.name = name;
            this.mother = mother;
            this.father = father;
            this.child = child;
        }
    }
}
