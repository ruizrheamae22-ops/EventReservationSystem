package DataAccessLayer;

import Models.Event;
import java.util.ArrayList;
import java.util.List;

public class EventRepository implements IRepository<Event> {
    private final List<Event> items = new ArrayList<>();
    private int nextId = 1;

    @Override
    public void add(Event item) {
        item.setId(nextId++);
        items.add(item);
    }

    @Override
    public Event getById(int id) {
        for (Event i : items) if (i.getId() == id) return i;
        return null;
    }

    @Override
    public List<Event> getAll() {
        return new ArrayList<>(items);
    }

   
}
