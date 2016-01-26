package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfFile = "";
        InputStream file;
//        StringBuilder sb = new StringBuilder();
        try
        {
            nameOfFile = reader.readLine();
            reader.close();
        } catch (IOException e){}

        try
        {
            file = new FileInputStream(nameOfFile);
            int c;
            while((c = file.read()) != -1)
            {
 /*               sb.append(file.readLine());
                sb.append("\n");*/
                System.out.print((char)c);
            }
            file.close();
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        } catch (IOException e){}
//        System.out.println(sb.toString());
    }
}
