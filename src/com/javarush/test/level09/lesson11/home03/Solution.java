package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а) этого метода
в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные
числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();
        String str;
        try
        {
            while (true)
            {
                str = reader.readLine();
 //               if (str.isEmpty()) break;
                arrayOfNumbers.add(Integer.parseInt(str));
            }
        }
        catch (IOException e)
        {
//            System.out.println(e);
        }
        catch (NumberFormatException e)
        {
            for (Integer list : arrayOfNumbers)
            {
                System.out.println(list);
            }
        }

    }
}
