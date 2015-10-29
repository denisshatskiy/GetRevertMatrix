package com.epam;

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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2 * column; j++) {
                System.out.printf("%8.3f", matrixForWork[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }
    public String printRevertMatrix(double matrixForWork[][], int row, int column) {
        System.out.println("Revert matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = column; j < 2 * column; j++) {
                System.out.printf("%8.3f", matrixForWork[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }
}
