import java.util.ArrayList;
import java.util.List;

public class Car {
    private int year;
    private String color;
    private int numberOfWheel;
    private int diameter;

    private List<Wheel> wheels = new ArrayList<>();

    public Car(int numberOfWheel, int diameter) {
        this.numberOfWheel = numberOfWheel;
        this.diameter = diameter;

        for (int index = 0; index < this.numberOfWheel; index++){
            this.wheels.add(new Wheel(this.diameter));
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void getDetails(){
        System.out.println("Number of wheel : " + this.getNumberOfWheel());
        System.out.println("Size of the wheels : " + this.getDiameter());
        System.out.println("Color : " + this.getColor());
        System.out.println("Year : " + this.getYear());
    }
}
