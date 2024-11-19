// Selection Sort is a comparison-based sorting algorithm.
// It sorts an array by repeatedly selecting the smallest (or largest)
// element from the unsorted portion and swapping it with the first unsorted element.
// This process continues until the entire array is sorted.

//                  Quadratic time O(n^2)

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                // Update min_idx if a smaller element
                // is found
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        // Call function
        selectionSort(arr);
        // Create a sorted list
        List<Integer> Sorted_arr = new ArrayList<>();

        for (int i : arr) {
            // Append sorted elements to the Sorted_arr
            Sorted_arr.add(i);
        }
        System.out.println("Sorted array: " + Sorted_arr);
    }
}
