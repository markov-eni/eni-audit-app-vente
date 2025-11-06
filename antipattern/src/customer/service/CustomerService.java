import customer.model.Customer;
import customer.repository.CustomerRepository;

class CustomerService{

    private customerRepository CustomerRepository ; 

    public CustomerService(
      CustomerRepository customerRepository  
    ){
        this.customerRepository = customerRepository ; 
    }

    public Customer findCustomerById(String id){
        return customerRepository.find(id) ; 
    }

    public Customer[] findCustomers(){
        return customerRepository.findAll() ; 
    }

    public Customer createCustomer(String name, String email, String phone){
        Customer customer = new Customer(randomId(), name, email, phone);
        customerRepository.save(customer);

        return customer ; 
    }
}