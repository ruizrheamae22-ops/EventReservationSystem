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
