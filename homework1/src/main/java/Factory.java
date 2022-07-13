public class Factory {
    public Car createCargo(){
        Car myCargo = new Car(6, 50);
        return myCargo;
    }
    public Car createPersonal(){
        Car myPersonal = new Car(4, 17);
        return myPersonal;
    }
}
