abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}
// Subclass implements the abstract method
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
// Main class
public class AbstractionExample1 {
    public static void main(String[] args) {
        Animal dog = new Dog();  // Upcasting
        dog.makeSound();         // Calls Dog's makeSound()
        dog.sleep();             // Calls concrete method
    }
}
