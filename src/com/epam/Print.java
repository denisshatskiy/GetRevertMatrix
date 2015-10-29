package com.epam;

/**
 * Created by Denis_Shatskiy on 10/28/2015.
 */
public class Print {
    public String Print(double matrix[][]) {
        System.out.println("This matrix was typed :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%8.3f", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }

    public String PrintWorkMatrix(double matrixOne[][], int row, int col) {
        System.out.println("This is work matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2 * col; j++) {
                System.out.printf("%8.3f", matrixOne[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }
    public String PrintRevertMatrix(double matrixOne[][], int row, int col) {
        System.out.println("Revert matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = col; j < 2 * col; j++) {
                System.out.printf("%8.3f", matrixOne[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return toString();
    }


}
