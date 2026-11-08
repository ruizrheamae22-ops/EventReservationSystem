package Models;

import java.time.LocalDate;

public class Receipt {
    private final int bookingId;
    private final String customerName;
    private final String eventName;
    private final LocalDate date;
    private final double amount;

    public Receipt(int bookingId, String customerName, String eventName, LocalDate date, double amount) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.eventName = eventName;
        this.date = date;
        this.amount = amount;
    }
    
    
}