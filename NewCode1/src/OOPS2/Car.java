package OOPS2;

public class Car extends Vehicle
{
    String color;
    void  start()
    {
        super.start();
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        System.out.println(this);
        System.out.println(this.model+"Car is starting");
    }
    Car breaking()
    {
        return this;
    }

    Car()
    {
       // this(2);
        super(10);
        System.out.println("Car is being created");

    }

    Car(int wheelsCount)
    {
        System.out.println("new parametrised constructor");
    }

    public static void main(String[] args)
    {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "I20";
        obj.color = "red";
        obj.start();
        obj.accelarate();
        System.out.println(obj.wheelsCount);

    }

}

class Scooter
{
    void braking(Car car)
    {
        System.out.println(car.model+"Scooter is breaking");

    }

}


