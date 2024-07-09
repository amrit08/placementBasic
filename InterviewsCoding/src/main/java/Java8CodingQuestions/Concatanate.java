package Java8CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Concatanate
{
    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,2,3);
        List<Integer> list2 = Arrays.asList(7,8,9,2,3,4,1);
        List<Integer> fullList =  Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(fullList);

        Set<Integer> uniqueElements = fullList.stream().collect(Collectors.toSet());
        System.out.println(uniqueElements);

        Integer integer = uniqueElements.stream().max((a, b) -> a - b).get();
        System.out.println(integer);

        Optional<Integer> reduce = uniqueElements.stream().reduce((a, b) -> a < b ? a : b);
        System.out.println(reduce.get());

        Integer integer1 = uniqueElements.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(integer1);

    }
}
