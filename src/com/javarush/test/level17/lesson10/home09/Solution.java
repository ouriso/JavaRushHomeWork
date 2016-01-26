package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName ="", fileName2 = "", str = "";
        try {
            fileName = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
        } catch (IOException e) {}
        File f = new File(fileName);
        File f2 = new File(fileName2);

        try {
            BufferedReader in = new BufferedReader(new FileReader(f));
            while ((str = in.readLine()) != null) {
                allLines.add(str);
            }

            in = new BufferedReader(new FileReader(f2));

            while ((str = in.readLine()) != null) {
                forRemoveLines.add(str);
            }
            in.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {}

        Solution sol = new Solution();
        try {
            sol.joinData();
        } catch (CorruptedDataException e) {
            System.out.println(e);
        }
/*        System.out.println(allLines);
        System.out.println(forRemoveLines);*/
    }

    public void joinData () throws CorruptedDataException {

        int counter = 0;
        if(allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

/*        if(counter == forRemoveLines.size()) {
            for(String s : forRemoveLines) {
                allLines.remove(s);
            }
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }*/
    }
}
