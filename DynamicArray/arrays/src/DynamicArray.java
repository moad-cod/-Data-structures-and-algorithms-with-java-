// Static Array: In this type of array,
// memory is allocated at compile time having a fixed size of it.
// We cannot alter or update the size of this array.
// ---------------------------------------------------------------------
// Dynamic Array: In this type of array,
// memory is allocated at run time but not having a fixed size.
// It is used to specify the size of it during the run time of any program.
// Advantages ==> random acces of elements O(1),
//                Good locality of reference and data cache utilization.
//                Easy to insert/delete at the end. 
// Disadvantges ==> wastes more memory.
//                  Shifting elements is time consuming O(n).
//                  Expanding/Shrinking the array is time consuming O(n).

// import java.util.ArrayList;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < (size - 1); j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                // Check if the array needs to shrink
                if (size <= (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public void grow() {
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public void shrink() {
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]"; // Delete the this two ", " from the end
        } else {
            string = "[]";
        }
        return string;
    }
}
