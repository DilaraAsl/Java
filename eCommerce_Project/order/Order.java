package eCommerce_Project.order;

import eCommerce_Project.Product;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class Order {
    private UUID id;
    private LocalDateTime orderDate;
    private Double cartTotalAmount;
    private Double paidAmount;
    private Double discountAmount;
    private UUID customerId;
    private String orderStatus;
    private Set<Product> productList;

    public Order(UUID id, LocalDateTime orderDate, Double cartTotalAmount,
                 UUID customerId, String orderStatus) {
        setId(id);
        setOrderDate(orderDate);
        setCartTotalAmount(cartTotalAmount);
        setPaidAmount(paidAmount);
        setDiscountAmount(discountAmount);
        setCustomerId(customerId);
        setOrderStatus(orderStatus);
        setProductList(productList);
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Double getCartTotalAmount() {
        return cartTotalAmount;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Set<Product> getProductList() {
        return productList;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setCartTotalAmount(Double cartTotalAmount) {
        this.cartTotalAmount = cartTotalAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }
}
