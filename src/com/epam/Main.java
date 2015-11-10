package com.epam;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        double [][] matrixOrigin = input.inputMatrix();

        Printer printer = new Printer();
        System.out.println("\nThis matrix was typed :");
        printer.print(matrixOrigin);

        Calculator calculator = new Calculator();
        double[][]matrixForWork = calculator.createWorkMatrix(matrixOrigin);
        System.out.println("\nMatrix for work : ");
        printer.print(matrixForWork);

        double[][] revertMatrix = calculator.calculate(matrixForWork);
        System.out.println("\nRevert matrix :");
        printer.print(revertMatrix);
    }
}
