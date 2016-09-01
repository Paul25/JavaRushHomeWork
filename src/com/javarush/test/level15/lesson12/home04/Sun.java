package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Marchenko on 25.07.2016.
 */
public class Sun implements Planet
{
    private static Sun instance;

    private Sun()
    {

    }



    public static Sun getInstance()
    {
        if (instance == null)
        {
            instance = new Sun();
        }
        return instance;
    }
}
