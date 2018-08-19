package cars;

public class ContinentalFactory implements Factory{
    private final SteeringWheelType steeringWheelType = SteeringWheelType.RIGHT;

    @Override
    public Car buildBMW(BMWTypes bmwTypes) {
        switch(bmwTypes){
            case X5:
                return new BMW(3.0f, "diesel", 2016, steeringWheelType);
            case E60:
                return new BMW(3.0f, "petrol", 2015, steeringWheelType);
            default:
                throw new UnsupportedOperationException("Unknown model of bmw");
        }
    }

    @Override
    public Car buildFord(FordTypes fordTypes) {
        switch(fordTypes){
            case CMAX:
                return new Ford(2.1f, "diesel", 2018, steeringWheelType);
            case FOCUS:
                return new Ford(2.0f, "petrol", 2018, steeringWheelType);
            default:
                throw new UnsupportedOperationException("Unknown model of Ford");
        }
    }
}
