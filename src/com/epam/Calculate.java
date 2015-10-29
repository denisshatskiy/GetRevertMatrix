package com.epam;

/**
 * Created by Denis_Shatskiy on 10/28/2015.
 */
public class Calculate {
    public static double[][] createWorkMatrix(double matrixOrigin[][], double matrixForWork[][], int row, int column, int size) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixForWork[i][j] = matrixOrigin[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = column; j < 2 * column; j++) {
                if (i + column == j) {
                    matrixForWork[i][j] = 1;
                } else {
                    matrixForWork[i][j] = 0;
                }
            }
        }
        return matrixForWork;
    }
    public static double[][] calculate ( double matrixForWork[][], int row, int col, int size){
        for (int k = 0; k < row; k++) {
            for (int i = k; i < row; i++) {
                double temp = matrixForWork[k][k];
                for (int j = k; j < 2 * col; j++) {
                    matrixForWork[i][j] = matrixForWork[i][j] / temp;
                }
            }

            for (int i = 0; i < row; i++) {
                double temp = matrixForWork[i][k];
                for (int j = 0; j < 2 * row; j++) {
                    if (i == k) {
                    } else {
                        matrixForWork[i][j] = matrixForWork[i][j] - matrixForWork[k][j] * temp;
                    }
                }
            }
        }
        return matrixForWork;
    }
}
