package eCommerce_Project.checkout;

import eCommerce_Project.Customer;

public interface CheckoutService {
    boolean checkout(Customer customer, Double totalAmount);
}
