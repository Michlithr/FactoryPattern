package cars;

public abstract class Car {
    private float engineCapacity;
    private String fuel;
    private int year;
    private SteeringWheelType steeringWheelPosition;

    Car(float engineCapacity, String fuel, int year, SteeringWheelType steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuel = fuel;
        this.year = year;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuel() {
        return fuel;
    }

    public int getYear() {
        return year;
    }

    public SteeringWheelType getSteeringWheelPosition(){
        return steeringWheelPosition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuel='" + fuel + '\'' +
                ", year=" + year +
                ", steeringWheelPosition='" + steeringWheelPosition + '\'' +
                '}';
    }
}
