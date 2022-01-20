package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double allFunctions(double first, double second) {
        return sum(first, second) + difference(first, second)
                + multiply(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + allFunctions(10, 20));
    }

}
