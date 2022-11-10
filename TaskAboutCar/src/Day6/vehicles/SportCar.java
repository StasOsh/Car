package Day6.vehicles;

import Day6.details.Engine;
import Day6.professions.Driver;

public class SportCar extends Car {
    public static int topSpeed;


    public SportCar(String model, String class_car, int weight, Driver driver, Engine engine) {
        super(model, class_car, weight, driver, engine);
    }

}
