package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Артур on 13.01.2016.
 */
public class Plane implements Flyable
{
    public void fly()
    {

    }

    int passengers;
    public Plane(int passengers)
    {
        this.passengers = passengers;
    }
}
