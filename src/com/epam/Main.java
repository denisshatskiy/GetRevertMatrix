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
                matrix[i][j] = in.nextDouble();  // ��� ����� 2.2 ������, ��� ����� 2,2 ��� �� ?
            }
        }
        in.close();
        System.out.println();

        //����� ��������� �������
        Print print = new Print(); // �� ��������� ��� ����������
        print.Print(matrix);

        //copy to matrix for work
        //Calculate calculate = new Calculate(); // ��������� ��� ����������
        Calculate.createWorkMatrix(matrix,matrixOne,row,col,size);

        //����� ������� �������
        print.PrintWorkMatrix(matrixOne, row,col);

        //����������
        Calculate.calculate(matrixOne, row, col, size);

        //����� �������� �������
         print.PrintRevertMatrix(matrixOne, row, col);
    }
}
