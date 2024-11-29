// Insertion sort = is a simple sorting algorithm that works by iteratively
// inserting each element of an unsorted list into its correct position in a
// sorted portion of the list. It is like sorting playing cards in your hands.
// You split the cards into two groups: the sorted cards and the unsorted cards.
// Then, you pick a card from the unsorted group and put it in the right place
// in the sorted group.

public class TheInsertionSort {
    void InsertionSort(int[] arr) {
        int n = arr.length;
        System.out.println(n);
        for (int i = 1; i < n; i++) { // Start from the second element
            int key = arr[i]; // Element to insert
            int j = i - 1;
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift the element
                j--;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }
    }

    // Method to print the sorted array
    static void SortedList(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        TheInsertionSort IS = new TheInsertionSort();
        IS.InsertionSort(arr);
        SortedList(arr);
    }
}
