package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70; /* формула перевода рублей в евро. */
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {

        float in = 420;
        float expected = 6;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("420 rubles are 6 euro. Test result : " + passed);

        expected = 7;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("420 rubles are 7 dollars. Test result : " + passed);

        //float rubles = 420;
        //float euro = Converter.rubleToEuro(420);
        //float dollars = Converter.rubleToDollar(420);
        //System.out.println(rubles + " rubles are " + euro + " euro and " + dollars + " dollars.");
    }
}
