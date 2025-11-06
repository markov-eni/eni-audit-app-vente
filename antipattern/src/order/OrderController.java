package order;

import java.util.List;

public class OrderController {
    private OrderService orderService = new OrderService(new OrderRepositoryImp());

    public Order findOrder(int id) {
        return orderService.findByid(id);            
    };

    public List<Order> findAllOrders() {
        return orderService.findAll();
    }

    public void createOrder(Order order) {
        orderService.createOrder(order);
    }
}
