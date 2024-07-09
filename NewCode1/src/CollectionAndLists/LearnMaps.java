package CollectionAndLists;
import java.util.*;
public class LearnMaps
{
    public static void main(String[] args)
    {

//      ArrayList<Integer> list = new ArrayList<>();
       Map<String,String> map = new TreeMap<>();
      //  Map<String ,String> map = new HashMap<>();
        Map<String ,String> map2 = new HashMap<>();
        map.put("jk","INDIA");
        map.put("IN","INDIA");
        map.putIfAbsent("IN","OZOWA");
        map.put("IN","INDIGO");
        map.put("Tk","INDIA");
        map.put("US","UNITED STATES");
        map.put("BR","BRAZIL");
        map.put("PK","PAKISTAN");
        map.put("NP","NEPAL");

        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String str:keys)
        {
            System.out.println(str);
        }

        Set<String> key1 = new HashSet<>(map.keySet());
        System.out.println(key1);

//        ArrayList<String > key2 =(ArrayList<String>) map.keySet();//gives error as it is type casting
//        System.out.println(key2);


        ArrayList<String> keys1 = new ArrayList<>(map.keySet());
        System.out.println(keys1);
    // System.out.println("lkdsjlkd");

        Collection<String> values = map.values();
        System.out.println(values);
        for (String str:values)
        {
            System.out.println(str);
        }

     // System.out.println("kjdflks");

        Set<Map.Entry<String,String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String,String> entry:entries)
        {
            System.out.println(entry.getKey() +","+entry.getValue());
        }

      //   Set<String> values1 =(Set<String>) map.values();//error

        Set<String> val = new HashSet<>(map.values());
        System.out.println(val);

   //     System.out.println(values1);

        ArrayList<String> values3 = new ArrayList<String>(map.values());
       // ArrayList<String> values3 =  (ArrayList<String>)(map.values());//error
        System.out.println(values3);


//        map.remove("US","usa");
//        System.out.println(map);
//        System.out.println(map.get("NP"));
//        System.out.println(map.containsKey("US"));
//        System.out.println(map.containsValue("jdsakjfdsaha"));
//        map2.putAll(map);
//        System.out.println(map2);
//        System.out.println(map.getOrDefault("ok","others"));
//        System.out.println(map.isEmpty());

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());


    }
}