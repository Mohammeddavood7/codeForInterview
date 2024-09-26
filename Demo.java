package company.throughtworkTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7};
        sortWithOriginalOrder(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortWithOriginalOrder(int[] arr) {
        Integer[] boxedArray = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxedArray[i] = arr[i];
        }

        // Create a custom comparator to sort based on values while preserving original order
        Comparator<Integer> comparator = Comparator.comparingInt((Integer idx) -> arr[idx])
                .thenComparingInt(idx -> idx);

        // Create an array of indices and sort it using the custom comparator
        Integer[] indices = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, comparator);

        // Rearrange the original array based on the sorted indices
        for (int i = 0; i < arr.length; i++) {
            if (i != indices[i]) {
                int temp = arr[i];
                arr[i] = arr[indices[i]];
                arr[indices[i]] = temp;
            }
        }
    }
}
