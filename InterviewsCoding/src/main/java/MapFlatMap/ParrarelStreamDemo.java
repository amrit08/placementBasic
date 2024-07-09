package MapFlatMap;

import java.util.stream.IntStream;

public class ParrarelStreamDemo
{
    public static void main(String[] args)
    {
        long start = 0;
        long end = 0;


//        start = System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end = System.currentTimeMillis();
//        System.out.println("Plain Stream took time"+(end-start));
//
//        System.out.println("++++++++++++++++++++++++++++++++");
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end = System.currentTimeMillis();
//        System.out.println("Parallel Stream took time"+(end-start));

        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread: "+Thread.currentThread().getName()+":"+x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread: "+Thread.currentThread().getName()+":"+x);
        });
    }
}
