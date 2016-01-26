package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfName = reader.readLine();
        Cat grandFather = new Cat(gfName);

        String gmName = reader.readLine();
        Cat grandMother = new Cat(gmName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, grandFather, null);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, null, grandMother);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, father, mother);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, father, mother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent_m;
        private Cat parent_f;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent_f, Cat parent_m)
        {
            this.name = name;
            this.parent_m = parent_m;
            this.parent_f = parent_f;
        }

        @Override
        public String toString()
        {
            String str = "Cat name is " + name;
            if (parent_m == null) str = str + ", no mother, ";
            else str = str + ", mother is " + parent_m.name + ", ";
            if (parent_f == null) str = str + "no father ";
            else str = str + "father is " + parent_f.name;
                return str;

        }
    }

}
