package eCommerce_Project.checkout;

import eCommerce_Project.Customer;

public interface Checkout {
    boolean checkout(Customer customer, Double totalAmount);

}
