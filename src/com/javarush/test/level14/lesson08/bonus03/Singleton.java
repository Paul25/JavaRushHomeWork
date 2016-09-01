package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Marchenko on 05.07.2016.
 */
public class Singleton
{

    static Singleton instance=null;
    private Singleton()
    {
    }

    static Singleton getInstance(){
        return instance;

    }
}
