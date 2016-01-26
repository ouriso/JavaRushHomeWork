package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human>  list = new ArrayList<Human>();
        ArrayList<Human>  childrens = new ArrayList<Human>();
        ArrayList<Human>  children1 = new ArrayList<Human>();
        ArrayList<Human>  children2 = new ArrayList<Human>();
        list.add(new Human("Anton", true, 12));
        list.add(new Human("Vasya", true, 7));
        list.add(new Human("Masha", false, 3));
        childrens.add(list.get(0));
        childrens.add(list.get(1));
        childrens.add(list.get(2));
        list.add(new Human("Maria", false, 35, childrens));
        list.add(new Human("Viktor", true, 37, childrens));
        children1.add(list.get(3));
        children2.add(list.get(4));
        list.add(new Human("Olga", false, 68, children1));
        list.add(new Human("Boba", false, 65, children2));
        list.add(new Human("Fedor", true, 70, children1));
        list.add(new Human("Kolya", true, 72, children2));


        for(int i = list.size() - 1; i > -1; i--)
        {
            System.out.println(list.get(i));
        }

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
