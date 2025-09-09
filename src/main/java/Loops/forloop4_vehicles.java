package main.java.Loops;

public class forloop4_vehicles
{
    public static void main(String[] args)
    {
        String[] cars = {"Sedan", "SUV", "Truck"};
        //a list or array is a collection of elements or items of a specific data type
        for (String car : cars) {
            System.out.println(car);
        }
        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }
}
