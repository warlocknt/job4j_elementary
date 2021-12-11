package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DivideBySixTest {

    @Test
    public void when24DividedBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 6.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when27NotEvenDividedBy3() {
        int in = 27;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 3, но не является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when28IsEvenNotDividedBy3() {
        int in = 28;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3, но является четным.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when23NotEvenNotDividedBy3() {
        int in = 23;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3 и не является четным.";
        Assert.assertEquals(expected, result);
    }

}