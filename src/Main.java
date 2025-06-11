class Car {
    String brand;
    int year;
    String model;

    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public void displayinfo() {
        System.out.println("Car brand: " + brand + ", Year: " + year + ", Model: " + model);

    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("KIA", 2025, "K9");

        car.displayinfo();
    }
}