package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human man = new Human("Egor");
        Human man1 = new Human("Egor", 35, "Elena", 2, "Vlad", "Olya");
        Human man2 = new Human("Egor", 35, 2, "Vlad", "Olya");
        Human man3 = new Human("Egor", 35, "Vlad", "Olya");
        Human man4 = new Human("Egor", 35, "Elena", 1, "Vlad");
        Human man5 = new Human("Egor", 35, "Elena", "Olya", 1);
        Human man6 = new Human("Egor", 35);
        Human man7 = new Human("Egor", 35, "Elena");
        Human man8 = new Human("Egor", 35, 2);
        Human man9 = new Human("Egor", 35, "Elena", 2);
    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        int kids;
        String wife;
        String daughterName;
        String sonName;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String wife)
        {
            this.name = name;
            this.age = age;
            this.wife = wife;
        }

        public Human(String name, int age, int kids)
        {
            this.name = name;
            this.age = age;
            this.kids = kids;
        }

        public Human(String name, int age, String wife, int kids)
        {
            this.name = name;
            this.age = age;
            this.wife = wife;
            this.kids = kids;
        }

        public Human(String name, int age, String wife, int kids, String sonName)
        {
            this.name = name;
            this.age = age;
            this.wife = wife;
            this.kids = kids;
            this.sonName = sonName;
        }

        public Human(String name, int age, String wife, String daughterName, int kids)
        {
            this.name = name;
            this.age = age;
            this.wife = wife;
            this.kids = kids;
            this.daughterName = daughterName;
        }

        public Human(String name, int age, String wife, int kids, String sonName, String daughterName)
        {
            this.name = name;
            this.age = age;
            this.wife = wife;
            this.kids = kids;
            this.sonName = sonName;
            this.daughterName = daughterName;
        }

        public Human(String name, int age, int kids, String sonName, String daughterName)
        {
            this.name = name;
            this.age = age;
            this.kids = kids;
            this.sonName = sonName;
            this.daughterName = daughterName;
        }

        public Human(String name, int age, String sonName, String daughterName)
        {
            this.name = name;
            this.age = age;
            this.sonName = sonName;
            this.daughterName = daughterName;
        }
    }
}
