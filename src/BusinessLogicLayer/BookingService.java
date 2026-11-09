package BusinessLogicLayer;

import DataAccessLayer.IRepository;
import Models.Booking;
import Models.Customer;
import Models.Event;
import java.time.LocalDate;
import java.util.List;

public class BookingService {
    private final IRepository<Booking> bookings;
    private final IRepository<Customer> customers;
    private final IRepository<Event> events;

    public BookingService(IRepository<Booking> bookings, IRepository<Customer> customers, IRepository<Event> events) {
        this.bookings = bookings;
        this.customers = customers;
        this.events = events;
    }
    public Booking create(int customerId, int eventId, LocalDate date) {
        if (customers.getById(customerId) == null) throw new IllegalArgumentException("Customer not found.");
        if (events.getById(eventId) == null) throw new IllegalArgumentException("Event not found.");
        if (date.isBefore(LocalDate.now())) throw new IllegalArgumentException("Date cannot be in the past.");
        Booking b = new Booking(customerId, eventId, date);
        bookings.add(b);
        return b;
    }

   
    
}
