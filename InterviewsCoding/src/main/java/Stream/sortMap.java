package Stream;

import java.util.*;

public class sortMap
{
    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("Four",4);
        map.put("Ten",10);
        map.put("Fifteen",15);
        map.put("two",2);

//        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
//        System.out.println(map);

//        for (Map.Entry<String,Integer> entry:entries)
//        {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

        map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey().reversed()).
                forEach(t-> System.out.println(t));
        System.out.println("***********************");

        map.entrySet().stream().sorted( Map.Entry.comparingByValue()).
                forEach(t-> System.out.println(t));

    }
}
