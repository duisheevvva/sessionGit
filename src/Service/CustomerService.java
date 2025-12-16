package Service;

import model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> create(Customer customer);
    List<Customer> getAll();
    Customer getById(Long id);

}
