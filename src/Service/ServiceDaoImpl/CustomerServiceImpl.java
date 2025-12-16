package Service.ServiceDaoImpl;

import Dao.CustomerDao;
import Dao.DaoImpl.CustomerDaoImpl;
import Service.CustomerService;
import model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private final CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public List<Customer> create(Customer customer) {
        return customerDao.create(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public Customer getById(Long id) {
       Customer customer = customerDao.getById(id);
       return null;
    }
}
