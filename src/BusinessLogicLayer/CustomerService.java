package BusinessLogicLayer;

import DataAccessLayer.IRepository;
import Models.Customer;
import java.util.List;

public class CustomerService {
    private final IRepository<Customer> repo;

    public CustomerService(IRepository<Customer> repo) { this.repo = repo; }

    public Customer add(String name, String contact) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Customer name is required.");
        Customer c = new Customer(name.trim(), contact == null ? "" : contact.trim());
        repo.add(c);
        return c;
    }

    public List<Customer> getAll() { return repo.getAll(); }

    public boolean remove(int id) { return repo.delete(id); }
}
