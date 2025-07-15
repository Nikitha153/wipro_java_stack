interface Vehicle {
    void start();  // Abstract method

}

// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class AbstractionExample2 {
    public static void main(String[] args) {
        Vehicle car = new Car();  
        car.start();              
    }
}
