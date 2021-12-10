package ru.job4j.condition;

public class ChessBoard {
    public static boolean validateWay(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) == Math.abs(y2 - y1) &&  validateCoordinates(x1, y1, x2, y2);
    }

    public static boolean validateCoordinates(int x1, int y1, int x2, int y2) {
        return validateCoordinate(x1) && validateCoordinate(y1) && validateCoordinate(x2) && validateCoordinate(y2);
    }

    public static boolean validateCoordinate(int coordinate) {
        return (coordinate >= 0) && (coordinate <= 7);
    }

    public static int way(int x1, int y1, int x2, int y2) {
        return validateWay(x1, y1, x2, y2) ? Math.abs(x2 - x1)  : 0;
    }
}
