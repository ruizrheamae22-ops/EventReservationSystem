package DataAccessLayer;

import Models.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IRepository<Booking> {
    private final List<Booking> items = new ArrayList<>();
    private int nextId = 1;

    public List<Booking> getAll() {
        return new ArrayList<>(items);
    }

    @Override
    public void update(Booking item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == item.getId()) { items.set(i, item); return; }
        }
    }

    @Override
    public boolean delete(int id) {
        return items.removeIf(i -> i.getId() == id);
    }
}
