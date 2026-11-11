package BusinessLogicLayer;

import DataAccessLayer.IRepository;
import Models.Event;
import java.util.List;

public class EventService {
    private final IRepository<Event> repo;

    public EventService(IRepository<Event> repo) { this.repo = repo; }

    public Event add(String name, double price) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Event name is required.");
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        Event e = new Event(name.trim(), price);
        repo.add(e);
        return e;
    }

    public List<Event> getAll() { return repo.getAll(); }

    public boolean remove(int id) { return repo.delete(id); }
}
