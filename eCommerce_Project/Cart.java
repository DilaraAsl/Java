package eCommerce_Project;

import java.util.Map;
import java.util.UUID;

public class Cart {
    private Customer customer;
    private UUID discountId;
    private Map<Product, Integer> productMap; // constructor accepts a product map

    public Cart(Customer customer) { // we need this constructor when the cart is empty
        this.customer = customer;
    }

    public Cart(Customer customer, UUID discountId, Map<Product, Integer> productMap) { // we need this constructor when the customer adds items to the cart
        setCustomer(customer);
        setDiscountId(discountId);
        setProductMap(productMap);
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

    public Double calculateCartTotalAmount() {
        double totalAmount = 0;
        for (Product product : productMap.keySet()) {
            totalAmount += product.getPrice() * productMap.get(product); // productMap.get(product)  will get us the no of products in the cart
        }
        return totalAmount;
    }

}
