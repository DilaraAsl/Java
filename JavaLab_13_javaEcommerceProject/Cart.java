package JavaLab_13_javaEcommerceProject;

import java.util.Map;
import java.util.UUID;

public class Cart {
    private Customer customer; // each cart belongs to a customer
    private UUID discountId;
    private Map<Product, Integer> productMap;// product and quantity

    public Cart(Customer customer) { // empty cart
        this.customer = customer;
    }

    public Cart(Customer customer, UUID discountId, Map<Product, Integer> productMap) { // when we are building the cart
        this.customer = customer;
        this.discountId = discountId;
        this.productMap = productMap;
    }

    public Double calculateCartTotalAmount() {
        double totalAmount = 0;
        for (Product product : productMap.keySet()) {
            totalAmount += product.getProductPrice() * productMap.get(product);
        }
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UUID getDiscountId() {
        return discountId;
    }

    public void setDiscountId(UUID discountId) {
        this.discountId = discountId;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }
}
