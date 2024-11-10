// stack ==> LIFO data structure. last-in first-out
//           stores objects into a sort of "vertical tower"
//           push() to add to the top
//           pop() to remove from the top

import java.util.Stack;

public class TheStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        // Append to the stack
        stack.push("Microsoft");
        stack.push("Amazon");
        stack.push("Tesla");
        stack.push("IBM");
        // remove the last input
        stack.pop(); // IBM
        // output the last input
        System.out.println(stack.peek()); // ==> IBM
        // Boolean search 1 if the object in the stack and -1 if not
        System.out.println(stack.search("IBM")); // ==> 1

        System.out.println(stack);

    }
}
