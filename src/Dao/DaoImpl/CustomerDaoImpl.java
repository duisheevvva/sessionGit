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
}
