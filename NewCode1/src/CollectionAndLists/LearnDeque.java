package CollectionAndLists;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class LearnDeque
{
    public static void main(String[] args)
    {
       // Queue using ArrayDeque
//
//        ArrayDeque<Integer> q = new ArrayDeque<>();
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q);


//// Stack using ArrayDeque
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
//        stack.offer(10);
//        stack.offer(20);
//        stack.offer(30);
//        stack.offer(40);
//        stack.offer(50);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);


// Array Deque
//        ArrayDeque<Integer> dq = new ArrayDeque<>();
//        dq.offer(10);
//        dq.offerLast(20);
//        dq.offerFirst(30);
//
//        System.out.println(dq);
//
//        System.out.println(dq.poll());
//        System.out.println(dq.pollLast());
//
//        System.out.println(dq);
//
//        System.out.println(dq.peekLast());

    }
}
