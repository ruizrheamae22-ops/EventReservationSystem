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

}
