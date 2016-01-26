package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfFile = "";
        BufferedWriter file;
        try
        {
            nameOfFile = reader.readLine();
        } catch (IOException e){}

        try
        {
            file = new BufferedWriter(new FileWriter(nameOfFile));
            String str;
            while (!(str=reader.readLine()).equals("exit"))
            {
                file.write(str);
                file.write("\r\n");
            }
            file.write("exit");
            file.close();
            reader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        } catch (IOException e){}
    }
}
