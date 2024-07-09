package Java8CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements
{
    public static void main(String[] args)
    {
        String s = "abcccdddrrrjjkkbneg";
        String res[] = s.split("");
        char[] arr = s.toCharArray();

        Map<String, Long> map1 = Arrays.stream(res).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);
        map1.entrySet().stream().filter(key -> key.getValue() > 1).map(b -> b.getKey()).collect(Collectors.toList());


//        Map<String, Long> map = map1;
//        List<String> collect = map.entrySet().stream()
//                .filter(a -> a.getValue() > 1)
//                .map(b ->b.getKey()).collect(Collectors.toList());

//        System.out.println(collect);
//
////        List<String> collect1 = Arrays.stream(s.split(""))
////                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
////                .entrySet().stream()
////                .filter(x -> x.getValue() > 1)
////                .map(Map.Entry::getKey)
////                .collect(Collectors.toList());


        //for unique elements in string

//        List<String> collect3 = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .filter(x -> x.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());

//        System.out.println(collect1);
//        System.out.println(collect3);

    }
}
