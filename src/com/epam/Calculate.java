package com.epam;

/**
 * Created by Denis_Shatskiy on 10/28/2015.
 */
public class Calculate {
    public static double[][] createWorkMatrix(double matrix[][], double matrixOne[][], int row, int col, int size) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixOne[i][j] = matrix[i][j];
            }
        }

        //add matrix from 1-s
        for (int i = 0; i < row; i++) {
            for (int j = col; j < 2 * col; j++) {
                if (i + col == j) {
                    matrixOne[i][j] = 1;
                } else {
                    matrixOne[i][j] = 0;
                }
            }
        }
    return matrixOne;
    }
    public static double[][] calculate(double matrixOne[][], int row, int col, int size) {
        for (int k = 0; k < row; k ++) {
            for (int i = k; i < row; i++) {
                double temp = matrixOne[k][k];
                for (int j = k; j < 2 * col; j++) {
                    matrixOne[i][j] = matrixOne[i][j] / temp;
                }
            }

            for (int i = 0; i < row; i++) {
                double temp = matrixOne[i][k];
                for (int j = 0; j < 2 * row; j++) {
                    if (i == k) {
                    } else {
                        matrixOne[i][j] = matrixOne[i][j] - matrixOne[k][j] * temp;
                    }
                }
            }
        }
        return matrixOne;
    }
}
