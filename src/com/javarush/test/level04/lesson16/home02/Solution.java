package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());
        int buf;
        if (a > b){
            buf = a;
            a = b;
            b = buf;
        }
        if (b > c){
            buf = b;
            b = c;
            c = buf;
        }
        if (a > b){
            buf = a;
            a = b;
            b = buf;
        }
            System.out.println(b);
    }
}
