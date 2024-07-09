package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// class ConsumerDemo1 implements Consumer<Integer>
//{
//    @Override
//    public void accept(Integer integer)
//    {
//        System.out.println("Printing"+ integer);
//    }
//}

public class ConsumerDemo
{
    public static void main(String[] args)
    {
//        ConsumerDemo1 consumerDemo1 = new ConsumerDemo1();
//        consumerDemo1.accept(200);

        Consumer<Integer> consumer = t-> System.out.println("Printing"+t);
        consumer.accept(20);

        List<Integer> list = Arrays.asList(1,2,3,4,5);

     //   list.stream().forEach(consumer);
        list.stream().forEach(t-> System.out.println("print"+" "+t));

    }
}




