package racing;

import org.xml.sax.ext.Locator2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Car car = new Car();
        car .name = "Audi";
        car .fuelLevel = 60;
        car .mileage = 8.5;
        car .doorCount = 5;
        car .maxSpeed = 180;
        car .fuelType = "Gasoline";

        Engine engine = new Engine;
        engine.manufacturer = "Renault";
        engine.capacity = 1600;
        car.engine = engine;


        System.out.println(car.name);
        System.out.println(car.travelDistance);
        System.out.println(car.running);

        car.name = "Skoda";

//        car.name = null;



        Car car2 = new Car();
        car2.name = "Golf";
        car2.mileage = 10.1;
        car2.doorCount = 4;
        car2.maxSpeed = 220;
        System.out.println("Car2 name: " +car2.name);
        System.out.println("Car2 name: " +car2.name);
    }
}
