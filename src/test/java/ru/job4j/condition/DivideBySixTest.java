package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 6.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 3, но не является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3, но является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3 и не является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumIsDividedBy3() {
        int in = 6;
        boolean result = DivideBySix.isDividedBy3(in);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNumNotIsDividedBy3() {
        int in = 8;
        boolean result = DivideBySix.isDividedBy3(in);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNumIsNotDividedBy3() {
        int in = 5;
        boolean result = DivideBySix.isDividedBy3(in);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNumNotNotDividedBy3() {
        int in = 8;
        boolean result = DivideBySix.notDividedBy3(in);
        Assert.assertTrue(result);
    }

}