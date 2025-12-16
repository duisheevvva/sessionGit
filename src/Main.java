import Service.CustomerService;
import Service.ServiceDaoImpl.CustomerServiceImpl;
import model.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
CustomerService customerService = new CustomerServiceImpl();



//        Muhammad  -  create package model,
//        Samagan   -  create dao,service,db,generateId packages and createCustomer method
//        Elmirbek  -  getAllCustomer, getById  methods
//        Nursultan -  update,delete methods
//        Aidana    -  sortByDateOfBirth method
//        Adina     -  filterByGender



        System.out.println("Create Customer: ");
        customerService.create(new Customer());
        System.out.println("Get All: ");
        customerService.getAll();
        System.out.println("Get By Id : ");
        customerService.getById(1L);
        System.out.println("Update : ");
        System.out.println("Delete : ");
        System.out.println("sortByDateOfBirth : ");
        System.out.println("filterByGender : ");
        System.out.printf("tyfy");
    }
}