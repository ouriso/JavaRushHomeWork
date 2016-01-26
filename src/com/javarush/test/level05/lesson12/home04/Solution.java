package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
/*        NewDate date = new NewDate(20, 9, 2015);
        System.out.println(date.day + " " + date.month + " " + date.year);*/
        int day = 20;
        int month = 9;
        int year = 2015;
        System.out.println(day + " 0" + month + " " + year);
    }
/*    public static class NewDate
    {
        int day;
        int month;
        int year;
        public NewDate(int day, int month, int year)
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }*/
}
