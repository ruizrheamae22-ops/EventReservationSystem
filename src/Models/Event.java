package Models;

public class Event {
    private int id;
    private String name;
    private double price;

    public Event(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("[%d] %-22s PHP %,.2f", id, name, price);
    }
    
}