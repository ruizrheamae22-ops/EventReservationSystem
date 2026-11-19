package PresentationLayer;

import BusinessLogicLayer.BookingService;
import BusinessLogicLayer.CustomerService;
import BusinessLogicLayer.EventService;
import Models.Booking;
import Models.Customer;
import Models.Event;
import Utilities.ConsoleHelper;
import Utilities.InputValidator;

public class EventBookingScreen extends BaseScreen {
    private final EventService events;
    private final CustomerService customers;
    private final BookingService bookings;

    public EventBookingScreen(EventService events, CustomerService customers, BookingService bookings) {
        this.events = events;
        this.customers = customers;
        this.bookings = bookings;
    }

    @Override
    public void show() {
        while (true) {
            ConsoleHelper.header("MANAGE EVENT BOOKING");
            System.out.println("[1] View Events");
            System.out.println("[2] Add Event");
            System.out.println("[3] Remove Event");
            System.out.println("[4] Create Booking");
            System.out.println("[0] Back");
            try {
                switch (InputValidator.readInt("\nChoose: ")) {
                    case 1: list(); break;
                    case 2: add(); break;
                    case 3: remove(); break;
                    case 4: createBooking(); break;
                    case 0: return;
                    default: System.out.println("Invalid choice.");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            ConsoleHelper.pause();
        }
    }

    private void list() {
        System.out.println();
        for (Event e : events.getAll()) System.out.println(e);
    }

    private void add() {
        String name = InputValidator.readString("Event name: ");
        double price = InputValidator.readDouble("Price: ");
        events.add(name, price);
        System.out.println("Event added.");
    }

    private void remove() {
        list();
        int id = InputValidator.readInt("Event ID to remove: ");
        System.out.println(events.remove(id) ? "Removed." : "Event not found.");
    }

    private void createBooking() {
        System.out.println("\n-- Customers --");
        for (Customer c : customers.getAll()) System.out.println(c);
        int cid = InputValidator.readInt("Customer ID: ");
        System.out.println("\n-- Events --");
        for (Event e : events.getAll()) System.out.println(e);
        int eid = InputValidator.readInt("Event ID: ");
        Booking b = bookings.create(cid, eid, InputValidator.readDate("Date (yyyy-MM-dd): "));
        System.out.println("Booking #" + b.getId() + " created (PENDING).");
    }
}
