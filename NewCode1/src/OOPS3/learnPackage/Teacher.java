package OOPS3.learnPackage;

public class Teacher
{
    public int a1 = 6;
   public int teachingClass;
   private  int id;
   static  int a =2;
   String degree;// default or package-private

   protected int studentsCount;

    public static void main(String[] args)
    {
        Teacher obj = new Teacher();
        obj.teachingClass = 10;
        obj.id = 12;
    }


}
