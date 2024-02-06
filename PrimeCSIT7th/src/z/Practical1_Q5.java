package z;

class Parent {

    void parent() {
        System.out.println("I am a Parent");
    }
}

// Single-level inheritance
class Child extends Parent {

    void single() {
        System.out.println("I am a Child. Showing Single level Inheritance.");
    }
}

// Multi-level inheritance
class GrandChild extends Child {

    void multi() {
        System.out.println("I am a Grand Child. Showing Multi level Inheritance.");
    }
}

public class Practical1_Q5 {

    public static void main(String[] args) {
        // Single-level inheritance
        Child c = new Child();
        c.parent();
        c.single();
        
        // Multi-level inheritance        
        System.out.println("\n");
        GrandChild gc = new GrandChild();
        gc.parent();
        gc.multi();
        gc.single();
        
        
    }
}
