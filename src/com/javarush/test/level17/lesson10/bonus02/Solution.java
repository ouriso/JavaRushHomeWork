package com.javarush.test.level17.lesson10.bonus02;

import com.javarush.test.level17.lesson10.bonus01.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        if (args[0].equals("-c")) {
            create(args);

        } else if (args[0].equals("-u")) {
            update(args);

        } else if (args[0].equals("-d")) {
            delete(args);

        } else if (args[0].equals("-i")) {
            info(args);
        }
    }

    public synchronized static void create(String[] args) {
        int index;
        int numberOfPersons= (args.length - 1) / 3;
        Date d = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String name = "";

        for(int i = 0; i < numberOfPersons; i++)
        {
            int k = 2 + (i*3);
            name = args[k - 1];
            boolean x = true;
            while (x)
            {
                if(("м").equals(args[k]) || args[k].equals("ж")) break;
                name = name.concat(args[k]);
                k++;
            }

            try
            {
                d = format.parse(args[k + 1]);
            }
            catch (ParseException e)
            {
            }

            if (args[k].equals("м"))
            {
                allPeople.add(Person.createMale(name, d));
            } else if (args[k].equals("ж"))
            {
                allPeople.add(Person.createFemale(name, d));
            }

            index = allPeople.size() - 1;
            System.out.println(index);
        }

/*        DateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for(Person p : allPeople) {
            char c = p.getSex().equals(Sex.FEMALE) ? 'ж' : 'м';
            System.out.println(p.getName() + " " + c + " " + format1.format(p.getBirthDay()));
        }*/
    }
    public synchronized static void update(String[] args) {
        int numberOfPersons = (args.length - 1) / 4;
        int index;
        Date d = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person;
        String name = "";

        for(int i = 0; i < numberOfPersons; i++)
        {
            index = Integer.parseInt(args[1 + (i*4)]);
            person = allPeople.get(index);

            int k = 3 + (i*4);
            name = args[k - 1];
            boolean x = true;
            while (x)
            {
                if(("м").equals(args[k]) || args[k].equals("ж")) break;
                name = name.concat(args[k]);
                k++;
            }

            person.setName(name);
            if (args[k].equals("м"))
            {
                person.setSex(Sex.MALE);
            } else if (args[k].equals("ж"))
            {
                person.setSex(Sex.FEMALE);
            }
            try
            {
                d = format.parse(args[k + 1]);
            }
            catch (ParseException e)
            {
            }

            person.setBirthDay(d);
        }

/*        DateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for(Person p : allPeople) {
            char c = p.getSex().equals(Sex.FEMALE) ? 'ж' : 'м';
            System.out.println(p.getName() + " " + c + " " + format1.format(p.getBirthDay()));
        }*/
    }
    public synchronized static void delete(String[] args) {
        int numberOfPersons = (args.length - 1);
        int index;
        Person person;
        for(int i = 0; i < numberOfPersons; i++)
        {
            index = Integer.parseInt(args[1 + i]);
            person = allPeople.get(index);
            person.setBirthDay(null);
            person.setSex(null);
            person.setName(null);
        }
    }
    public static void info(String[] args) {
        int numberOfPersons = (args.length - 1);
        int index;
        DateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person;
        for(int i = 0; i < numberOfPersons; i++)
        {
            index = Integer.parseInt(args[1 + i]);
            person = allPeople.get(index);
            char c = person.getSex().equals(Sex.FEMALE) ? 'ж' : 'м';
            System.out.println(person.getName() + " " + c + " " + format1.format(person.getBirthDay()));
        }

    }
}
