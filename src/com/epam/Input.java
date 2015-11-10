package com.epam;

import java.util.Scanner;

public class Input {
    public double[][] inputMatrix() {

        Scanner input = new Scanner(System.in);
        System.out.print("Size of matrix: ");
        int size = input.nextInt();
        double[][] matrixOrigin = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Type element of matrix[" + i + "][" + j + "]:");
                matrixOrigin[i][j] = input.nextDouble();
            }
        }
        input.close();
        return matrixOrigin;
    }

}
