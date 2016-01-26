package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> list = new ArrayList<Human>();
//        Human gf1 = new Human("Nikolay", true, 78, null, null);
        list.add(new Human("Nikolay", true, 78, null, null));
//        Human gf2 = new Human("Arseniy", true, 75, null, null);
        list.add(new Human("Arseniy", true, 75, null, null));
//        Human gm1 = new Human("Alevtina", false, 77, null, null);
        list.add(new Human("Alevtina", false, 77, null, null));
//        Human gm2 = new Human("Ursula", false, 76, null, null);
        list.add(new Human("Ursula", false, 76, null, null));
//        Human father = new Human("Oleg", true, 55, gf1, gm1);
        list.add(new Human("Oleg", true, 55, list.get(0), list.get(2)));
//        Human mother = new Human("Svetlana", false, 53, gf2, gm2);
        list.add(new Human("Svetlana", false, 53, list.get(1), list.get(3)));
//        Human son1 = new Human("Fedya", true, 15, father, mother);
        list.add(new Human("Fedya", true, 15, list.get(4), list.get(5)));
//        Human daughter = new Human("Olya", false, 13, father, mother);
        list.add(new Human("Olya", false, 13, list.get(4), list.get(5)));
//        Human son2 = new Human("Ilya", true, 7, father, mother);
        list.add(new Human("Ilya", true, 7, list.get(4), list.get(5)));

        for(int i = 0; i < list.size(); i++)
        System.out.println(list.get(i));
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
