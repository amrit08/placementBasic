package MapFlatMap;

import realexample.DataBase;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1,34,3,4,5);
        List<String> words = Arrays.asList("corejava","Spring","hibernatejds");

        Optional<String> reduce3 = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        System.out.println(reduce3.get());

        int sum=0;
        for(int i:numbers)
        {
            sum += i;
        }
        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        Optional<Integer> reduce1 = numbers.stream().reduce(Integer::sum);
        System.out.println(reduce1.get());

        Integer max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(max);

        Integer max2 = numbers.stream().max((a, b) -> a - b).get();
        System.out.println(max2);


        Integer integer = numbers.stream().reduce(Integer::max).get();
        System.out.println(integer);

//        double averageSalary = DataBase.getEmployee().stream()
//                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
//                .map(employee -> employee.getSalary())
//                .mapToDouble(i -> i)
//                .average().getAsDouble();
//        System.out.println(averageSalary);


        double a1 = DataBase.getEmployee().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                        .sum();

        System.out.println(a1);

    }

}
