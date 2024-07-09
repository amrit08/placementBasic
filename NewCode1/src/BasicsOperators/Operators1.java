package BasicsOperators;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 7;
//        double c = a%b;
//        char d = '3';
//        int x = a+d;
//        System.out.println(c);
//        System.out.println(x);
         boolean first = true;
         boolean second = false;

        //System.out.println(first || second);
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        //int b = s.nextInt();
        long l = s.nextLong();
        //float f = s.nextFloat();
        //float sum = a+f;
      //  long sum = (long)a + l;
        float sum = a+l;

        System.out.println(sum);
        s.close();

    }
}
