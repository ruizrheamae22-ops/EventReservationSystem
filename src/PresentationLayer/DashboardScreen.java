package PresentationLayer;

import Utilities.ConsoleHelper;
import Utilities.InputValidator;

public class DashboardScreen extends BaseScreen {
    private final EventBookingScreen eventBooking;
    private final CustomerScreen customer;
    private final BookingListScreen bookingList;

    public DashboardScreen(EventBookingScreen eventBooking, CustomerScreen customer, BookingListScreen bookingList) {
        this.eventBooking = eventBooking;
        this.customer = customer;
        this.bookingList = bookingList;
    }

    @Override
    public void show() {
        while (true) {
            ConsoleHelper.header("ADMIN DASHBOARD");
            System.out.println("[1] Manage Event Booking");
            System.out.println("[2] Manage Customer");
            System.out.println("[3] List of Booking");
            System.out.println("[0] Logout");
            switch (InputValidator.readInt("\nChoose: ")) {
                case 1: eventBooking.show(); break;
                case 2: customer.show(); break;
                case 3: bookingList.show(); break;
                case 0: return;
                default: System.out.println("Invalid choice."); ConsoleHelper.pause();
            }
        }
    }
}
