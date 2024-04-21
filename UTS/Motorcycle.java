public class Motorcycle extends Vehicle {
    private String type;

    // Constructor
    public Motorcycle(String model, String color, int year, String type) {
        super(model, color, year);
        this.type = type;
    }

    // Getter and setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method to display motorcycle information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}
