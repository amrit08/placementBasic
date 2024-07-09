package strings;

import java.util.Scanner;

public class StringBasics
{
    public static void main(String[] args)
    {
        String name = "Amrit";
        String sameName = "Amrit";
        int a = 12;
        int b = 12;

        String newName = new String("Amrit");

        System.out.println(name);
        System.out.println(newName);
        System.out.println("Amrit Jaiswal");

        if(a == b)
        {
            System.out.println("both are same");

        }
        else
        {
            System.out.println("both are not same");

        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter yours first name");
        String c =  s.nextLine();
        System.out.println("Enter yours second name");
        String d =  s.next();

        System.out.println(c+d);

    }

}
