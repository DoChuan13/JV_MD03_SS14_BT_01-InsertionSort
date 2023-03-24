package InsertionSort;

import Config.ColorConfig;
import Config.InputConfig;

import java.util.Arrays;

public class InsertionSortTracking {
    public static void main(String[] args) {
        System.out.print(ColorConfig.ITALIC + "Size of Array: ");
        int size = InputConfig.getInteger();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("-----------------------------------------------------------------------------");
        insertionSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int minElement = list[i];
            int j = i - 1;
            System.out.println(
                    ColorConfig.BOLD + "Step " + i + " with Temporarily value : " + minElement + ColorConfig.RESET);
            while (j >= 0 && list[j] > minElement) {
                System.out.println(ColorConfig.GREEN_BRIGHT + "Change element at " + (j + 1) + " from " + list[j + 1] + " to " + list[j] + ColorConfig.RESET);
                list[j + 1] = list[j];
                j--;
                System.out.println("Temporarily Array is " + Arrays.toString(list));
            }
            System.out.println(ColorConfig.CYAN_BRIGHT + "Element at " + (j + 1) + " from " + list[j + 1] + " become: " + minElement + ColorConfig.RESET);
            list[j + 1] = minElement;
            System.out.println("Temporarily Array at end Step " + i + " is " + Arrays.toString(list));
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
}
