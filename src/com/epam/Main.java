package com.epam;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        double [][] matrixOrigin = input.readMatrix();

        Printer printer = new Printer();
        System.out.println("This matrix was typed :");
        printer.print(matrixOrigin);

        Calculator calculator = new Calculator();
        double[][]matrixForWork = calculator.createWorkMatrix(matrixOrigin);
        System.out.println("Matrix for work : ");
        printer.print(matrixForWork);

        double[][] revertMatrix = calculator.calculate(matrixForWork);
        System.out.println("Revert matrix :");
        printer.print(revertMatrix); // Is it correct? Or I should use "matrixForCalculate"?
    }
}
