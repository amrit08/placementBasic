package OOPS3.learnEncapsulation;

import OOPS3.learnPackage.Person;

public class MainInEncapsulation
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setAge(34);
        System.out.println(p1.getAge());
        System.out.println(Person.count);

    }

}
