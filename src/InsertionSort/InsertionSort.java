package InsertionSort;

import Config.InputConfig;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.print("Size of Array: ");
        int size = InputConfig.getInteger();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int minElement = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > minElement) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = minElement;
        }
    }
}
