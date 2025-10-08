public class Car {
    String color;
    String model;

    void drive() {
        System.out.println("Driving");
    }

    void stop() {
        System.out.println("Stopping");
    }
}
class Main{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.model = "Toyota";
        myCar.drive();
        myCar.stop();

        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Color: " + myCar.color);
    }
}
