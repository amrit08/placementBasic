package Java8CodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestNumber
{
    public static void main(String[] args)
    {
        int num[] = {5,9,11,2,8,21,1,21};

        //ascending order sorting .....
        List<Integer> collect = Arrays.stream(num).sorted()
                .boxed().collect(Collectors.toList());

        System.out.println(collect);

        //descending order sorting
        List<Integer> collect1 = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect1);

        //Finding second highest number
        Integer second =  Arrays.stream(num).boxed().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(second);

    }
}
