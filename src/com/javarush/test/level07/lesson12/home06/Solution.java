package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gFather1 = new Human("Dick", true, 57, null, null);
        Human gMother1 = new Human("Molly", false, 56, null, null);
        Human gFather2 = new Human("Rich", true, 58, null, null);
        Human gMother2 = new Human("Dolly", false, 59, null, null);
        Human father = new Human("Gui", true, 22, gFather1, gMother1);
        Human mother = new Human("Nino", false, 21, gFather2, gMother2);
        Human child1 = new Human("Alex", true, 2, father, mother);
        Human child2 = new Human("Mark", true, 3, father, mother);
        Human child3 = new Human("Nick", true, 57, father, mother);

        System.out.println(gFather1.toString());
        System.out.println(gMother1.toString());
        System.out.println(gFather2.toString());
        System.out.println(gMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }


    public static class Human
    {
        //напишите тут ваш код

        String name;
        int age;
        boolean sex;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
