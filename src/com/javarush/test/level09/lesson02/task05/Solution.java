package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int n = getStackTraceDeep();
        System.out.println(n);
    }
    public static int getStackTraceDeep()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int numberOfElements = stackTraceElements.length;
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return numberOfElements;
    }
}
