package z;

class ElectronicDevice {
    public void turnOn() {
        System.out.println("Turning on the electronic device");
    }
}

class Television extends ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on the television");
    }
}

public class Practical1_Q9 {

    public static void main(String[] args) {
        Television myTelevision = new Television();

        // Calling the overridden method
        myTelevision.turnOn(); 
    }
}
