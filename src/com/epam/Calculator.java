package com.epam;

public class Calculator {
    public static void createWorkMatrix(double matrixOrigin[][], double matrixForWork[][]) {
        for (int i = 0; i < matrixOrigin.length; i++) {
            for (int j = 0; j < matrixOrigin.length; j++) {
                matrixForWork[i][j] = matrixOrigin[i][j];
            }
        }

        for (int i = 0; i < matrixOrigin.length; i++) {
            for (int j = matrixOrigin.length; j < 2 * matrixOrigin.length; j++) {
                if (i + matrixOrigin.length == j) {
                    matrixForWork[i][j] = 1;
                } else {
                    matrixForWork[i][j] = 0;
                }
            }
        }
    }

    public static void calculate(double matrixForWork[][]) {
        for (int k = 0; k < matrixForWork.length; k++) {
            for (int i = k; i < matrixForWork.length; i++) {
                double temp = matrixForWork[k][k];
                for (int j = k; j < 2 * matrixForWork.length; j++) {
                    matrixForWork[i][j] = matrixForWork[i][j] / temp;
                }
            }

            for (int i = 0; i < matrixForWork.length; i++) {
                double temp = matrixForWork[i][k];
                for (int j = 0; j < 2 * matrixForWork.length; j++) {
                    if (i != k) {
                        matrixForWork[i][j] = matrixForWork[i][j] - matrixForWork[k][j] * temp;
                    }
                }
            }
        }
    }
}
