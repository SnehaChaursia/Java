package LeetcodeAssignment;


    public class Car {
        // Private attributes for encapsulation
        private String make;
        private int year;
    
        // Constructor
        public Car(String make, int year) {
            this.make = make;
            this.year = year;
        }
        // Public getter for make
        public String getMake() {
            return make;
        }
    
        // Public setter for make
        public void setMake(String make) {
            this.make = make;
        }
    
        // Public getter for year
        public int getYear() {
            return year;
        }
    
        // Public setter for year
        public void setYear(int year) {
           
                this.year = year;
           }
            
        // Method to display car details
        public void displayDetails() {
            System.out.println("Car Make: " + make);
            System.out.println("Car Year: " + year);
        }
    
        // Main method to test the Car class
        public static void main(String[] args) {
            Car myCar = new Car("Toyota", 2020);
            myCar.displayDetails();
    
            // Modifying car details using setters
            myCar.setMake("Honda");
            myCar.setYear(2022);
    
            System.out.println("\nUpdated Car Details:");
            myCar.displayDetails();
    
        
        }
    }
    

