/**
 * Exercise 12: Inheritance - Vehicle Hierarchy
 * PT821 - Object-Oriented Programming
 * State University of Zanzibar (SUZA)
 *
 * INSTRUCTIONS:
 * Complete the following exercise to practice inheritance concepts.
 * Follow the TODO comments and implement the required functionality.
 */

// ============================================
// EXERCISE: Create a Vehicle Hierarchy
// ============================================

/*
 * TODO 1: Create a base class called "Vehicle" with:
 * - Protected attributes: brand (String), model (String), year (int), price (double)
 * - Constructor that initializes all attributes
 * - Method: displayInfo() - prints all vehicle information
 * - Method: startEngine() - prints "[brand] [model] engine started"
 * - Method: stopEngine() - prints "[brand] [model] engine stopped"
 */

// Write your Vehicle class here:


/*
 * TODO 2: Create a class "Car" that extends Vehicle with:
 * - Private attributes: numDoors (int), fuelType (String)
 * - Constructor that calls super() and initializes its own attributes
 * - Override displayInfo() to include car-specific information
 * - Method: honk() - prints "[brand] [model] says: Beep! Beep!"
 * - Method: openTrunk() - prints "Opening trunk of [brand] [model]"
 */

// Write your Car class here:


/*
 * TODO 3: Create a class "Motorcycle" that extends Vehicle with:
 * - Private attributes: engineCC (int), hasHelmetStorage (boolean)
 * - Constructor that calls super() and initializes its own attributes
 * - Override displayInfo() to include motorcycle-specific information
 * - Method: wheelie() - prints "[brand] [model] is doing a wheelie!"
 * - Method: kickStart() - prints "Kick starting [brand] [model]"
 */

// Write your Motorcycle class here:


/*
 * TODO 4: Create a class "ElectricCar" that extends Car with:
 * - Private attributes: batteryCapacity (double in kWh), range (int in km)
 * - Constructor that calls super() and initializes its own attributes
 * - Override startEngine() to print "[brand] [model] electric motor activated silently"
 * - Method: charge() - prints "Charging [brand] [model]... Battery: [batteryCapacity] kWh"
 * - Method: displayBatteryStatus() - prints current battery info
 */

// Write your ElectricCar class here:


/*
 * TODO 5: Create the main class to test your vehicle hierarchy
 */

public class Exercise12_Inheritance {
    public static void main(String[] args) {
        System.out.println("=== VEHICLE HIERARCHY TEST ===\n");

        // TODO: Create a Car object
        // Car car = new Car("Toyota", "Corolla", 2023, 45000000, 4, "Petrol");

        // TODO: Create a Motorcycle object
        // Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2022, 15000000, 500, false);

        // TODO: Create an ElectricCar object
        // ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 2024, 85000000, 4, "Electric", 75.0, 450);

        // TODO: Test all methods for each vehicle
        // System.out.println("--- Testing Car ---");
        // car.displayInfo();
        // car.startEngine();
        // car.honk();
        // car.openTrunk();
        // car.stopEngine();

        // System.out.println("\n--- Testing Motorcycle ---");
        // motorcycle.displayInfo();
        // motorcycle.startEngine();
        // motorcycle.wheelie();
        // motorcycle.kickStart();
        // motorcycle.stopEngine();

        // System.out.println("\n--- Testing Electric Car ---");
        // electricCar.displayInfo();
        // electricCar.startEngine();  // Should print silent activation
        // electricCar.charge();
        // electricCar.displayBatteryStatus();
        // electricCar.honk();  // Inherited from Car
        // electricCar.stopEngine();

        // TODO: Demonstrate polymorphism with array of vehicles
        // System.out.println("\n--- Polymorphism Demo ---");
        // Vehicle[] vehicles = {car, motorcycle, electricCar};
        // for (Vehicle v : vehicles) {
        //     v.displayInfo();
        //     v.startEngine();
        //     System.out.println();
        // }

        System.out.println("\n=== END OF TEST ===");
    }
}

/*
 * EXPECTED OUTPUT (after completing all TODOs):
 *
 * === VEHICLE HIERARCHY TEST ===
 *
 * --- Testing Car ---
 * === Vehicle Information ===
 * Brand: Toyota
 * Model: Corolla
 * Year: 2023
 * Price: TZS 45,000,000.00
 * Doors: 4
 * Fuel Type: Petrol
 * Toyota Corolla engine started
 * Toyota Corolla says: Beep! Beep!
 * Opening trunk of Toyota Corolla
 * Toyota Corolla engine stopped
 *
 * --- Testing Motorcycle ---
 * === Vehicle Information ===
 * Brand: Honda
 * Model: CBR500R
 * Year: 2022
 * Price: TZS 15,000,000.00
 * Engine: 500cc
 * Helmet Storage: No
 * Honda CBR500R engine started
 * Honda CBR500R is doing a wheelie!
 * Kick starting Honda CBR500R
 * Honda CBR500R engine stopped
 *
 * ... (more output)
 *
 * SUBMISSION:
 * - Complete all TODO sections
 * - Test your code thoroughly
 * - Submit the completed .java file
 */
