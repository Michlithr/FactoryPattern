import cars.*;

public class Main {
    public static void main(String[] argv){
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car e60 = commonwealthFactory.buildBMW(BMWTypes.E60);
        System.out.println(e60);
        Car x5 = continentalFactory.buildBMW(BMWTypes.X5);
        System.out.println(x5);

        Car cmax = continentalFactory.buildFord(FordTypes.CMAX);
        System.out.println(cmax);
        Car focus = continentalFactory.buildFord(FordTypes.FOCUS);
        System.out.println(focus);

    }
}
