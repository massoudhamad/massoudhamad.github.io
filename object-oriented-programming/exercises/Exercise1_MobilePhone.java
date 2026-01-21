/**
 * EXERCISE 1: Mobile Phone Class
 * PT821: Object-Oriented Programming - Classes and Objects
 *
 * TASK: Complete the MobilePhone class below
 *
 * Requirements:
 * 1. Add the following private attributes:
 *    - brand (String)
 *    - model (String)
 *    - price (double)
 *    - batteryLevel (int) - percentage 0-100
 *    - isOn (boolean)
 *
 * 2. Create constructors:
 *    - Default constructor (set brand="Unknown", model="Unknown", price=0, batteryLevel=100, isOn=false)
 *    - Parameterized constructor (brand, model, price)
 *
 * 3. Add getters for all attributes
 *
 * 4. Add setters with validation:
 *    - price must be positive
 *    - batteryLevel must be between 0 and 100
 *
 * 5. Add behavior methods:
 *    - turnOn() - turns phone on if battery > 0
 *    - turnOff() - turns phone off
 *    - makeCall(String contactName) - makes a call (reduces battery by 5%)
 *    - chargeBattery(int minutes) - each minute adds 2% (max 100%)
 *    - displayInfo() - shows all phone details
 *
 * 6. Test your class in the main method
 */
public class Exercise1_MobilePhone {

    // TODO: Add private attributes here


    // TODO: Add default constructor


    // TODO: Add parameterized constructor


    // TODO: Add getters


    // TODO: Add setters with validation


    // TODO: Add behavior methods


    // TODO: Add displayInfo() method


    public static void main(String[] args) {
        System.out.println("=== Mobile Phone Exercise ===\n");

        // TODO: Create a phone using default constructor


        // TODO: Create a phone with brand="Samsung", model="Galaxy S24", price=2500000


        // TODO: Turn on the phone


        // TODO: Make 3 calls to different contacts


        // TODO: Display phone info


        // TODO: Charge the phone for 10 minutes


        // TODO: Display phone info again


        System.out.println("\n=== Exercise Complete ===");
    }
}
