package ConditionalStatements;

import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter particlar day");
        int day = s.nextInt();

        switch (day)
        {
            case 1:case 2:
                System.out.println("MON");
                break;

            case 3:
                System.out.println("WED");
                break;

            case 4:
                System.out.println("THURDY");
                break;

            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;

            default :
                System.out.println("Invalid data");
                break;
        }

    }
}
