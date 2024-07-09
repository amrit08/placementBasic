package realexample;

import java.util.ArrayList;
import java.util.List;

public class DataBase
{
    public static List<Employee> getEmployee()
    {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(12,"Aman","A",400000));
        list.add(new Employee(2,"Ravi","B",200000));
        list.add(new Employee(23,"Raman","A",800000));
        list.add(new Employee(34,"Rahaan","A",300000));
        list.add(new Employee(22,"ESman","B",800000));
        return list;
    }
}
