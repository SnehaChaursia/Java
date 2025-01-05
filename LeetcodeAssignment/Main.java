package LeetcodeAssignment;


   // Abstract class Animal
abstract class Animal {
    // Abstract method
    public abstract void sound();

    // Concrete method (optional)
    public void display() {
        System.out.println("This is an animal.");
    }
}

// Concrete class Cat extending Animal
class Cat extends Animal {
    // Implementing the abstract method
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        // Create an object of the concrete class Cat
        Animal myCat = new Cat();

        // Demonstrate the use of abstract and concrete methods
        myCat.display();
        myCat.sound();
    }
}
// output: 
// This is an animal.
// Meow
 

