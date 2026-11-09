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
    
    @Override
    public String toString() {
        return "==================================\n"
             + "        KISSBONE COVE\n"
             + "   Event Reservation Receipt\n"
             + "==================================\n"
             + String.format("Receipt No : %05d%n", bookingId)
             + "Customer   : " + customerName + "\n"
             + "Event      : " + eventName + "\n"
             + "Date       : " + date + "\n"
             + String.format("Amount     : PHP %,.2f%n", amount)
             + "==================================\n"
             + "      Thank you for booking!";
    }

    
}