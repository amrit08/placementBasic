package Java8CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StringJoin
{
    public static void main(String[] args)
    {
        //String join example
        List<String> list = Arrays.asList("1", "2", "3", "4");
        String res = String.join(",", list);
        System.out.println(res);

        //skip and limit
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(t-> System.out.println(t));


//        System.out.println(list);
//        String str = "";
//        for (int i=0;i< list.size();i++)
//        {
//            if (i == list.size()-1)
//                str = str+list.get(i);
//            else
//                str = str+list.get(i)+"-";
//        }
//        System.out.println(str);

    }
}
