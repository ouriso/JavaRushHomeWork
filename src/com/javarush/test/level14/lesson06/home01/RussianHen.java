package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Артур on 21.12.2015.
 */
class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 13;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth()  + " яиц в месяц.";
    }
}
