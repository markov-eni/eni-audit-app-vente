package customer.repository;
import java.util.ArrayList;
import java.util.List;

import customer.model.Customer; 

class CustomerRepositoryImpl implements CustomerRepository{
    
    private List<Customer> customers = new ArrayList<Customer>() ; 

    public CustomerRepositoryImpl(){
        customers.add(new Customer("29", "Alice", "alice@ex.com", "+33123456789"));
		customers.add(new Customer("30", "Bob", "bob@ex.com", "+33699887766"));
    }

    @Override
    public Customer[] findAll(){
        return customers.toArray(new Customer[0]) ; 
    } 

    @Override
    public Customer findById(String id){

        for (Customer customer : customers) {
            if(customer.id.equals(id)){
                return customer ;  
                 
            }
        }
        throw new Error("Customer with id not found") ;         
    }

    public Customer save(Customer customer){
        
        customers.add(customer) ; 
        
        return customer ; 
    }

}