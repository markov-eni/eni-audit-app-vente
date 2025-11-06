package order.service;

import order.model.Order;
import order.model.OrderItem;
import order.repository.OrderRepository;

public class OrderService {
    
    // hard coded num -> const
    private static final double TAX_RATE = 0.20;  // 20% TVA
    private static final double DISCOUNT_THRESHOLD_HIGH = 500.0;
    private static final double DISCOUNT_THRESHOLD_MID = 200.0;
    private static final double DISCOUNT_RATE_HIGH = 0.10;  // 10%
    private static final double DISCOUNT_AMOUNT_MID = 15.0;  // 15€
    
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    //create new order
    public Order createOrder(String customerId) {
        Order order = new Order(customerId);
        orderRepository.save(order);
        return order;
    }

    //add item to order
    public void addItemToOrder(String orderId, OrderItem item) {
        Order order = orderRepository.findById(orderId);
        if (order != null) {
            order.addItem(item);
            orderRepository.save(order);
        }
    }

    //centered discount calc
    public double calculateDiscount(Order order) {
        double subtotal = order.computeSubtotal();
        
        // 10%
        if (subtotal >= DISCOUNT_THRESHOLD_HIGH) {
            return subtotal * DISCOUNT_RATE_HIGH;
        }
        
        // 15e
        if (subtotal >= DISCOUNT_THRESHOLD_MID) {
            return DISCOUNT_AMOUNT_MID;
        }
        
        return 0.0;
    }

    //tax
    public double calculateTax(double amount) {
        return amount * TAX_RATE;
    }

    public double calculateTotal(Order order) {
        double subtotal = order.computeSubtotal();
        double discount = calculateDiscount(order);
        double tax = calculateTax(subtotal);
        return subtotal - discount + tax;
    }

    //get order
    public Order getOrderById(String orderId) {
        return orderRepository.findById(orderId);
    }
}