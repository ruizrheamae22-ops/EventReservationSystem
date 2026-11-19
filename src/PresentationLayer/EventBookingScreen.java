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

   
}
