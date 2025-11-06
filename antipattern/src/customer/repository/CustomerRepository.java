package customer.repository;
import customer.model.Customer; 

public interface CustomerRepository {

    public Customer[] findAll() ; 
    public Customer findById(String id) ; 
    public Customer save(Customer customer) ;

}