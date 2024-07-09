package GenericsAndWrapperClasses;

import java.util.ArrayList;

public class LearnGenerics
{
    public static void main(String[] args)
    {
        Dog<String,String> d1 = new Dog<>("abc12345,","jkdsj");
        Dog<String,Integer> d2 = new Dog<>("abc12345",32325);
        System.out.println(d1.name + d2.id);
        System.out.println(d2.toString());
        Dog<Integer,Integer> d3 = new Dog<>(123,748);
        System.out.println(d3.toString());
        System.out.println(d3.getId() +" "+d1.getName());

     //   ArrayList<Integer> a = new ArrayList<>();

    }
}

class Dog<E , V>
{
    E id;
    V name;
    public Dog(E id , V name)
    {
        this.id = id;
        this.name = name;
    }

    E getId()
    {
        return id;
    }

    V getName()
    {
        return name;
    }

}
