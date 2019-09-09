package racing;

import com.sun.jndi.ldap.LdapURL;
import org.xml.sax.ext.Locator2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

    // this

        Car car = new Car(engine);
        car.setName( "Audi" );
        car.setFuelLevel(60);
        car.setMileage(8.5);
        car.doorCount = 5;
        car.setTravelDistance(20);
        car.setMaxSpeed(180);
        car.setFuelType( "Gasoline");

        System.out.println(car.getName());
        System.out.println(car.getTravelDistance());
        System.out.println(car.isRunning());

        car.setName("Skoda");

//        car.name = null;

        car.accelerate( speed: 60, durationHours: 1);

        Car car2 = new Car(engine);

        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";

                // incrementing / decrementing by 1
        // fuelLevel1 = fuelLevel +1
        //fuelLevel1 += fuelLevel
        //fuelLevel1 ++

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from user: " + text);

        car2.setName( "Golf");
        car2.setMileage(10.1);
        car2.doorCount = 4;
        car2.setMaxSpeed(220);
        System.out.println("Car2 name: " +car2.getName());
        System.out.println("Car2 name: " +car2.getName());

        System.out.println("Static Variable examples");

//        //we should only call static variables from the class itself (Car),
//        //not from a variable containing an object from that class
//
//        car.totalCount = 1;
//        System.out.println("Total count in car: " + car.totalCount);
//        car.totalCount = 2;
//        System.out.println("Total count in car after setting car2: " + car.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount);
//        System.out.println("Total count in Car class: " + Car.totalCount);





    }
}
