package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int kol = 5, temp;
        int[] num = new int[kol];
        for(int i = 0; i < kol; i++)
        {
            num[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = kol; i > 1; i--)
        {
            for(int j = 0; j < i-1; j++)
            {
                if(num[j] > num[j+1])
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
//            System.out.println(num[i-1]);
        }

        for(int i = 0; i < kol; i++)
        {
            System.out.println(num[i]);
        }


        //напишите тут ваш код
    }
}
