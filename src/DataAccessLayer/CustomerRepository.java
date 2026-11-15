package DataAccessLayer;

import Models.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IRepository<Customer> {
    private final List<Customer> items = new ArrayList<>();
    private int nextId = 1;

    @Override
    public void add(Customer item) {
        item.setId(nextId++);
        items.add(item);
    }

    @Override
    public Customer getById(int id) {
        for (Customer i : items) if (i.getId() == id) return i;
        return null;
    }

    @Override
    public List<Customer> getAll() {
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
