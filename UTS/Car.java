public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String model, String color, int year, int numberOfDoors) {
        super(model, color, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
