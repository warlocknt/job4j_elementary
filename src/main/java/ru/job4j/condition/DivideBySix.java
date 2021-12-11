package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        boolean conditionFound = false;
        rsl = "Исходное число не делится на 3 и не является четным.";

        if (LogicNot.isEven(number) && isDividedBy3(number)) {
            rsl = "Исходное число делится на 6.";
            conditionFound = true;
        }
        if (isDividedBy3(number) && LogicNot.notEven(number) && !conditionFound) {
            rsl = "Исходное число делится на 3, но не является четным.";
            conditionFound = true;
        }
        if (notDividedBy3(number) && LogicNot.isEven(number) && !conditionFound) {
            rsl = "Исходное число не делится на 3, но является четным.";
        }

        return rsl;
    }

    public static boolean notDividedBy3(int num) {
        return !isDividedBy3(num);
    }

    public static boolean isDividedBy3(int num) {
        return num % 3 == 0;
    }
}
