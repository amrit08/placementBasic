package OOPs4;

public class LearnInterfaces
{

    public static void main(String[] args) {

        SuperInterface superInterface = new SuperInterface()
        {
            @Override
            public void interfaceMethod() {
                System.out.println("djsakadskfsa");
            }
        };

        OuterClass obj1 = new OuterClass()
        {
            //Anonymous class and this is object of sub class which
            // implements super class ie OuterClass
            void sing()
            {

            }
            public  void outerMethod()
            {
                System.out.println("dfsjkdslj");
            }
        };


        SuperInterface obj = ()->
        {
            System.out.println("jfkjdsdkf");
        };

        obj.interfaceMethod();

        Walkable obj2 = (int steps)->
        {
            System.out.println("walked"+steps);
            return steps;
        };

        obj2.walks(100);

        Walkable obj3 = (i)->2*i;
        System.out.println(obj3.walks(3));
    }

}

interface SuperInterface
{
    void   interfaceMethod();

}

interface  Walkable
{
    int walks(int steps);
}

class OuterClass
{
    public  void outerMethod()
    {
        System.out.println("dsjfkjsalsa");
    }
}





