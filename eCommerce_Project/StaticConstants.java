package eCommerce_Project;

import eCommerce_Project.balance.Balance;
import eCommerce_Project.category.Category;
import eCommerce_Project.discount.Discount;
import eCommerce_Project.order.Order;

import java.util.ArrayList;
import java.util.List;

public class StaticConstants {
    public static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    public static final List<Category> CATEGORY_LIST = new ArrayList<eCommerce_Project.category.Category>();
    public static final List<Product> PRODUCT_LIST = new ArrayList<>();
    public static final List<Balance> CUSTOMER_BALANCE_LIST = new ArrayList<>();

    public static final List<Balance> GIFT_CARD_BALANCE_LIST = new ArrayList<>();// customer can have a balance and a gift card type must be balanc
    public static final List<Discount> DISCOUNT_LIST = new ArrayList<>(); // Discount can be amount based or rate based
    public static final List<Order> ORDER_LIST = new ArrayList<>();
}
