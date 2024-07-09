package oops5;

class Data
{

    int data;
   public void printData()
   {
       System.out.println(data);
   }

   public  void printData(int a)
   {
       System.out.println(a);
   }
}

class  ChildData extends Data
{

    @Override
    public void printData()
    {
        System.out.println("Overridden"+data);
    }
    public void tree()
    {
        System.out.println("Tree method");
    }
}

public class LearnPolymorphism
{
    public static void main(String[] args)
    {
        Data d;
        d = new ChildData();
        d.printData();

//        Object obj = new ChildData();
//        Data d1 = new Data();
//        d1.printData(5);

        int a = 5;
        Data obj = new Data();
        obj.data = 20;
        changeValue(a,obj);
        System.out.println(a);
        System.out.println(obj.data);

    }

    static void changeValue(int a,Data obj)
    {
        a = 10;
        obj.data= 100;
    }
}
