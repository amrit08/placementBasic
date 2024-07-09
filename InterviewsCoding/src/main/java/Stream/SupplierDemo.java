package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
//class SupplierDem implements Supplier<String>
//{
//    @Override
//    public String get() {
//        return "Hi APJ";
//    }
//}

public class SupplierDemo
{
    public static void main(String[] args)
    {
        //using traditional approach
//        Supplier<String> supplier = new SupplierDem();
//        System.out.println(supplier.get());

        Supplier<String> supplier = ()-> "Hi AMRITA";
        System.out.println(supplier.get());
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->"Hi hello supplier"));

    }

}
