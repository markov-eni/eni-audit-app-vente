package order.model;

public class OrderItem {
    private final String productId;
    private final int quantity;
    public OrderItem(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    // getters
    public String getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
}
