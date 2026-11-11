package BusinessLogicLayer;

import DataAccessLayer.IRepository;
import Models.Event;
import java.util.List;

public class EventService {
    private final IRepository<Event> repo;

    public EventService(IRepository<Event> repo) { this.repo = repo; }

    }
}
