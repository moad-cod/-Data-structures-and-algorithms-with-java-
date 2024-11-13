
public class App {
    public static void main(String[] args) throws Exception {
        DynamicArray array = new DynamicArray();
        array.add("A");
        array.add("B");
        array.add("C");

        array.insert(2, "X");
        array.delete("B");
        System.out.println(array.search("C"));
        System.out.println(array);
        System.out.println("size: " + array.size);
        System.out.println("capacity: " + array.capacity);

    }
}
