package ConditionalStatements;

public class IfElse {

    public static void main(String[] args) {

        int a = 65;
        int b = 23;
        int c = 95;
        int d = 79;

//        if (a > b && a > c)
//        {
//            System.out.println("a is greater ");
//        }
//        else if (b > c)
//        {
//            System.out.println("b is greater");
//
//        }
//        else
//        {
//            System.out.println("c is greater");
//        }

//        if (a > b && a > c && a > d)
//        {
//            System.out.println("a is greater ");
//        }
//        else if (b>c && b>d)
//        {
//            System.out.println("b is greater");
//
//        }
//        else if (c>d)
//        {
//            System.out.println("c is greater");
//        }
//        else
//        {
//            System.out.println("d is greater");
//
//        }

//       int max =  (a>b && a>c)?a:((b>c)?b:c);
//        System.out.println("Largest number is"+max);

//        int max = (a>b && a>c && a>d)?(a):((b>c && b>d)?(b):(c>d?c:d));
//        System.out.println("Largest number is"+max);

        int max2 = (a>b&& a>c)?(a):((b>c)?(b):(c));
        System.out.println("Largest number is"+max2);

    }
}
