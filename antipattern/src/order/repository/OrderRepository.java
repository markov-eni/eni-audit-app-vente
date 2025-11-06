package order.repository;

import order.model.Order;
import java.util.List;

public interface OrderRepository {
    void save(Order order);
    Order findById(String id);
    List<Order> findAll();
}