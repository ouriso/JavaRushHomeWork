package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Артур on 21.12.2015.
 */
class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 7;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth()  + " яиц в месяц.";
    }
}