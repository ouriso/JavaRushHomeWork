package com.javarush.test.level10.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и
выводит на экран содержимое HashMap.
*/

public class Solution {
    static HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {
        map = new HashMap<Integer, String>();
        //map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            index = Integer.parseInt(reader.readLine());
            name = reader.readLine();
            map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
