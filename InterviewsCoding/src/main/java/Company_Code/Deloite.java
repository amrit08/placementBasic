package Company_Code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Deloite
{
    public static void main(String[] args)
    {
        int arr[] = {2,3,5,6,7};
        Integer integer1 = Arrays.stream(arr).boxed().reduce((a, b) -> a + b).get();
        int sum = Arrays.stream(arr).sum();

        System.out.println(sum);
        System.out.println(integer1);
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,200));
        employees.add(new Employee(2,100));
        employees.add(new Employee(3,300));
        employees.add(new Employee(4,500));
        employees.add(new Employee(5,50));
        employees.add(new Employee(6,800));

        System.out.println(employees);
        List<Employee> collect = employees.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).collect(Collectors.toList());
        System.out.println(collect);
        List<Employee> collect1 = employees.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).limit(3).collect(Collectors.toList());
        System.out.println(collect1);

        Integer integer = employees.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).limit(3).skip(2).map(a -> a.getSalary()).findFirst().get();
        System.out.println(integer);

        List<Employee> collect2 = employees.stream().filter(a -> a.getSalary() < integer).collect(Collectors.toList());
        System.out.println(collect2);

        List<Employee> collect3 = employees.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).skip(3).collect(Collectors.toList());
        System.out.println(collect3);

    }

}


