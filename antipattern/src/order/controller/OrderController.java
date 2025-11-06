package order.controller;

import order.model.Order;
import order.model.OrderItem;
import order.service.OrderService;


public class OrderController {
    
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //uni responsability - show
    public void printOrderDetails(String orderId) {
        Order order = orderService.getOrderById(orderId);
        
        if (order == null) {
            System.out.println("Commande introuvable.");
            return;
        }

        // calc
        double subtotal = order.computeSubtotal();
        double discount = orderService.calculateDiscount(order);
        double tax = orderService.calculateTax(subtotal);
        double total = orderService.calculateTotal(order);

        // show
        System.out.println("\n--- Détails commande " + order.getId() + " ---");
        System.out.println("Client: " + order.getCustomerId());
        
        for (OrderItem item : order.getItems()) {
            System.out.println("- Item: " + item.getProductId() + 
                             " x" + item.getQuantity());
        }
        
        System.out.printf("Sous-total: %.2f €\n", subtotal);
        System.out.printf("Remise: %.2f €\n", discount);
        System.out.printf("TVA: %.2f €\n", tax);
        System.out.printf("Total: %.2f €\n", total);
        System.out.println("Expédiée: " + (order.isShipped() ? "oui" : "non"));
    }
}