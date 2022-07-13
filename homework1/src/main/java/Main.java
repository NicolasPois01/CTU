public class Main {
    public static void main(String[] args){
        Car firstCar = new Car(4, 12);
        firstCar.setColor("Blue");
        firstCar.setYear(2018);
        firstCar.getDetails();
        Factory factory = new Factory();
        Car aPersonal = factory.createPersonal();
        Car aCargo = factory.createCargo();
        aPersonal.getDetails();
        aCargo.getDetails();
    }
}
