package OOPS2;

public class Vehicle
{
    final int gears = 4;

    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle(3);
       // v1.gears= 4;
        v1.accelarate();

    }

    int wheelsCount;
    String model;

    Vehicle()
    {
        System.out.println("Creating a vehicle constructor");

    }
    Vehicle(int wheelsCount)
    {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start()
    {
        System.out.println("Vehicle is starting");
    }

    final void accelarate()
    {
        System.out.println("Vehicle is accelarting");
    }

}
