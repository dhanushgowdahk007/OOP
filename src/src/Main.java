
public class Main {
    public static void main(String[] args) {

        Car firstCar = new Car();
        firstCar.brand = "Toyota";
        firstCar.topSpeed = 180;
        firstCar.fuelType = "Hybrid";

        Car secondCar = new Car("Tesla", 240, "Petrol");

        Car thirdCar = secondCar;

        thirdCar.brand = "BMW";

        firstCar.displayInfo();
        secondCar.displayInfo();
        thirdCar.displayInfo();

    }
}

class Car {
    String brand;
    int topSpeed;
    String fuelType;

    // Empty Constructor
    Car() {

    }

    Car(String brand, int topSpeed, String fuelType) {
        this.brand = brand;
        this.topSpeed = topSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + " Top Speed: " + topSpeed + "km/h" + " Fuel Type: " + fuelType);
    }
}