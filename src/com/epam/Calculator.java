package com.epam;

import java.util.Arrays;

public class Calculator {
    public double[][] createWorkMatrix(double matrixOrigin[][]) {
        double[][] matrixForWork = new double[matrixOrigin.length][matrixOrigin.length * 2];
        for (int i = 0; i < matrixOrigin.length; i++) {
            for (int j = 0; j < matrixOrigin.length; j++) {
                matrixForWork[i][j] = matrixOrigin[i][j];
            }
            for (int j = matrixOrigin.length; j < 2 * matrixOrigin.length; j++) {
                if (i + matrixOrigin.length == j) {
                    matrixForWork[i][j] = 1;
                } else {
                    matrixForWork[i][j] = 0;
                }
            }
        }
        return matrixForWork;
    }

    public double[][] calculate(double matrixForWork[][]) {
        double [][] matrixForCalculate = Arrays.copyOf(matrixForWork,matrixForWork.length);
        for (int k = 0; k < matrixForCalculate.length; k++) {
            for (int i = k; i < matrixForCalculate.length; i++) {
                double temp = matrixForCalculate[k][k];
                for (int j = k; j < 2 * matrixForCalculate.length; j++) {
                    matrixForCalculate[i][j] = matrixForCalculate[i][j] / temp;
                }
            }
            for (int i = 0; i < matrixForCalculate.length; i++) {
                double temp = matrixForCalculate[i][k];
                for (int j = 0; j < 2 * matrixForCalculate.length; j++) {
                    if (i != k) {
                        matrixForCalculate[i][j] = matrixForCalculate[i][j] - matrixForCalculate[k][j] * temp;
                    }
                }
            }
        }
        return matrixForCalculate;
    }
}
