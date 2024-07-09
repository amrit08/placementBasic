package GeeksCoding;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesElements
{
    public static void main(String[] args)
    {
        Set<Integer> set = new LinkedHashSet<>();

        int a[] = {2,3,3,4,8,8,1,2,3,3,3};
      //  removeElements(a);

        List<Integer> collect = Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
        System.out.println(collect);


//        for (int i=0;i<a.length;i++)
//        {
//            set.add(a[i]);
//        }
//
//        System.out.println(set);
    }

//    static void removeElements(int a[])
//    {
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for (int i=0;i<a.length;i++)
//        {
//            if (!map.containsKey(a[i]))
//            {
//                map.put(a[i],1);
//            }
//        }

//        for (int i:map.keySet())
//        {
//            System.out.print(i+" ");
//        }

//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        for (Map.Entry<Integer,Integer> entry :entries)
//        {
//            System.out.println(entry.getKey() +"==="+ entry.getValue());
//        }
//    }
}
