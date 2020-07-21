package Q4;

public class CarType {

    private String make;
    private String model;
    private double engineCapacity;

    public CarType() {
        this("","",0.0);
    }

    public CarType(String make, String carModel, double engineCapacity) {
        this.make = make;
        this.model = carModel;
        this.engineCapacity = engineCapacity;
    }
    
    public String toString() {
        return String.format("%-10s %-10s %-10s", this.make, this.model, this.engineCapacity);
    }
}
