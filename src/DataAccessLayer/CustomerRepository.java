package DataAccessLayer;

import Models.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IRepository<Customer> {
    private final List<Customer> items = new ArrayList<>();
    private int nextId = 1;

    
        return new ArrayList<>(items);
    }

    @Override
    public void update(Customer item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == item.getId()) { items.set(i, item); return; }
        }
    }

    @Override
    public boolean delete(int id) {
        return items.removeIf(i -> i.getId() == id);
    }
}
