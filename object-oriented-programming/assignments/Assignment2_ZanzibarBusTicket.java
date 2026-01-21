/**
 * ASSIGNMENT 2: Zanzibar Daladala/Bus Ticket Booking System
 * PT821 - Object-Oriented Programming
 * Due Date: [Set by Instructor]
 * Total Marks: 100
 *
 * ============================================================
 * ASSIGNMENT OVERVIEW:
 * ============================================================
 *
 * Create a bus ticket booking system for routes YOU actually travel.
 * This tests OOP concepts: Classes, Objects, Methods, ArrayList, and Encapsulation.
 *
 * YOU MUST USE REAL ROUTES YOU TRAVEL FROM HOME TO SUZA CHWAKA.
 *
 * ============================================================
 * REQUIREMENTS:
 * ============================================================
 *
 * PART A: Route Class (25 marks)
 * Create a Route class with:
 * 1. Private attributes:
 *    - routeId (String)
 *    - startPoint (String) - e.g., "Darajani"
 *    - endPoint (String) - e.g., "Chwaka"
 *    - distance (double) - in kilometers
 *    - baseFare (double) - in TSh
 *    - estimatedTime (int) - in minutes
 *    - stops (ArrayList<String>) - intermediate stops
 *
 * 2. Methods:
 *    - addStop(String stop)
 *    - calculateFare(boolean isStudent) - students get 20% discount
 *    - getRouteInfo() - returns formatted route details
 *
 * PART B: Ticket Class (25 marks)
 * Create a Ticket class with:
 * 1. Private attributes:
 *    - ticketId (String) - auto-generated
 *    - passengerName (String)
 *    - passengerPhone (String)
 *    - route (Route object)
 *    - travelDate (String)
 *    - travelTime (String)
 *    - isStudentTicket (boolean)
 *    - seatNumber (int)
 *    - bookingTime (String)
 *
 * 2. Methods:
 *    - generateTicketId() - format: TKT-[YYYYMMDD]-[RandomNumber]
 *    - calculateTotalFare()
 *    - printTicket() - displays formatted ticket
 *
 * PART C: BookingSystem Class (30 marks)
 * Create the main booking system:
 * 1. Pre-loaded routes (use YOUR actual travel routes):
 *    - Route from your home area to Stone Town
 *    - Route from Stone Town to Chwaka (SUZA)
 *    - At least 3 more routes you know
 *
 * 2. Menu system:
 *    a) View all available routes
 *    b) Book a new ticket (for yourself)
 *    c) View my bookings
 *    d) Cancel a booking
 *    e) Search route by destination
 *    f) Calculate fare for a route
 *    g) Exit
 *
 * 3. Store bookings in ArrayList<Ticket>
 *
 * PART D: Personal Implementation (20 marks)
 * 1. First booking MUST be for YOUR daily route to SUZA
 * 2. Include realistic fares (current daladala prices)
 * 3. Include actual stops on your route
 * 4. Program must display YOUR name and registration on tickets
 *
 * ============================================================
 * EXAMPLE OUTPUT - TICKET:
 * ============================================================
 *
 *    ┌─────────────────────────────────────────┐
 *    │     ZANZIBAR BUS TICKET                 │
 *    │     ═══════════════════                 │
 *    ├─────────────────────────────────────────┤
 *    │  Ticket No: TKT-20250108-4521           │
 *    │  Passenger: [Your Name]                 │
 *    │  Phone: 07XX XXX XXX                    │
 *    │  Student: YES (20% Discount Applied)   │
 *    ├─────────────────────────────────────────┤
 *    │  FROM: [Your Home Area]                 │
 *    │  TO: Chwaka (SUZA Campus)               │
 *    │  VIA: [Stop1] → [Stop2] → [Stop3]       │
 *    │                                         │
 *    │  Date: 08/01/2025                       │
 *    │  Time: 07:30 AM                         │
 *    │  Seat: 12                               │
 *    ├─────────────────────────────────────────┤
 *    │  Base Fare: TSh 2,000                   │
 *    │  Discount: TSh 400                      │
 *    │  TOTAL: TSh 1,600                       │
 *    └─────────────────────────────────────────┘
 *
 * ============================================================
 * SUBMISSION:
 * ============================================================
 * - Route.java
 * - Ticket.java
 * - BookingSystem.java (main)
 * - Screenshot showing YOUR booked ticket
 * - List of actual routes and fares you used (verified)
 *
 * PLAGIARISM WARNING: Routes and fares must match your actual location.
 * You may be asked to explain your route in class.
 */

public class Assignment2_ZanzibarBusTicket {
    public static void main(String[] args) {
        System.out.println("Implement the booking system in separate class files.");
        System.out.println("Use YOUR real travel routes to SUZA Chwaka.");
    }
}

// HINT STRUCTURES:

/*
class Route {
    private String routeId;
    private String startPoint;
    private String endPoint;
    private double distance;
    private double baseFare;
    private int estimatedTime;
    private ArrayList<String> stops;

    // Constructor, getters, setters, methods...
}

class Ticket {
    private String ticketId;
    private String passengerName;
    private Route route;
    // ... other attributes

    public void printTicket() {
        // Create the formatted ticket display
    }
}

class BookingSystem {
    private ArrayList<Route> routes;
    private ArrayList<Ticket> bookings;
    private Scanner scanner;

    public void displayMenu() {
        // Show menu options
    }

    public void bookTicket() {
        // Booking logic
    }
}
*/
