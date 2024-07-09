package array;

public class array1
{
    public static void main(String[] args)
    {
        String names[] = {"ddf","uwew","iewu","iuewo"};
        for(int i=0;i< names.length;i++)
            System.out.println(names[i]);

        for (String name:names)
            System.out.println("for each "+name);

    }
}
