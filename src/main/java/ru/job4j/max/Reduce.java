package ru.job4j.max;

public class Reduce {
    private int[] data;

    public void to(int[] array) {
        data = array;
    }

    public void print() {
        for (int index = 0; index < data.length; index++) {
            System.out.println(data[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
