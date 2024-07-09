package GenericsAndWrapperClasses;

public class GenericMethods
{
    public static void main(String[] args)
    {
        printData(1234);
        printData(12.2345);

        GenericMethods obj = new GenericMethods();
        obj.doubleData("hello dada");
        obj.doubleData(12345);

        CustomClass customClass = new CustomClass();
        obj.doubleData(customClass);

    }

    static <T extends Number> void printData(T data)
    {
        System.out.println(data);
    }

    <T> void doubleData(T data)
    {
        System.out.println(data);
    }

}

class CustomClass
{

}