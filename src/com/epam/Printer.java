package com.epam;

import java.text.NumberFormat;

public class Printer {
    NumberFormat formatter = NumberFormat.getNumberInstance();

    public String print(double matrixOrigin[][]) {
        System.out.println("This matrix was typed :");
        for (int i = 0; i < matrixOrigin.length; i++) {
            for (int j = 0; j < matrixOrigin.length; j++) {
                System.out.print(formatter.format(matrixOrigin[i][j]) + "\t");
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }

    public String printWorkMatrix(double matrixForWork[][]) {
        System.out.println();
        System.out.println("This is work matrix: ");
        for (int i = 0; i < matrixForWork.length; i++) {
            for (int j = 0; j < 2 * matrixForWork.length; j++) {
                System.out.print(formatter.format(matrixForWork[i][j]) + "\t");
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }

    public String printRevertMatrix(double matrixForWork[][]) {
        System.out.println("Revert matrix: ");
        outer:
        for (int i = 0; i < matrixForWork.length; i++) {
            for (int j = matrixForWork.length; j < 2 * matrixForWork.length; j++) {
                if (Double.isNaN(matrixForWork[i][j]) || (Double.isInfinite(matrixForWork[i][j]))) {
                    System.out.println("The matrix is not calculated. Please type new matrix.");
                    break outer;
                } else {
                    System.out.printf("%8.3f", matrixForWork[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        return toString();
    }
}