import java.util.*;

public abstract class recursion {
    // recursion = When a thing is defined in terms of itself.
    // Apply the result of a procedure, to a procedure.
    // A recursive method calls itself. Can be a substitute for iteration.
    // Divide a problem into sub-problems of the same type as the originale.
    // Commonly used with advanced sorting algorithms and navigating trees.

    // Advantages
    // easier to read/write
    // easier to debug

    // Disadvantages
    // somtimes slower
    // uses more memory

    public static void main(String[] args) {
        walk(5);
    }

    private static void walk(int steps) {
        if (steps < 1)
            return;
        System.out.println("You take a step!");
        walk(steps - 1); // recursive
    }
}
