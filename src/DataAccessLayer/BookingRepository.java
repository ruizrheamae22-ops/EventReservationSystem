package DataAccessLayer;

import Models.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IRepository<Booking> {
    private final List<Booking> items = new ArrayList<>();
    private int nextId = 1;

    @Override
    public void add(Booking item) {
        item.setId(nextId++);
        items.add(item);
    }

    @Override
    public Booking getById(int id) {
        for (Booking i : items) if (i.getId() == id) return i;
        return null;
    }

    @Override
    public List<Booking> getAll() {
        return new ArrayList<>(items);
    }

    
}
