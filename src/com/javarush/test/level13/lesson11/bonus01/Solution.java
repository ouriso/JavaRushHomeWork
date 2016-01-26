package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        File f = new File(fileName);
        BufferedReader in = new BufferedReader(new FileReader(f));
        ArrayList<Integer> ar = new ArrayList<Integer>();
        String str = "";
        while ((str = in.readLine()) != null)
        {
//            System.out.println(str);
            int temp = Integer.parseInt(str);
            if(temp%2 == 0)
                ar.add(temp);

        }
        in.close();
        reader.close();
        Collections.sort(ar);
        for(Integer a : ar)
        {
            System.out.println(a);
        }
    }
}
