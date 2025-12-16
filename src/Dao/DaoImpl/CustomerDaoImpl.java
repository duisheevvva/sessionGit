package Dao.DaoImpl;


import Dao.CustomerDao;
import databace.Db;
import model.Customer;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public List<Customer> create(Customer customer) {
        Db.customers.add(customer);
        return Db.customers;
    }

    @Override
    public List<Customer> getAll() {
        for (Customer customer : Db.customers){
            return Db.customers;
        }
        return null;
    }

    @Override
    public Customer getById(Long id) {
        for (Customer customer : Db.customers){
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }
}
