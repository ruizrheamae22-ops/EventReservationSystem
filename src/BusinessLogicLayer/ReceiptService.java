package BusinessLogicLayer;

import DataAccessLayer.IRepository;
import Models.Booking;
import Models.Customer;
import Models.Event;
import Models.Receipt;

public class ReceiptService {
    private final IRepository<Booking> bookings;
    private final IRepository<Customer> customers;
    private final IRepository<Event> events;

     public ReceiptService(IRepository<Booking> bookings, IRepository<Customer> customers, IRepository<Event> events) {
        this.bookings = bookings;
        this.customers = customers;
        this.events = events;
    }

    public Receipt generate(int bookingId) {
        Booking b = bookings.getById(bookingId);
        if (b == null) throw new IllegalArgumentException("Booking not found.");
        if (!b.isReserved()) throw new IllegalArgumentException("Reserve the booking first before printing a receipt.");
        Customer c = customers.getById(b.getCustomerId());
        Event e = events.getById(b.getEventId());
        return new Receipt(b.getId(), c.getName(), e.getName(), b.getDate(), e.getPrice());
    }
}