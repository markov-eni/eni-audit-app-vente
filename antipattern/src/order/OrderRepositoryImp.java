package order;

import java.util.ArrayList;
import java.util.List;


public class OrderRepositoryImp implements OrderRepository {
    public List<Order> orders = new ArrayList<>();

    public Order findById(int id) {
        return orders.get(id);
    }

    public List<Order> findAll() {
        return orders;
    }
    public void createOrder(Order order) {
        orders.add(order);
    };
}   
