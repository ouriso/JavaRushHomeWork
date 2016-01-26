package com.javarush.test.level11.lesson06.task03;

/* В гостях у бабушки
Написать шесть классов: Animal (животное), Cow(корова) и Pig(свинья), Sheep(овца), Bull(бык), Goat(козел).
Унаследовать корову, свинью, овцу, быка и козла от животного.
*/

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Animal
    {
        String kopyta;
    }

    public class Cow extends Animal
    {
        String roga;
        Object vymya;
    }

    public class Pig extends Animal
    {
        Object hryak;
    }

    public class Sheep extends Animal
    {
        Object sherst;
    }

    public class Bull extends Animal
    {
        Object roga;
    }

    public class Goat extends Animal
    {
        Object lob;
    }

}
