package CollectionAndLists;

import java.util.*;
class Student
{
    int rollNo;
    String name;
    public Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(rollNo);
    }
}

public class LearnSets
{
    enum Color
    {
        RED,YELLOW,GREEN
    }


    public static void main(String[] args)
    {
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        Set<Color> en= EnumSet.allOf(Color.class);

//        System.out.println(enumSet);
//        System.out.println(en);

        System.out.println(Color.GREEN);
        System.out.println(Color.values());


//        Set<Student> set = new HashSet<>();
//
//        Student s1 = new Student(1,"anuj");
//        Student s2 = new Student(1,"amrht");
//
//        System.out.println(s1.equals(s2));
//
//        set.add(new Student(1,"amrit"));
//        set.add(new Student(1,"arti"));
//        set.add(new Student(1,"amrita"));
//        set.add(new Student(3,"amrit"));
//        set.add(new Student(4,"anubha"));
//        set.add(new Student(5,"kanchan"));
//        set.add(new Student(6,"pranjal"));
//        set.add(new Student(6,"pranjal"));

//        System.out.println(set);

//        Set<String> set = new HashSet<>();
//
//        set.add("Amrit");
//        set.add("Amrit");
//        set.add("Amrita");
//        set.add("abcd");
//        set.add("jeeva");
//
//        System.out.println(set);

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
         Set<Integer> set = new TreeSet<>();
//        set.add(60);
//        set.add(10);
//        set.add(10);
//        set.add(10);
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(40);
//        set.add(50);
//       set.remove(10);
//       System.out.println(set);
//       System.out.println(set.contains(10));


    }
}
