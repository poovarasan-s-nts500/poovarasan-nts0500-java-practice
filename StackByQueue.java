import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;

class MyStack<E> {

    private Queue<E> queue1 = new ArrayDeque<>();
    private Queue<E> queue2 = new ArrayDeque<>();

    public boolean push(E val) {
        queue1.add(val);
        return true;
    }

    public E pop() {
        if (queue1.isEmpty())
            throw new EmptyStackException();

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        while (queue2.size() > 1) {
            queue1.add(queue2.remove());
        }

        return queue2.remove();
    }

    public boolean isEmpty() {
        return queue1.size() == 0;
    }

    public E peek() {
        if (queue1.isEmpty())
            throw new EmptyStackException();

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        while (queue2.size() > 1) {
            queue1.add(queue2.remove());
        }

        E peek = queue2.remove();
        queue1.add(peek);
        return peek;
    }

    public int size() {
        return queue1.size();
    }
}

public class StackByQueue {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(7);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

    }
}

// Q21. Implement a Stack Using Two Queues​
// Design and implement a MyStack class that uses two Queue objects internally
// and
// supports push(x), pop(), top(), and empty() operations.