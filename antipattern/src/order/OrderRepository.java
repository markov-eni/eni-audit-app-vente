package order;

import java.util.List;

public interface OrderRepository {
    public Order findById(int id);
    public List<Order> findAll();
    public void createOrder(Order order);
}
