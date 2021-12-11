package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class ChessBoardTest {

    @Test
    public void whenWayXOne0YOne0XTwo7YTwo7() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 7;
        int y2 = 7;
        boolean result = ChessBoard.way(x1, y1, x2, y2) == 7;
        Assert.assertTrue(result);
    }

    @Test
    public void whenWayXOne5YOne6XTwo1YTwo2() {
        int x1 = 5;
        int y1 = 6;
        int x2 = 1;
        int y2 = 2;
        boolean result = ChessBoard.way(x1, y1, x2, y2) == 4;
        Assert.assertTrue(result);
    }

    @Test
    public void whenWayXOne0YOne0XTwo2YTwo2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        boolean result = ChessBoard.way(x1, y1, x2, y2) == 2;
        Assert.assertTrue(result);
    }

    @Test
    public void whenWayXOne1YOne3XTwo7YTwo2() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 7;
        int y2 = 2;
        boolean result = ChessBoard.way(x1, y1, x2, y2) == 0;
        Assert.assertTrue(result);
    }

 }