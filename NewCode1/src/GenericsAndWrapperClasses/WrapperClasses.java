package GenericsAndWrapperClasses;

public class WrapperClasses
{
    public static void main(String[] args)
    {
        //Integer obj = new Integer(14);

        Integer obj2 = Integer.valueOf("12");
        int a = Integer.parseInt("12");
        int i = obj2.intValue();
        System.out.println(i);
//        int m =10;
//        Integer n = m;

        Integer obj3 = 23;//autoboxing
        int age = obj2;//unboxing
        System.out.println(age);

        Boolean myboolean = Boolean.valueOf("false");

        boolean b= myboolean;
        System.out.println(myboolean);
    }
}
