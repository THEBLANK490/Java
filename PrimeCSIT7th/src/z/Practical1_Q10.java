package z;

class MobilePhone {
    public void displayInfo() {
        System.out.println("Generic mobile phone information");
    }
}

class iPhone extends MobilePhone {
    @Override
    public void displayInfo() {
        System.out.println("iPhone information");
    }
}

class AndroidPhone extends MobilePhone {
    @Override
    public void displayInfo() {
        System.out.println("Android phone information");
    }
}

public class Practical1_Q10 {

    public static void main(String[] args) {
        MobilePhone phone1 = new iPhone();
        MobilePhone phone2 = new AndroidPhone();

        // Calling the overridden method using dynamic method dispatch
        phone1.displayInfo();
        phone2.displayInfo();
        System.out.println("\n");
        System.out.println("Done By Sanish Maharjan");
        System.out.println("23502");
    }
}
