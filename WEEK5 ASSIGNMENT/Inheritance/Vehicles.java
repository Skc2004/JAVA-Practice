class Vehicle {
    String make;
    String model;
    int year;
    int num_wheels;


    public Vehicle(String make, String model, int year, int num_wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
    }


    public void displayVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Wheels: " + num_wheels);
    }
}


interface Engine {
    String getType();
    int getHorsepower();
    String getFuelType();
}


class Car extends Vehicle implements Engine {
    String engineType;
    int horsepower;
    String fuelType;
    int numDoors;

    public Car(String make, String model, int year, int num_wheels, String engineType, int horsepower, String fuelType, int numDoors) {
        super(make, model, year, num_wheels);
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        this.numDoors = numDoors;
    }


    @Override
    public String getType() {
        return engineType;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Number of Doors: " + numDoors);
    }
}


class Truck extends Vehicle implements Engine {
    String engineType;
    int horsepower;
    String fuelType;
    int loadCapacity;


    public Truck(String make, String model, int year, int num_wheels, String engineType, int horsepower, String fuelType, int loadCapacity) {
        super(make, model, year, num_wheels);
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        this.loadCapacity = loadCapacity;
    }


    @Override
    public String getType() {
        return engineType;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }


    public void displayTruckInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}

class Motorcycle extends Vehicle implements Engine {
    String engineType;
    int horsepower;
    String fuelType;
    boolean hasSidecar;

    public Motorcycle(String make, String model, int year, int num_wheels, String engineType, int horsepower, String fuelType, boolean hasSidecar) {
        super(make, model, year, num_wheels);
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        this.hasSidecar = hasSidecar;
    }


    @Override
    public String getType() {
        return engineType;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }


    public void displayMotorcycleInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}


public class Vehicles {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 2020, 4, "V6", 300, "Petrol", 4);
        Truck truck = new Truck("Ford", "F-150", 2019, 4, "V8", 400, "Diesel", 1000);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2021, 2, "V-Twin", 70, "Petrol", false);


        System.out.println("Car Details:");
        car.displayCarInfo();

        System.out.println("\nTruck Details:");
        truck.displayTruckInfo();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayMotorcycleInfo();
    }
}
