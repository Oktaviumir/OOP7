package model;

public class ComplexNumber {
    private double realNumber;
    private double imaginaryUnit;

    public ComplexNumber(double realNumber, double imaginaryUnit) {
        this.realNumber = realNumber;
        this.imaginaryUnit = imaginaryUnit;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImaginaryUnit() {
        return imaginaryUnit;
    }

    @Override
    public String toString() {
        String sign = null;
        if (imaginaryUnit < 0) {
            sign = "-";
        } else {
            sign = "+";
        }
        return realNumber + " " + sign + " " + Math.abs(imaginaryUnit) + "i";
    }
}