import BusinessLogicLayer.*;
import DataAccessLayer.*;
import Models.*;
import PresentationLayer.*;

public class Program {
    public static void main(String[] args) {
        // Data Access
        IRepository<Event> eventRepo = new EventRepository();
        IRepository<Customer> customerRepo = new CustomerRepository();
        IRepository<Booking> bookingRepo = new BookingRepository();

        // Business Logic
        AuthService auth = new AuthService();
        EventService eventService = new EventService(eventRepo);
        CustomerService customerService = new CustomerService(customerRepo);
        BookingService bookingService = new BookingService(bookingRepo, customerRepo, eventRepo);
        ReceiptService receiptService = new ReceiptService(bookingRepo, customerRepo, eventRepo);

        // Sample data
        eventService.add("Wedding", 50000);
        eventService.add("Birthday Party", 15000);
        eventService.add("Corporate Event", 30000);

        // Presentation
        EventBookingScreen eventScreen = new EventBookingScreen(eventService, customerService, bookingService);
        CustomerScreen customerScreen = new CustomerScreen(customerService);
        BookingListScreen bookingScreen = new BookingListScreen(bookingService, receiptService);
        DashboardScreen dashboard = new DashboardScreen(eventScreen, customerScreen, bookingScreen);

        new LoginScreen(auth, dashboard).show();
    }
}
