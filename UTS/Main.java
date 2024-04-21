public class Main {
    public static void main(String[] args) {
        // Creating instances of different vehicles
        Car car = new Car("Toyota Camry", "Red", 2022, 4);
        Truck truck = new Truck("Ford F-150", "Blue", 2020, 2.5);
        Motorcycle motorcycle = new Motorcycle("Honda CB500X", "Black", 2021, "Adventure");

        // Displaying vehicle information
        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println("\nTruck Information:");
        truck.displayInfo();
        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();
    }
}
