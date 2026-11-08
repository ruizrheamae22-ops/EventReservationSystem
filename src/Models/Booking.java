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
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCustomerId() { return customerId; }
    public int getEventId() { return eventId; }
    public LocalDate getDate() { return date; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public boolean isReserved() { return RESERVED.equals(status); }

    
}