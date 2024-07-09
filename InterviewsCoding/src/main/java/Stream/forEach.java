package Stream;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.function.Consumer;

public class forEach
{
    public static void main(String[] args)
    {
//        List<String> list = new ArrayList<>();
//        list.add("abs");
//        list.add("defg");
//        list.add("ouef");
//        list.add("nvkd");
//        list.add("owqi");
//        list.add("obdh");

        //internal working of forEach
//        Consumer<String> consumer = t-> System.out.println(t);
//        for(String s:list)
//        {
//            consumer.accept(s);
//        }

        // list.stream().forEach(t-> System.out.println(t));

//        for (String s :list)
//        {
//            if (s.startsWith("o"))
//            {
//                System.out.println(s);
//            }
//        }

//        list.stream().filter(t->t.startsWith("o")).
//                forEach(t-> System.out.println(t));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");


      //  System.out.println(map);
        //using traditional method for iteration
//        Set<Map.Entry<Integer,String>> entries = map.entrySet();
//        for (Map.Entry<Integer,String> entry:entries)
//        {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

//        map.forEach((key ,value)-> System.out.println(key+":"+value));

        map.entrySet().stream().forEach(t-> System.out.println(t));

       map.entrySet().stream().filter(k->k.getKey()%2 == 0)
               .forEach(t-> System.out.println(t));


//        for (String s :list)
//        {
//            System.out.println(s);
//        }

    }
}
