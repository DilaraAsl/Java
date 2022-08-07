package eCommerce_Project.order;

import eCommerce_Project.Cart;

public interface OrderService {
    String placeOrder(Cart cart);
}
