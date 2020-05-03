package lesson2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 7, 8, 9, 0, 6, 2, 24, 74, 95, 11, 13, 4};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
