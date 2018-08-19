package cars;

public interface Factory {
    Car buildBMW(BMWTypes bmwTypes);
    Car buildFord(FordTypes fordTypes);
}
