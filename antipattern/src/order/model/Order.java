package order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**TODO:
 * 1. String[] → List<OrderItem>
 * 2. public → private + getter
 * 3. ArrayList auto expance
 */
public class Order {
    private final String id;
    private final String customerId;
    private final List<OrderItem> items; 
    private final Date createdAt;
    private boolean shipped;
    private String shippingNote;


    public Order(String customerId) {
        this.id = generateId();
        this.customerId = customerId;
        this.items = new ArrayList<>();
        this.createdAt = new Date();
        this.shipped = false;
        this.shippingNote = "";
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double computeSubtotal() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += getProductPrice(item.getProductId()) * item.getQuantity();
        }
        return sum;
    }

    // getters
    public String getId() { return id; }
    public String getCustomerId() { return customerId; }
    public List<OrderItem> getItems() { return items; }
    public Date getCreatedAt() { return createdAt; }
    public boolean isShipped() { return shipped; }
    public String getShippingNote() { return shippingNote; }

    public void setShipped(boolean shipped) { this.shipped = shipped; }
    public void setShippingNote(String note) { this.shippingNote = note; }

    // helper
    private String generateId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    // TODO: Need connection to ProductService
    private double getProductPrice(String productId) {
        // mock price
        return 100.0;
    }
}