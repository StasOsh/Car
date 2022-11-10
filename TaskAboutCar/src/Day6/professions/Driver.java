package Day6.professions;

import Day6.vehicles.Person;

public class Driver extends Person {
    public String name;
    public int experience;

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public static String driverInfo(Driver driver) {
        return driver.getName() + "," + driver.getExperience();

    }


}
