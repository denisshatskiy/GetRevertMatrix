package com.epam;

import java.util.Date;

/**
 * Created by Denis_Shatskiy on 10/28/2015.
 */
public class Print {
    public String print(double matrixOrigin[][]) {
        System.out.println("This matrix was typed :");
        for (int i = 0; i < matrixOrigin.length; i++) {
            for (int j = 0; j < matrixOrigin.length; j++) {
                System.out.printf("%8.3f", matrixOrigin[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }

    public String printWorkMatrix(double matrixForWork[][], int row, int column) {
        System.out.println();
        System.out.println("This is work matrix: ");
        for (int i = 0; i < matrixForWork.length; i++) {
            for (int j = 0; j < 2 * matrixForWork.length; j++) {
                System.out.printf("%8.3f", matrixForWork[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }

    public String printRevertMatrix(double matrixForWork[][]) {
        System.out.println("Revert matrix: ");
        for (int i = 0; i < matrixForWork.length; i++) {
            for (int j = matrixForWork.length; j < 2 * matrixForWork.length; j++) {
                if (Double.isNaN(matrixForWork[i][j]) || (Double.isInfinite(matrixForWork[i][j]))) {
                    System.out.println("The matrix is not calculated. Please type new matrix.");
                    break;
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
