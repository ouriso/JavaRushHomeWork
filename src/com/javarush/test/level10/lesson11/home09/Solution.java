package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) не влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)/*new FileReader("C:\\JDeveloper\\1.txt")*/);

        ArrayList<String> words = new ArrayList<String>();

 /*       String s;
        while((s = reader.readLine()) != null)
        {
            System.out.println(s);
            words.add(s);
        }
        System.out.println(words.size());*/
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        int count = 0;
        for(String temp : list)
        {
            if(result.containsKey(temp))
            {
      //          count = result.get(temp);
      //          count++;
                result.put(temp, result.get(temp) + 1);
            }
            else result.put(temp, 1);

        }

        return result;
    }

}
