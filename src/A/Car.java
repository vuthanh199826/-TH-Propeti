package A;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
}
class Test{
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactive 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 6","Skyactive 6");
        System.out.println(Car.numberOfCar);
    }
}