package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Артур on 22.12.2015.
 */
public class Sin
{
    private static Sin ourInstance;

    public static Sin getInstance()
    {
        if(ourInstance == null) ourInstance = new Sin();
        return ourInstance;
    }

    private Sin()
    {
//        System.out.println(this.getClass());
    }
}
