package Day6.details;


public class Engine {
    public int power;
    public String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static String engineInfo(Engine engine) {
        return engine.getPower() + "," + engine.getManufacturer();
    }
}
