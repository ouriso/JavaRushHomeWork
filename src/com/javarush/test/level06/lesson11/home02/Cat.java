package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
    }
    //напишите тут ваш код
    public String name;
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    public Cat(int name) {
        this.name = Integer.toString(name);
    }
 /*   public static void getName() {

    }*/

    public static void main(String[] args) {
        //Создай тут 10 котов
        for (int i = 0; i < 10; i++)
        {
            cats.add(new Cat(i));
        }
        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
        for (int i = 0; i < cats.size(); i++)
        {
            System.out.println(cats.get(i));
        }
    }
}
