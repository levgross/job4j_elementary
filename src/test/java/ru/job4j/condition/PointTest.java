package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to30then3() {
        double expected = 3;
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to31then3() {
        double expected = 3;
        int x1 = 0;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to83then7() {
        double expected = 7;
        int x1 = 1;
        int y1 = 3;
        int x2 = 8;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}