package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//class PredictDemo1 implements Predicate<Integer>
//{
//    @Override
//    public boolean test(Integer t )
//    {
//        if (t%2 == 0)
//            return true;
//        else
//            return false;
//    }
//}

public class PredicateDemo
{
    public static void main(String[] args)
    {
//        Predicate<Integer> predicate = (t)->
//        {
////            if (t%2 == 0)
////            {
////                return  true;
////            }

////            else return false;
//            return t%2 ==0;
//        };

//        Predicate<Integer> predicate = t-> t%2 == 0;
//        System.out.println(predicate.test(19));

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(t->t%2 == 0).forEach(t-> System.out.println("print"+" "+t));

        // using traditional class method
//        Predicate<Integer> predicate = new PredictDemo1();
//        System.out.println(predicate.test(35));

    }
}
