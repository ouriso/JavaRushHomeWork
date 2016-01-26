package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayOfMonths = {"January", "Febrary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        list = Arrays.asList(arrayOfMonths);
        String str = reader.readLine();
        int numberOfMonth = list.indexOf(str) + 1;
        System.out.println(str + " is " + numberOfMonth + " month");
    }

}
