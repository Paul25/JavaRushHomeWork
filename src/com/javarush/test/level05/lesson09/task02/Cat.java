package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public String name=null;
    public int weight=5;
    public int age=0;
    public String color="red";
    public String adress=null;
    public Cat(String name){
        this.name=name;
        this.color = color;
        this.weight = weight;
        this.age=age;
        this.adress=adress;
    }
    public Cat(String name,int weight, int age){
        this.name=name;
        this.color = color;
        this.weight = weight;
        this.age=age;
        this.adress=adress;
    }

        public Cat(String name,int age)
        {
            this.name=name;
            this.color = color;
            this.weight = weight;
            this.age=age;
            this.adress=adress;
    }
    public Cat(int weight, String color)
    {
        this.name=name;
        this.color = color;
        this.weight = weight;
        this.age=age;
        this.adress=adress;
    }
    public Cat(String color, int weight, String adress)
    {
        this.name=name;
        this.color = color;
        this.weight = weight;
        this.age=age;
        this.adress=adress;
    }
}
