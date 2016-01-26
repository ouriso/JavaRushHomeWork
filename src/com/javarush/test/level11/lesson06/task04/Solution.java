package com.javarush.test.level11.lesson06.task04;

/* Все мы работники
Написать четыре класса: Employee(сотрудник), Manager(управляющий), Chief(директор) и  Secretary(секретарь).
Унаследовать управляющего, директора и секретаря от сотрудника.
*/

public class Solution
{
    public class Manager extends Employee
    {
        String lair;
    }

    public class Chief extends Employee
    {
        String poltrona;
    }

    public class Employee
    {
        String table;
    }

    public class Secretary extends Employee
    {
        String dress;
    }
}
