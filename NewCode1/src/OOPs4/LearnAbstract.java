package OOPs4;

import java.io.PrintStream;

public class LearnAbstract
{
    int x=10;

    class  Inner
    {
        int y = 20;

        void  innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);

        }
    }

    void outerDis()
    {
        Inner i = new Inner();
        i.y = 23;

    }

    static class Playstation
    {
        int price;

    }

    public static void main(String[] args)
    {
        LearnAbstract obj = new LearnAbstract();
        Inner i = obj.new Inner();
        i.y = 32;

        Playstation playstation = new LearnAbstract.Playstation();
        playstation.price = 34987321;
        System.out.println(playstation.price);


    }

}
