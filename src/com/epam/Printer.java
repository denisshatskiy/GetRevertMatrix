package com.epam;

import java.text.NumberFormat;

public class Printer {
    public void print(double[][] workMatrix) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        for (int i = 0; i < workMatrix.length; i++) {
            for (int j = 0; j < workMatrix[i].length; j++) {
                if (Double.isNaN(workMatrix[i][j]) || (Double.isInfinite(workMatrix[i][j]))) {
                    System.out.println("The matrix is not calculated. Please type new matrix.");
                    return;
                } else {
                    System.out.print(formatter.format(workMatrix[i][j]) + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}