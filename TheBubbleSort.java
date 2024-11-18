// Bubble Sort : is the simplest sorting algorithm that works by repeatedly
//               swapping the adjuscent elements if they are in the wrong order,

//               This algorithm is not suitable for large data sets and worst-time complexity is high.
//               time complexity = O(n^2) ==> quadratic

import java.util.Arrays;

public class TheBubbleSort {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        int n = array.length;
        bubblesort(array, n);
        // Create a copy of the sorted array
        int[] SortedArray = Arrays.copyOf(array, n);
        for (int i : SortedArray) {
            System.out.println(i);
        }
        System.out.println(array);
    }

    // An optimized version of bubble sort
    static void bubblesort(int[] array, int n) {
        int i, j, temp;
        boolean swapping;
        for (i = 0; i < n - 1; i++) {
            swapping = false;
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapping = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapping == false) {
                break;
            }
        }
    }
}
