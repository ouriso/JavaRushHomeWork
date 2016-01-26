package com.javarush.test.level17.lesson10.bonus01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        int index;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date d = new Date();

        if (args[0].equals("-c")) {
            try
            {
                d = format.parse(args[3]);
            } catch (ParseException e) {}
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], d));
            } else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], d));
            }
            index = allPeople.size() - 1;
            System.out.println(index);

        } else if (args[0].equals("-u")) {
            index = Integer.parseInt(args[1]);
            allPeople.get(index).setName(args[2]);
            if (args[0].equals("c"))
            {
                if (args[2].equals("м"))
                {
                    allPeople.get(index).setSex(Sex.MALE);
                } else if (args[2].equals("ж"))
                {
                    allPeople.get(index).setSex(Sex.FEMALE);
                }
            }
            try
            {
                d = format.parse(args[4]);
            } catch (ParseException e) {}

            allPeople.get(index).setBirthDay(d);
        } else if (args[0].equals("-d")) {
            index = Integer.parseInt(args[1]);
//            allPeople.remove(index);
            allPeople.get(index).setBirthDay(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setName(null);
        } else if (args[0].equals("-i")) {
            index = Integer.parseInt(args[1]);
            char c = allPeople.get(index).getSex().equals(Sex.FEMALE) ? 'ж' : 'м';
            System.out.println(allPeople.get(index).getName() + " " + c + " " + format1.format(allPeople.get(index).getBirthDay()));
        }
    }
}
