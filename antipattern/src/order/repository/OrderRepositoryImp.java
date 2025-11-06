package order.repository;

import order.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrderRepositoryImp implements OrderRepository {
    private final Map<String, Order> orders;

    public OrderRepositoryImp() {
        this.orders = new HashMap<>();
    }

    @Override
    public void save(Order order) {
        orders.put(order.getId(), order);
    }

    @Override
    public Order findById(String id) {
        return orders.get(id);
    }

    @Override
    public List<Order> findAll() {
        return new ArrayList<>(orders.values());
    }
}   
