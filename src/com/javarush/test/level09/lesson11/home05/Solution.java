package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] array = reader.readLine().toCharArray();
        ArrayList<Character> vovelsList = new ArrayList<Character>();
        ArrayList<Character> otherList = new ArrayList<Character>();

        for(int i = 0; i < array.length; i++)
        {
            if(isVowel(array[i]))
            {
                vovelsList.add(array[i]);
                vovelsList.add(' ');
            }
            else
            {
                if(array[i] != ' ')
                {
                    otherList.add(array[i]);
                    otherList.add(' ');
                }
                else otherList.add(array[i]);
            }
        }
        StringBuilder builderVov = new StringBuilder(vovelsList.size());
        for(Character ch: vovelsList)
        {
            builderVov.append(ch);
        }
        StringBuilder builderOth = new StringBuilder(otherList.size());
        for(Character ch: otherList)
        {
            builderOth.append(ch);
        }

        System.out.println(builderVov);
        System.out.println(builderOth);
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
