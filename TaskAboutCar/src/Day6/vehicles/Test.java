package Day6.vehicles;

import Day6.details.Engine;
import Day6.professions.Driver;

public class Test {
    public static void main(String[] args) {


        Driver driver1 = new Driver("Ivanov Ivan Ivanovich", 6);

        Engine engine1 = new Engine(115, "ZavodOpel");

        Car lorry1 = new Lorry("Opel", "C", 1550, driver1, engine1);


        System.out.println(lorry1.toString());


    }
}
