package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to30then3() {
        double expected = 3;
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to31then3() {
        double expected = 3;
        Point a = new Point(0, 1);
        Point b = new Point(3, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to83then7() {
        double expected = 7;
        Point a = new Point(1, 3);
        Point b = new Point(8, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when135to835then7() {
        double expected = 7;
        Point a = new Point(1, 3, 5);
        Point b = new Point(8, 3, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 11.31;
        Point a = new Point(0, 3, 0);
        Point b = new Point(8, 3, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}