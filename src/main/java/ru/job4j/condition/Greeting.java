package ru.job4j.condition;

import java.util.Calendar;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " " + "But I am a newbie.";
        int year = Calendar.getInstance().get(Calendar.YEAR);
        idea = idea + " " + year;
        System.out.println(idea);
    }
}
