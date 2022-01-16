package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {7, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort6() {
        int[] data = new int[] {-1, 21, 0, 7, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 0, 3, 7, 9, 21};
        Assert.assertArrayEquals(expected, result);
    }
}