package Models;

import java.time.LocalDate;

public class Booking {
    public static final String PENDING = "PENDING";
    public static final String RESERVED = "RESERVED";

    private int id;
    private final int customerId;
    private final int eventId;
    private final LocalDate date;
    private String status = PENDING;

    public Booking(int customerId, int eventId, LocalDate date) {
        this.customerId = customerId;
        this.eventId = eventId;
        this.date = date;
    }

    
}