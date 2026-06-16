import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push (add)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // pop (remove top)
        System.out.println("Removed: " + stack.pop());

        // peek (top element)
        System.out.println("Top: " + stack.peek());

        System.out.println(stack);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // add
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);

        // remove front
        System.out.println("Removed: " + queue.remove());

        // front element
        System.out.println("Front: " + queue.peek());

        System.out.println(queue);
    }
}