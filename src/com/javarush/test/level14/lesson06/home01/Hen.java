package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Артур on 21.12.2015.
 */
abstract class Hen
{
    abstract int getCountOfEggsPerMonth();
    String getDescription()
    {
        String s = "Я курица.";
        return s;
    }
}
