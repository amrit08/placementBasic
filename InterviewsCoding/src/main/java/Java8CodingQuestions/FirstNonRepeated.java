package Java8CodingQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//find first non-repeated elements
public class FirstNonRepeated
{
    public static void main(String[] args)
    {
        String s = "ilovejavatechie";
        LinkedHashMap<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);


//        String key = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(x -> x.getValue() == 1)
//                .findFirst().get().getKey();
//        System.out.println(key);



    }

}
