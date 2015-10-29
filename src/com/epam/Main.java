package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int row, col, size;

        Scanner in = new Scanner(System.in);
        System.out.print("Size of matrix: ");
        size = in.nextInt();
        row = col = size;

        double[][] matrix = new double [row][col];
        double[][] matrixOne = new double[row][2 * col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Type element of matrix[" + i + "][" + j + "]:");
                matrix[i][j] = in.nextDouble();  // при вводе 2.2 ошибка, при вводе 2,2 все ок ?
            }
        }
        in.close();
        System.out.println();

        //вывод введенной матрицы
        Print print = new Print(); // Ќ≈ сработало без объ€влени€
        print.Print(matrix);

        //copy to matrix for work
        //Calculate calculate = new Calculate(); // сработало без объ€влени€
        Calculate.createWorkMatrix(matrix,matrixOne,row,col,size);

        //вывод рабочей матрицы
        print.PrintWorkMatrix(matrixOne, row,col);

        //вычисление
        Calculate.calculate(matrixOne, row, col, size);

        //вывод обратной матрицы
         print.PrintRevertMatrix(matrixOne, row, col);
    }
}
