package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Marchenko on 02.07.2016.
 */
public class UkrainianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {

        return 5;
    }
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.UKRAINE +". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";

    }
}
