package MapFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapService
{
    public static void main(String[] args)
    {
        List<Customer> customers = EkartDatabase.getAll();

        //List<Customer> convert List<String> ->Data Transformation
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        List<List<String>> collect = customers.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(collect);


        List<String> phoneNumbers = customers.stream().
                flatMap(customer -> customer.getPhoneNumber().stream())
                .collect(Collectors.toList());

        System.out.println(phoneNumbers);
    }
}

