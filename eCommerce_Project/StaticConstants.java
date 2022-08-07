package eCommerce_Project;

import JavaLab_13_javaEcommerceProject.Category.Category;
import eCommerce_Project.balance.Balance;
import eCommerce_Project.discount.Discount;

import java.util.ArrayList;

public class StaticConstants {
    public static final ArrayList<Customer> CUSTOMER_LIST = new ArrayList<>();
    public static final ArrayList<Category> CATEGORY_LIST = new ArrayList<>();
    public static final ArrayList<Balance> CUSTOMER_BALANCE_LIST = new ArrayList<>();

    public static final ArrayList<Balance> GIFT_CARD_BALANCE_LIST = new ArrayList<>();// customer can have a balance and a gift card type must be balanc
    public static final ArrayList<Discount> DISCOUNT_LIST = new ArrayList<>(); // Discount can be amount based or rate based

}
