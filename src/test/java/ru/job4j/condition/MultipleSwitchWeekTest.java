package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayEng1() {
        String dayName = "Monday";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenTuesdayEng2() {
        String dayName = "Tuesday";
        int expected = 2;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenWednesdayEng3() {
        String dayName = "Wednesday";
        int expected = 3;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenThursdayEng4() {
        String dayName = "Thursday";
        int expected = 4;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFridayEng5() {
        String dayName = "Friday";
        int expected = 5;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSaturdayEng6() {
        String dayName = "Saturday";
        int expected = 6;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSundayEng7() {
        String dayName = "Sunday";
        int expected = 7;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMondayRus1() {
        String dayName = "Понедельник";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenTuesdayRus2() {
        String dayName = "Вторник";
        int expected = 2;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenWednesdayRus3() {
        String dayName = "Среда";
        int expected = 3;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenThursdayRus4() {
        String dayName = "Четверг";
        int expected = 4;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFridayRus5() {
        String dayName = "Пятница";
        int expected = 5;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSaturdayRus6() {
        String dayName = "Суббота";
        int expected = 6;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSundaRus7() {
        String dayName = "Воскресенье";
        int expected = 7;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenIllegalWeekDay() {
        String dayName = "Питница";
        int expected = -1;
        int result = MultipleSwitchWeek.numberOfDay(dayName);
        Assert.assertEquals(result, expected);
    }

}