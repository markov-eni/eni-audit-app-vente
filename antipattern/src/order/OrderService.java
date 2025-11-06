package order;

import java.util.List;


public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order findByid(int id) {
        return orderRepository.findById(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    
    public void createOrder(Order order){
        orderRepository.createOrder(order);
    }
}
