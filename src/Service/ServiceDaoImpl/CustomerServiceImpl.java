package Service.ServiceDaoImpl;

import Dao.CustomerDao;
import Dao.DaoImpl.CustomerDaoImpl;
import Service.CustomerService;
import model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public List<Customer> create(Customer customer) {
        return customerDao.create(customer);
    }
}
