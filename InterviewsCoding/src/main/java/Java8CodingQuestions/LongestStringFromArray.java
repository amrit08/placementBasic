package Java8CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestStringFromArray
{
    public static void main(String[] args)
    {
        String strArray[] = {"java","lkdsjla","kajajdsadljs","jds ka;la dldfa"};

        String reduce = Arrays.stream(strArray)
                .reduce((a, b) -> a.length() > b.length() ? a : b).get();

        System.out.println(reduce);

        //find elements from who starts with 1

        int num[] = {42,11,2,3,46,76,1,2,12};

        List<String> collect = Arrays.stream(num).boxed()
                .map(s -> s + "")
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
