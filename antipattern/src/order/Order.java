package order;

import java.sql.Date;

public class Order {
    public String id;
    public String customerId;
    public String[] productIds; 
    public int[] quantities;
    public int capacity = 4; // capacité initiale
    public Date createdAt;
    public boolean shipped = false;
    public String shippingNote = "";

    public Order(String id, String customerId) {
        this.id = id;
        this.customerId = customerId;
        this.productIds = new String[capacity];
        this.quantities = new int[capacity];
        this.createdAt = new Date(capacity);
    }
}   
