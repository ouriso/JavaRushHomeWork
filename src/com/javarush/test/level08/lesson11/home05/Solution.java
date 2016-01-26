package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length - 1; i++)
        {
            if(charArray[0] != ' ') charArray[0] = Character.toUpperCase(charArray[0]);
            if(charArray[i] == ' ' && charArray[i+1] != ' ') charArray[i+1] = Character.toUpperCase(charArray[i+1]);
        }
        s = s.copyValueOf(charArray);
        System.out.println(s);
    }


}
