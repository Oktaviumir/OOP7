package model;

public class Operations {
    public static ComplexNumber addNumbers(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealNumber() + num2.getRealNumber();
        double imaginaryPart = num1.getImaginaryUnit() + num2.getImaginaryUnit();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealNumber() * num2.getRealNumber() - num1.getImaginaryUnit() * num2.getImaginaryUnit();
        double imaginaryPart = num1.getRealNumber() * num2.getRealNumber() + num1.getImaginaryUnit() * num2.getImaginaryUnit();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = Math.pow(num2.getRealNumber(),2) + Math.pow(num2.getImaginaryUnit(),2);
        double realPart = (num1.getRealNumber() * num2.getRealNumber() + num1.getImaginaryUnit() * num2.getImaginaryUnit()) / denominator;
        double imaginaryPart = (num1.getImaginaryUnit() * num2.getRealNumber() - num1.getRealNumber() * num2.getImaginaryUnit()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}