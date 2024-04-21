public class Truck extends Vehicle {
    private double payloadCapacity;

    // Constructor
    public Truck(String model, String color, int year, double payloadCapacity) {
        super(model, color, year);
        this.payloadCapacity = payloadCapacity;
    }

    // Getter and setter for payloadCapacity
    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    // Method to display truck information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload capacity: " + payloadCapacity + " tons");
    }
}
