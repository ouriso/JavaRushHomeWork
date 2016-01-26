package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        printMatrix((long) m, n, (String) value);
    }
    public static void printMatrix(long m, int n, String s)
    {
        long a = m/(short)n;
        System.out.println(a + s);
        printMatrix(a, m, 'c');
    }
    public static void printMatrix(long m, long n, char s)
    {
        printMatrix((int) n, m, s);
    }
    public static void printMatrix(int m, long n, char s)
    {
        double a = (double)n/m;
        printMatrix(a, n, s);
    }
    public static void printMatrix(double m, long n, char s)
    {
        n = (int) s / (n+1);
        printMatrix(n, m, s);
    }
    public static void printMatrix(long m, double n, char s)
    {
        char a = (char) m;
        printMatrix(a, n, s);
    }
    public static void printMatrix(char m, double n, char s)
    {
        char a = (char)(m + s);
        printMatrix(m, a, s);
    }
    public static void printMatrix(char m, char n, char s)
    {
        int a = (int) s;
        printMatrix(m, n, a);
    }
    public static void printMatrix(char m, char n, int s)
    {
        System.out.println(m + n + s);
    }

}
