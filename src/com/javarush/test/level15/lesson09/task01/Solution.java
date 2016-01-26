package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(165d, "1");
        labels.put((double)12, "afdsf");
        labels.put(324d, "asd");
        labels.put(3252d, "erhe");
        labels.put(1351.165, " ");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
