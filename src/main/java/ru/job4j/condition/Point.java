package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2)  + Math.pow(Math.abs(y2 - y1), 2));
        return rsl;
    }

    public static void calcandprintdistance(int x1, int y1, int x2, int y2) {
        double rsl = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") " + rsl);
    }

    public static void main(String[] args) {
        Point.calcandprintdistance(0, 0, 2, 0);
        Point.calcandprintdistance(0, 0, 2, 2);
        Point.calcandprintdistance(1, 0, 4, 5);
        Point.calcandprintdistance(0, 0, 2, 6);
    }
}
