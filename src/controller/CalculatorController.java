package controller;

import java.util.Scanner;

import logger.Logger;
import model.Operations;
import model.ComplexNumber;
import view.CalculatorView;

public class CalculatorController {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое комплексное число:");
        ComplexNumber num1 = getComplexNumberFromUser(scanner);

        System.out.println("Введите второе комплексное число:");
        ComplexNumber num2 = getComplexNumberFromUser(scanner);

        System.out.println("Выберите операцию (1 - Сложение, 2 - Умножение, 3 - Деление):");
        int operationChoice = scanner.nextInt();

        ComplexNumber result = performOperation(num1, num2, operationChoice);
        CalculatorView.consoleResult(result.toString());

        Logger.logOperation("Комплексные числа: " + num1 + ", " + num2 + "\r\n Операция: " + operationChoice + "\r\n Результат: " + result);
    }

    private ComplexNumber getComplexNumberFromUser(Scanner scanner) {
        System.out.print("Вещественная часть: ");
        double realPart = scanner.nextDouble();

        System.out.print("Мнимая часть: ");
        double imaginaryPart = scanner.nextDouble();

        return new ComplexNumber(realPart, imaginaryPart);
    }

    private ComplexNumber performOperation(ComplexNumber num1, ComplexNumber num2, int operationChoice) {
        switch (operationChoice) {
            case 1:
                return Operations.addNumbers(num1, num2);
            case 2:
                return Operations.multiply(num1, num2);
            case 3:
                return Operations.divide(num1, num2);
            default:
                CalculatorView.consoleError("Неправильный ввод");
                return null;
        }
    }
}