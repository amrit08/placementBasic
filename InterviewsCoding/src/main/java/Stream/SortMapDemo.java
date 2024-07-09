package Stream;

import realexample.Employee;

import java.util.*;

public class SortMapDemo
{
    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("Four",4);
        map.put("Ten",10);
        map.put("Fifteen",15);
        map.put("two",2);

      //  sorting map using traditional comparator method
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(a,b)->a.getValue()-b.getValue());
        Collections.sort(entries,(a,b)->a.getKey().compareTo(b.getKey()));

       for (Map.Entry<String,Integer> entry:entries)
       {
           System.out.println(entry.getKey()+":"+entry.getValue());
       }
        entries.stream().forEach(t-> System.out.println(t));

     //   using Stream
        map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey().reversed()).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

     //   for Custom Objects Map using Comparator
//        Map<Employee,Integer> employeeMap = new TreeMap<>(
//                new Comparator<Employee>()
//                {
//                    @Override
//                    public int compare(Employee o1, Employee o2) {
//                        return o1.getId()-o2.getId();
//                    }
//                }
//        );

     //   using lamda
        Map<Employee,Integer> employeeMap = new TreeMap<>((o1,o2)->o1.getId()-o2.getId());
        employeeMap.put(new Employee(12,"Aman","IT",400000),60);
        employeeMap.put(new Employee(2,"Ravi","ET",200000),20);
        employeeMap.put(new Employee(23,"Raman","IT",1000000),40);
        employeeMap.put(new Employee(34,"Rahaan","RTT",300000),10);
        employeeMap.put(new Employee(22,"ESman","AST",800000),70);

        System.out.println(employeeMap);

       employeeMap.forEach((a,b)-> System.out.println(a+":"+b));

       // using Stream for CustomObject in Map
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getGrade).reversed())).
                forEach(System.out::println);


        System.out.println(employeeMap);


    }
}
