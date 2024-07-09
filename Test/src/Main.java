import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello world!");
        Scanner s = new Scanner(System.in);
        String x = s.next();
        System.out.println(x);

        int a[] = {1,2,3};
        int b[] = {1,2,3};

        boolean equals = Arrays.equals(a, b);

        System.out.println(equals);


    }
}