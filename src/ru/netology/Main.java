package ru.netology;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = (b == 0) ? 0 : calc.devide.apply(a, b); // Проверка деления на ноль. В случае, если делитель равен нулю,
        calc.println.accept(c);                         // для того чтобы программа не завершилась с ошибкой в качестве
                                                        // результата возвращаем 0.
    }
}
