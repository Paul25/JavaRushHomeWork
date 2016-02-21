package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.   Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:  дедушка Вася  бабушка Мурка  папа Котофей  мама Василиса  сын Мурчик  дочь Пушинка
*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grFatherName = reader.readLine();
        Cat catGrFather = new Cat(grFatherName );

        String grMotherName = reader.readLine();
        Cat catGrMother = new Cat(grMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrFather,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null,catGrMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catFather,catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catFather,catMother);

        System.out.println(catGrFather);
        System.out.println(catGrMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.print(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private  Cat mother;
        private  Cat farher;

        Cat(String name)
        {
            this.name = name;
            this.farher = farher;
            this.mother=mother;
            this.parent = parent;
        }

        Cat(String name, Cat parent)
    {
        this.name = name;
        this.parent = parent;
    }
        Cat(String name,Cat farher,Cat mother)
        {
            this.name = name;
            this.farher = farher;
            this.mother = mother;


        }
        /*Пример вывода:   Cat name is дедушка Вася, no mother, no father            Cat name is бабушка Мурка, no mother, no father
        Cat name is папа Котофей, no mother, father is дедушка Вася                Cat name is мама Василиса, mother is бабушка Мурка, no father
        Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей    Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей*/
        @Override
        public String toString()
        {
            if (farher == null && (mother==null))
                return "Cat name is " + name + ", no mother" + ", no father ";
            else if(mother == null)
                return "Cat name is " + name + ", no mother" + ", father is " + farher.name;
            else if(farher == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father ";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + farher.name;

        }
    }

}
















/*String grandfatherName = reader.readLine();
        Cat catGF = new Cat (grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGM = new Cat (grandmotherName);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, catGF, null);

        String momName = reader.readLine();
        Cat catMom = new Cat(momName, null, catGM);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catDad, catMom);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catDad, catMom);

        System.out.println(catGF);
        System.out.println(catGM);
        System.out.println(catDad);
        System.out.println(catMom);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat dad;
        private Cat mom;


        Cat(String name)
        {
            this.name = name;
        }
        Cat(String name, Cat dad, Cat mom)
        {
            this.name = name;
            this.dad = dad;
            this.mom = mom;
        }


        @Override
        public String toString()
        {

            if (dad == null & mom == null)
                return "Cat name is " + name + ", no mother, " + "no father";
            else if (mom == null)
                return "Cat name is " + name + ", no mother, father is " + dad.name;
            else if (dad == null)
                return "Cat name is " + name + ", mother is " + mom.name + ", no father";
            else return "Cat name is " + name + ", mother is " + mom.name + ", father is " + dad.name;
        }}}*/