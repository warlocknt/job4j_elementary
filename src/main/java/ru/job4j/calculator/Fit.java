package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height-100)*1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height-110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short myheight = 182;
        short mywife = 165;
        double man = Fit.manWeight(myheight);
        double woman = Fit.womanWeight(mywife);
        System.out.println("Man " + myheight + " is " + man);
        System.out.println("Woman " + mywife + " is " + woman);
    }
}
