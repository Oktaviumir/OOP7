package view;

public class CalculatorView {
    public static void consoleResult(String result) {
        System.out.println("Результат: " + result);
    }

    public static void consoleError(String message) {
        System.err.println("Ошибка: " + message);
    }
}