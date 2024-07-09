package realexample;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService
{
    public List<Employee> evaluateTaxUsers(String input)
    {
//        if (input.equalsIgnoreCase("tax"))
//            return  DataBase.getEmployee().stream().filter(t -> t.getSalary() > 300000).collect(Collectors.toList());
//
//        else
//            return DataBase.getEmployee().stream().filter(t -> t.getSalary() < 300000).collect(Collectors.toList());

       return  (input.equalsIgnoreCase("tax")) ? DataBase.getEmployee().stream().filter(t -> t.getSalary() > 300000).collect(Collectors.toList()):
         DataBase.getEmployee().stream().filter(t -> t.getSalary() < 300000).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        System.out.println(new TaxService().evaluateTaxUsers("tax"));

    }


}
