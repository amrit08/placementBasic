package Java8CodingQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//find the occurrence of characters in string

public class findoccurence
{
    public static void main(String[] args)
    {
        String input = "hellohowareyou";
        String[] results = input.split("");

//        System.out.println(Arrays.toString(results));
//        Map<String, List<String>> map = Arrays.stream(results).collect(Collectors.groupingBy(i -> i));
//        System.out.println(map);


        Map<String, Long> map = Arrays.stream(results).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

//        System.out.println(input);
//        char[] charArray = input.toCharArray();
//        charArray[3] = 't';
//        System.out.println(charArray[3]);
//        String[] split = input.split("");
////        for (String s:split)
////            System.out.print(s+" ");
////        System.out.println(Arrays.toString(split));
//
//        String word[] = {"hdj","jdsds","jdkww","jhewkfw"};
//        word[2] = "amrit";
//        System.out.println(word[2]);
////        for (String s:word)
////            System.out.println(s+" ");

    }
}