package CollectionAndLists;

import java.util.Queue;

public class PriorityQueue
{
    public static void main(String[] args)
    {

//        Queue<Integer> pq = new java.util.PriorityQueue<>((a,b)->b-a);
        Queue<Integer> pq = new java.util.PriorityQueue<>();
       // PriorityQueue p = new PriorityQueue();

        pq.add(30);
        pq.add(40);
        pq.add(40);
        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(60);
        pq.add(6);
        pq.add(6);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
