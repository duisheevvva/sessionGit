package Dao;
import model.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> create(Customer customer);
    List<Customer> getAll();
    Customer getById(Long id);




}
