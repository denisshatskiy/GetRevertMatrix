package com.epam;

import java.text.NumberFormat;

public class Printer {
    NumberFormat formatter = NumberFormat.getNumberInstance();

    public void print(double[][] ArrayList) {
        outer:
        for (int i = 0; i < ArrayList.length; i++) {
            for (int j = 0; j < ArrayList[i].length; j++) {
                if (Double.isNaN(ArrayList[i][j]) || (Double.isInfinite(ArrayList[i][j]))) {
                    System.out.println("The matrix is not calculated. Please type new matrix.");
                    break outer;
                } else {
                    System.out.print(formatter.format(ArrayList[i][j]) + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}