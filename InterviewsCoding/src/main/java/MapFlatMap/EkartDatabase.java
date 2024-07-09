package MapFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase
{
    public static List<Customer> getAll()
    {
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer(101,"amrit","amritprasad@gmail.com", Arrays.asList("8399191843","3981918")));
//        customers.add(new Customer(102,"guddi","guddiprasad@gmail.com", Arrays.asList("8399321843","39071918")));
//        customers.add(new Customer(103,"dayanit","iewrasad@gmail.com", Arrays.asList("839732191843","3981918")));
//        customers.add(new Customer(104,"pummy","iwekjditprasad@gmail.com", Arrays.asList("830821191843","32281918")));
//        return customers;

        return Stream.of(
                new Customer(101,"amrit","amritprasad@gmail.com", Arrays.asList("8399191843","3981918")),
                new Customer(102,"guddi","guddiprasad@gmail.com", Arrays.asList("8399321843","39071918")),
                new Customer(103,"dayanit","iewrasad@gmail.com", Arrays.asList("839732191843","3981918")),
                new Customer(104,"pummy","iwekjditprasad@gmail.com", Arrays.asList("830821191843","32281918"))
        ).collect(Collectors.toList());

    }
}
