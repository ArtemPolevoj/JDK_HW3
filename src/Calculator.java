/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические
методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть
произведена операция.
 */

public class Calculator {
    public static <T extends Number, U extends Number> double sum(T num1, U num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T num1, U num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T num1, U num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T num1, U num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        int a = 5;
        double b = 3.5;

        double sum = Calculator.sum(a, b);
        double multiply = Calculator.multiply(a, b);
        double divide = Calculator.divide(a, b);
        double subtract = Calculator.subtract(a, b);
        System.out.println(sum);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(subtract);
    }
}
