package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size;

        Scanner input = new Scanner(System.in);
        System.out.print("Size of matrix: ");
        size = input.nextInt();

        double[][] matrixOrigin = new double[size][size];
        double[][] matrixForWork = new double[size][2 * size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Type element of matrix[" + i + "][" + j + "]:");
                matrixOrigin[i][j] = input.nextDouble();
            }
        }
        input.close();

        Printer printer = new Printer();
        printer.print(matrixOrigin);

        Calculator.createWorkMatrix(matrixOrigin, matrixForWork);

        printer.printWorkMatrix(matrixForWork);

        Calculator.calculate(matrixForWork);

        printer.printRevertMatrix(matrixForWork);
    }
}
