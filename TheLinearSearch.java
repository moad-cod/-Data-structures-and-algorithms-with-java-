// Linear Search : sequentially checks each element until a match is found or the entire 
//                 list has been examined.

//                 Runtime complexity : O(n)
//                 Slow for large data sets

//                 Does not need to sorted
//                 Useful for DS that don't have random access (Linked List)

public class TheLinearSearch {
    public static void main(String[] args) {
        int[] array = { 9, 1, 8, 7, 5, 2, 0 };
        int index = linearSearch(array, 9);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            // Find the index
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
