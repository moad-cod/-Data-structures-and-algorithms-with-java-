// Interpolation Search is an improved variant of binary search.
//               It works on the principle of proportionality,
//               where it estimates the position of a target value
//               within a sorted array based on the value of the element 
//               being searched for.

//               average case : O(log(log(n)))
//               Worst case : O(n) [value increase exponentially]

public class InterpolationSearch {
    // arr[] ==> Array where elements need to be searched

    // x ==> Element to be searched

    // lo ==> Starting index in arr[]

    // hi ==> Ending index in arr[]

    // The idea of formula is to return higher value of pos
    // when element to be searched is closer to arr[hi]. And
    // smaller value when closer to arr[lo]

    // pos = lo + [ \frac{(x-arr[lo])*(hi-lo) }{ (arr[hi]-arr[Lo]) }]
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        int index = interpolationsearch(array, 256);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationsearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }

        }
        return -1;
    }
}
