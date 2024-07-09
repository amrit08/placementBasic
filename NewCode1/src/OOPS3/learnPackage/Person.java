package OOPS3.learnPackage;

public class Person
{

   private int age;

   private String name;

   boolean canBeChanged = false;

   static  public int count = 12;

   public  void setAge(int age)
   {
       if (canBeChanged)
            this.age = age;
   }

   public int getAge()
   {
       return age;
   }



}
