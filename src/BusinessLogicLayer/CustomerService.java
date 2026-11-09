package BusinessLogicLayer;

import DataAccessLayer.IRepository;
import Models.Customer;
import java.util.List;

public class CustomerService {
    private final IRepository<Customer> repo;

    public CustomerService(IRepository<Customer> repo) { this.repo = repo; }

}
