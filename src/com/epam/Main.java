package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size;

        Scanner input = new Scanner(System.in);
        System.out.print("Size of matrix: ");
        size = input.nextInt();
        int row = size;
        int column = size;

        double[][] matrixOrigin = new double [row][column];
        double[][] matrixForWork = new double[row][2 * column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Type element of matrix[" + i + "][" + j + "]:");
                matrixOrigin[i][j] = input.nextDouble();
            }
        }
        input.close();

        Print print = new Print();
        print.print(matrixOrigin);

        Calculate.createWorkMatrix(matrixOrigin,matrixForWork,row,column,size);

        print.printWorkMatrix(matrixForWork, row, column);

        Calculate.calculate(matrixForWork, row, column, size);

        print.printRevertMatrix(matrixForWork, row, column);
    }
}
