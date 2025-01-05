package LeetcodeAssignment;

public class Person {
    // Private attributes for encapsulation
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Please provide a non-empty name.");
        }
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();

        // Set attributes using setters
        person.setName("Sneha");
        person.setAge(25);

        // Access attributes using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Test invalid inputs
        person.setName("");
        person.setAge(-5);
    }
}

//output
// Name: Sneha
// Age: 25
// Invalid name. Please provide a non-empty name.
// Invalid age. Age cannot be negative.