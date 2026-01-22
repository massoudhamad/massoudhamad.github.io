/**
 * Exercise 15: Interfaces - Smart Home System
 * PT821 - Object-Oriented Programming
 * State University of Zanzibar (SUZA)
 *
 * INSTRUCTIONS:
 * Complete the following exercise to practice interface concepts.
 * Follow the TODO comments and implement the required functionality.
 */

// ============================================
// EXERCISE: Create a Smart Home System
// ============================================

/*
 * TODO 1: Create an interface "Switchable" with:
 * - void turnOn()
 * - void turnOff()
 * - boolean isOn()
 */

// Write your Switchable interface here:


/*
 * TODO 2: Create an interface "Dimmable" with:
 * - void setBrightness(int level)  // 0-100
 * - int getBrightness()
 * - void dim()  // decrease brightness by 10
 * - void brighten()  // increase brightness by 10
 */

// Write your Dimmable interface here:


/*
 * TODO 3: Create an interface "TemperatureControllable" with:
 * - void setTemperature(double temp)
 * - double getTemperature()
 * - void increaseTemp(double amount)
 * - void decreaseTemp(double amount)
 */

// Write your TemperatureControllable interface here:


/*
 * TODO 4: Create an interface "Schedulable" with:
 * - void scheduleOn(String time)   // e.g., "06:00"
 * - void scheduleOff(String time)
 * - String getSchedule()
 * - void cancelSchedule()
 */

// Write your Schedulable interface here:


/*
 * TODO 5: Create an interface "EnergyMonitor" with:
 * - double getEnergyUsage()  // in kWh
 * - double getEstimatedCost(double ratePerKwh)
 * - void resetUsage()
 */

// Write your EnergyMonitor interface here:


/*
 * TODO 6: Create a class "SmartLight" implementing:
 * - Switchable, Dimmable, Schedulable, EnergyMonitor
 * - Attributes: name, isOn, brightness, scheduleOn, scheduleOff, energyUsed
 * - Implement all interface methods
 * - Method: displayStatus() - shows all light information
 */

// Write your SmartLight class here:


/*
 * TODO 7: Create a class "SmartAC" implementing:
 * - Switchable, TemperatureControllable, Schedulable, EnergyMonitor
 * - Attributes: name, isOn, currentTemp, targetTemp, mode (cooling/heating)
 * - Additional attribute: fanSpeed (1-5)
 * - Implement all interface methods
 * - Method: setMode(String mode)
 * - Method: setFanSpeed(int speed)
 * - Method: displayStatus()
 */

// Write your SmartAC class here:


/*
 * TODO 8: Create a class "SmartTV" implementing:
 * - Switchable, Schedulable, EnergyMonitor
 * - Attributes: name, isOn, volume (0-100), currentChannel
 * - Additional methods: setVolume(int), setChannel(int), mute(), unmute()
 * - Implement all interface methods
 * - Method: displayStatus()
 */

// Write your SmartTV class here:


/*
 * TODO 9: Create a class "SmartHomeController" with:
 * - Private arrays for different device types or use one array with interface types
 * - Method: addDevice(Switchable device)
 * - Method: turnAllOff() - turns off all Switchable devices
 * - Method: turnAllOn() - turns on all Switchable devices
 * - Method: getTotalEnergyUsage() - sum from all EnergyMonitor devices
 * - Method: dimAllLights(int level) - sets brightness for all Dimmable devices
 * - Method: displayAllDevices() - shows status of all devices
 */

// Write your SmartHomeController class here:


public class Exercise15_Interface {
    public static void main(String[] args) {
        System.out.println("=== SMART HOME SYSTEM TEST ===\n");

        // TODO: Create smart devices
        // SmartLight livingRoomLight = new SmartLight("Living Room Light");
        // SmartLight bedroomLight = new SmartLight("Bedroom Light");
        // SmartAC livingRoomAC = new SmartAC("Living Room AC");
        // SmartTV livingRoomTV = new SmartTV("Living Room TV");

        // TODO: Test SmartLight
        // System.out.println("--- Testing Smart Light ---");
        // livingRoomLight.turnOn();
        // livingRoomLight.setBrightness(75);
        // livingRoomLight.scheduleOff("22:00");
        // livingRoomLight.displayStatus();
        // System.out.println("Energy usage: " + livingRoomLight.getEnergyUsage() + " kWh");
        // System.out.println("Estimated cost: TZS " + livingRoomLight.getEstimatedCost(250));

        // TODO: Test SmartAC
        // System.out.println("\n--- Testing Smart AC ---");
        // livingRoomAC.turnOn();
        // livingRoomAC.setTemperature(22);
        // livingRoomAC.setMode("cooling");
        // livingRoomAC.setFanSpeed(3);
        // livingRoomAC.scheduleOn("14:00");
        // livingRoomAC.scheduleOff("22:00");
        // livingRoomAC.displayStatus();

        // TODO: Test SmartTV
        // System.out.println("\n--- Testing Smart TV ---");
        // livingRoomTV.turnOn();
        // livingRoomTV.setChannel(5);
        // livingRoomTV.setVolume(30);
        // livingRoomTV.scheduleOff("23:00");
        // livingRoomTV.displayStatus();

        // TODO: Test polymorphism with interfaces
        // System.out.println("\n--- Testing Polymorphism with Interfaces ---");
        //
        // // Array of Switchable devices
        // Switchable[] devices = {livingRoomLight, bedroomLight, livingRoomAC, livingRoomTV};
        // System.out.println("Turning all devices ON:");
        // for (Switchable device : devices) {
        //     device.turnOn();
        // }
        //
        // // Array of EnergyMonitor devices
        // EnergyMonitor[] monitors = {livingRoomLight, bedroomLight, livingRoomAC, livingRoomTV};
        // double totalEnergy = 0;
        // for (EnergyMonitor monitor : monitors) {
        //     totalEnergy += monitor.getEnergyUsage();
        // }
        // System.out.println("Total energy usage: " + totalEnergy + " kWh");

        // TODO: Test SmartHomeController
        // System.out.println("\n--- Testing Smart Home Controller ---");
        // SmartHomeController controller = new SmartHomeController(10);
        // controller.addDevice(livingRoomLight);
        // controller.addDevice(bedroomLight);
        // controller.addDevice(livingRoomAC);
        // controller.addDevice(livingRoomTV);
        //
        // controller.displayAllDevices();
        // controller.dimAllLights(50);
        // System.out.println("\nTotal home energy usage: " + controller.getTotalEnergyUsage() + " kWh");
        //
        // System.out.println("\nTurning all devices off for the night...");
        // controller.turnAllOff();

        System.out.println("\n=== END OF TEST ===");
    }
}

/*
 * BONUS CHALLENGE:
 *
 * 1. Create additional interfaces:
 *    - "VoiceControllable" with methods for voice commands
 *    - "RemoteAccessible" for controlling devices remotely
 *    - "SecurityEnabled" for devices with security features
 *
 * 2. Create additional devices:
 *    - "SmartDoorLock" implementing Switchable, Schedulable, SecurityEnabled
 *    - "SmartSpeaker" implementing Switchable, VoiceControllable
 *    - "SmartThermostat" implementing TemperatureControllable, Schedulable, EnergyMonitor
 *
 * 3. Create "Scene" functionality:
 *    - "MovieScene" - dims lights, turns on TV, sets AC
 *    - "SleepScene" - turns off all lights, lowers AC temp
 *    - "WakeUpScene" - gradually increases light, plays music
 *
 * 4. Add "Automation" class that:
 *    - Triggers actions based on time
 *    - Triggers actions based on conditions (if temp > X, turn on AC)
 *
 * EXPECTED OUTPUT (partial):
 *
 * === SMART HOME SYSTEM TEST ===
 *
 * --- Testing Smart Light ---
 * Living Room Light turned ON
 * Living Room Light brightness set to 75%
 * Living Room Light scheduled to turn off at 22:00
 *
 * === Smart Light Status ===
 * Name: Living Room Light
 * Status: ON
 * Brightness: 75%
 * Schedule: ON: -- | OFF: 22:00
 * Energy usage: 0.15 kWh
 * Estimated cost: TZS 37.50
 *
 * --- Testing Smart AC ---
 * Living Room AC turned ON
 * Temperature set to 22.0°C
 * Mode set to: cooling
 * Fan speed set to: 3
 *
 * === Smart AC Status ===
 * Name: Living Room AC
 * Status: ON
 * Target Temperature: 22.0°C
 * Current Temperature: 28.0°C
 * Mode: cooling
 * Fan Speed: 3
 * Schedule: ON: 14:00 | OFF: 22:00
 *
 * ... (more output)
 *
 * SUBMISSION:
 * - Complete all TODO sections
 * - Test your code thoroughly
 * - Submit the completed .java file
 */
