package OptionalLearning;
import MapFlatMap.Customer;
import MapFlatMap.EkartDatabase;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalDemo
{
    public  static  Customer getCustomerByEmailId(String email) throws Exception
    {
        List<Customer> customers = EkartDatabase.getAll();

     return customers.stream().filter(customer -> customer.getEmail()
                .equals(email))
             .findAny().orElseThrow(()->new Exception("kjdsalk akdsajflksajal"));
    }

    public static void main(String[] args) throws Exception
    {
        Customer customer = new Customer(101,"amrit",null, Arrays.asList("8399191843","3981918"));

//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//       Optional<String> email = Optional.of(customer.getEmail());
//        System.out.println(email);
//
       Optional<String> customerEmail = Optional.ofNullable(customer.getEmail());
//       // System.out.println(customerEmail);
//
//        if (customerEmail.isPresent())
//            System.out.println(customerEmail.get());
//
//        //we can give default value for null
//        System.out.println(customerEmail.orElse("degault email"));
//
//        //we can through exception
//        System.out.println(customerEmail.orElseThrow(()->new IllegalArgumentException("email not present")));

        System.out.println(customerEmail.map(String::toUpperCase).orElseGet(()->"default email >>>>>>>>"));

        Customer cus = getCustomerByEmailId("iewrasad@gmail.com");
        System.out.println(cus);


    }
}
