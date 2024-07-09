package Stream;

import Lamda.Book;
import Lamda.BookDao;
import realexample.DataBase;
import realexample.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortList
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(8,3,23,1,0,56);

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

//        List<Book> books = BookDao.getBooks();

//        Collections.sort(books,(a,b)->a.getId()-b.getId());
//        System.out.println(books);

//        books.stream().sorted((a,b)->a.getId()-b.getId()).forEach(t-> System.out.println(t));

        list.stream().sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));

       //   List<Employee> employees = DataBase.getEmployee();
//        Collections.sort(employees,(a,b)-> (int)(b.getSalary() - a.getSalary()));
//        System.out.println(employees);

      //  employees.stream().sorted((a,b)->a.getId()-b.getId()).forEach(System.out::println);

     //   employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
      //  employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

//        List<Integer> numbers = List.of(2,3,6,5,1,8,4);
//        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
//        System.out.println(newNumbers);


    }

}
