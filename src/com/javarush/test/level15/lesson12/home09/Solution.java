package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String subs = "";
        Double d;
        try
        {
            str = reader.readLine();
            reader.close();
        } catch (IOException e)
        {
            System.out.println("IOE");
        }
        int index = str.indexOf('?');
        subs = str.substring(index+1);
//        System.out.println(subs);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (true)
        {
            if((index = subs.indexOf('&')) != -1)
            {
                arrayList.add(subs.substring(0, index));
                subs = subs.substring(index+1);
            } else
            {
                arrayList.add(subs.substring(0));
                break;
            }
        }

//        System.out.println(arrayList);
        String k = "";
        for(String s : arrayList)
        {
            if((index = s.indexOf('=')) != -1)
            {
                subs = s.substring(0, index);
                System.out.print(subs + " ");
                if(("obj".equals(subs)))
                {
                    k = s.substring(index+1);
                }
            } else System.out.print(s + " ");
        }
        System.out.println();

        if(!("").equals(k))
        {
            if (k.matches("[\\-?\\d+\\.?]+"))
            {
                d = Double.parseDouble(k);
                alert(d);
            } else alert(k);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
