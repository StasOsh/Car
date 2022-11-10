package Day6.vehicles;

import Day6.details.Engine;
import Day6.professions.Driver;

public abstract class Car {
    public String model;
    public String class_car;
    public int weight;
    Driver driver;
    Engine engine;

    public Car(String model, String class_car, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.class_car = class_car;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public static String start() {
        return "Поехали";
    }

    public static String stop() {
        return "Останавливаемся";
    }

    public static String turnRight() {
        return "Поворот направо";
    }

    public static String turnLeft() {
        return "Поворот налево";
    }

    public String toString() {

        return "Автомобиль: " + model + ". Класс автомобиля: " + class_car + ". Вес автомобиля: " + weight +
                ". Водитель: " + Driver.driverInfo(driver) + ". Двигатель: " + Engine.engineInfo(engine) + ".";
    }

}
