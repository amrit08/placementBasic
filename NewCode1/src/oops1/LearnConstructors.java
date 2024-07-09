package oops1;
public class LearnConstructors
{
    public static void main(String[] args)
    {
        Complex num1 = new Complex(2,4);
        num1.print();
        Complex num2 = new Complex(4,1);
        num2.print();
        System.out.println("adding two numbers");
        Complex res =  num2.add(num1);
        System.out.println(num1);
        res.print();

    }

}

class Complex // non-primitive data types
{
    int a , b;
    public  Complex() //Default Constructor
    {
        a=5;
        b=8;
        System.out.println("Creating new object");
    }

    public Complex(int a, int b)
    {
       this.a = a;
       this.b = b;
    }

    void print()
    {
        System.out.println(a+"+"+b+"i");
    }

    Complex add(Complex num2)
    {
        System.out.println(this);
        this.print();
        num2.print();
        Complex newNum = new Complex(a+ num2.a,b+ num2.b);
        return  newNum;
    }

}