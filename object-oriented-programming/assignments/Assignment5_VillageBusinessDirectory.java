/**
 * ASSIGNMENT 5: Village/Shehia Business Directory System
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 * Total Marks: 100
 *
 * ============================================================
 * ASSIGNMENT OVERVIEW:
 * ============================================================
 *
 * Create a business directory for YOUR HOME VILLAGE/SHEHIA.
 * This is a comprehensive project testing ALL OOP concepts learned.
 *
 * YOU MUST USE REAL BUSINESSES FROM YOUR ACTUAL HOME AREA.
 *
 * ============================================================
 * BACKGROUND:
 * ============================================================
 *
 * Every village/shehia in Zanzibar has local businesses:
 * - Shops (duka)
 * - Restaurants/Food vendors (mama lishe, chips mayai)
 * - Services (fundi, saloon, charging station)
 * - Agriculture (farmers, fishermen)
 *
 * Your task is to create a digital directory of businesses
 * in YOUR specific area that can help residents find services.
 *
 * ============================================================
 * REQUIREMENTS:
 * ============================================================
 *
 * PART A: Business Class Hierarchy (30 marks)
 *
 * 1. Interface: Contactable
 *    - getPhone()
 *    - getLocation()
 *    - isOpen(String dayOfWeek, String time)
 *
 * 2. Abstract Class: Business implements Contactable
 *    - businessName (String)
 *    - ownerName (String)
 *    - phoneNumber (String)
 *    - location (String) - specific area within your shehia
 *    - operatingHours (String)
 *    - yearsInOperation (int)
 *    - abstract: getBusinessType()
 *    - abstract: getServices()
 *
 * 3. Class: Shop extends Business
 *    - productCategories (ArrayList<String>)
 *    - hasDelivery (boolean)
 *    - acceptsMobileMoney (boolean)
 *
 * 4. Class: FoodVendor extends Business
 *    - specialties (ArrayList<String>)
 *    - averagePrice (double)
 *    - seatingCapacity (int)
 *
 * 5. Class: ServiceProvider extends Business
 *    - serviceType (String) - "Fundi", "Saloon", "Tailor", etc.
 *    - skills (ArrayList<String>)
 *    - priceRange (String)
 *
 * PART B: Directory System (30 marks)
 *
 * 1. BusinessDirectory class:
 *    - shehiaName (String) - YOUR shehia
 *    - districtName (String)
 *    - businesses (ArrayList<Business>)
 *
 * 2. Methods:
 *    - addBusiness(Business b)
 *    - searchByName(String name)
 *    - searchByType(String type)
 *    - searchByProduct(String product)
 *    - getBusinessesOpenNow()
 *    - getBusinessesByLocation(String area)
 *    - getStatistics() - count per category
 *    - displayAllBusinesses()
 *
 * PART C: User Interface (20 marks)
 *
 * Create a menu-driven application:
 * 1. View all businesses
 * 2. Search business by name
 * 3. Find businesses by type (Shop/Food/Service)
 * 4. Find open businesses now
 * 5. Add new business
 * 6. View directory statistics
 * 7. Display businesses by area
 * 8. Exit
 *
 * PART D: Real Data Entry (20 marks)
 *
 * Enter at least 15 REAL businesses from YOUR shehia:
 * - At least 5 shops
 * - At least 5 food vendors
 * - At least 5 service providers
 *
 * Include REAL information:
 * - Actual business names
 * - Actual owner names (first name only for privacy)
 * - Real phone numbers (ask permission or use XXX-XXXX format)
 * - Actual locations within your shehia
 * - Real operating hours
 *
 * ============================================================
 * EXAMPLE OUTPUT:
 * ============================================================
 *
 *    ╔══════════════════════════════════════════════════════════╗
 *    ║     BUSINESS DIRECTORY - [Your Shehia Name]              ║
 *    ║     District: [Your District]                            ║
 *    ║     Compiled by: [Your Name] - [Reg Number]              ║
 *    ╠══════════════════════════════════════════════════════════╣
 *    ║                                                          ║
 *    ║  STATISTICS:                                             ║
 *    ║  ├── Total Businesses: 15                                ║
 *    ║  ├── Shops: 5                                            ║
 *    ║  ├── Food Vendors: 5                                     ║
 *    ║  └── Service Providers: 5                                ║
 *    ║                                                          ║
 *    ╠══════════════════════════════════════════════════════════╣
 *    ║                                                          ║
 *    ║  SHOPS:                                                  ║
 *    ║  ┌─────────────────────────────────────────────────────┐ ║
 *    ║  │ 1. Duka la [Name]                                   │ ║
 *    ║  │    Owner: [First Name]                              │ ║
 *    ║  │    Location: [Area within shehia]                   │ ║
 *    ║  │    Phone: 07XX-XXX-XXX                              │ ║
 *    ║  │    Hours: 7:00 AM - 9:00 PM                         │ ║
 *    ║  │    Products: Groceries, Household items             │ ║
 *    ║  │    Mobile Money: YES                                │ ║
 *    ║  └─────────────────────────────────────────────────────┘ ║
 *    ║                                                          ║
 *    ║  [Continue for all businesses...]                        ║
 *    ║                                                          ║
 *    ╚══════════════════════════════════════════════════════════╝
 *
 * ============================================================
 * SUBMISSION:
 * ============================================================
 * - Contactable.java (interface)
 * - Business.java (abstract class)
 * - Shop.java
 * - FoodVendor.java
 * - ServiceProvider.java
 * - BusinessDirectory.java
 * - DirectoryApp.java (main)
 * - Photo of at least 3 businesses you listed (for verification)
 * - Brief description of your shehia (location, population estimate)
 *
 * VERIFICATION: You may be asked to present your directory and
 * explain the businesses. Fake entries = automatic ZERO.
 *
 * COMMUNITY IMPACT: The best directories may be shared with
 * your shehia leadership for actual community use!
 */

public class Assignment5_VillageBusinessDirectory {
    public static void main(String[] args) {
        System.out.println("Create a business directory for YOUR home shehia/village.");
        System.out.println("This demonstrates: Interfaces, Abstract Classes, Inheritance, Polymorphism");
        System.out.println("");
        System.out.println("Required files:");
        System.out.println("- Contactable.java (interface)");
        System.out.println("- Business.java (abstract class)");
        System.out.println("- Shop.java");
        System.out.println("- FoodVendor.java");
        System.out.println("- ServiceProvider.java");
        System.out.println("- BusinessDirectory.java");
        System.out.println("- DirectoryApp.java (main)");
    }
}

// HINT: Interface and Abstract Class structure
/*
interface Contactable {
    String getPhone();
    String getLocation();
    boolean isOpen(String dayOfWeek, String time);
}

abstract class Business implements Contactable {
    protected String businessName;
    protected String ownerName;
    protected String phoneNumber;
    protected String location;
    protected String operatingHours;
    protected int yearsInOperation;

    // Constructor
    public Business(String name, String owner, String phone,
                   String location, String hours, int years) {
        // Initialize attributes
    }

    // Abstract methods
    public abstract String getBusinessType();
    public abstract ArrayList<String> getServices();

    // Implement Contactable methods
    @Override
    public String getPhone() {
        return phoneNumber;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public boolean isOpen(String day, String time) {
        // Parse operating hours and check
        // This is a challenging method to implement!
    }

    // toString for display
    @Override
    public String toString() {
        // Formatted business info
    }
}

class Shop extends Business {
    private ArrayList<String> productCategories;
    private boolean hasDelivery;
    private boolean acceptsMobileMoney;

    // Constructor, getters, setters
    // Implement abstract methods
}

// Similar for FoodVendor and ServiceProvider
*/
