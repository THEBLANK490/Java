package z;

class Animal {
    String type;
    public Animal(String type) {
        this.type = type;
        System.out.println("Animal constructor called.");
    }
    void eat() {
        System.out.println(type + " is eating");
    }
}

class Cat extends Animal {
    String breed;
    public Cat(String type, String breed) {
        super(type);
        this.breed = breed;
        System.out.println("Cat constructor called.");
    }
        void meow() {
        System.out.println(breed + " is meowing");
    }
}

public class Ques8_SuperClassConstructor {
    public static void main(String[] args) {
        Cat c = new Cat("Sphynx", "Ragdoll");
        c.eat();
        c.meow();
        System.out.println("\n");
        System.out.println("Done By Sanish Maharjan");
        System.out.println("23502");
    }
}
