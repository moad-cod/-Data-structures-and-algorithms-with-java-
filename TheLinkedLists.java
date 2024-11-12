
// A linked list is a linear data structure where elements, called nodes, 
// are connected sequentially, with each node containing data and a reference.
// Have advantge over arrays and arrayList in insertion and deletion.
// We can use LinkedLists With stack and queue.
// (push(), pop()...) with stack,
// (offer(), poll(), peekFirst(), peekLast(), addFirst(), addLast, removeFirst(), removeLast()...) with queue.
// Methods (add(), remove(), indexOf()).
import java.util.LinkedList;

public class TheLinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.push("ABC");
        list.push("DEF");
        list.push("GHI");
        list.push("JKL");
        list.push("MNO");
        list.pop();
        // Add node between JKL and MNO
        list.add(4, "Django"); // ==> [MNO, JKL, GHI, DEF, Django, ABC] bcs we working with stack DS
        // Remove node
        list.remove("JKL"); // ==> [MNO, GHI, DEF, Django, ABC]
        // Searche for an index of element
        System.out.println(list.indexOf("ABC"));
        // ==> With stack it's 4 and with queue it's 1

        System.out.println(list);

    }
}
