package z;

// Parent class
class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Starting the " + brand);
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void drive() {
        System.out.println("Driving the " + brand + " car");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    public void ride() {
        System.out.println("Riding the " + brand + " motorcycle");
    }
}

public class Practical1_Q6 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson");

        myCar.start();
        myCar.drive();

        System.out.println();

        myMotorcycle.start();
        myMotorcycle.ride();
        
        
    }
}

