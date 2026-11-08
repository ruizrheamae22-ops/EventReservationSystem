package Models;

public class Customer extends Person {
    public Customer(String name, String contact) {
        super(name, contact);
    }

    @Override
    public String toString() {
        return String.format("[%d] %-20s %s", getId(), getName(), getContact());
    }
    
}