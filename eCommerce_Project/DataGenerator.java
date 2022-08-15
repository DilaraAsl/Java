package eCommerce_Project;

import eCommerce_Project.balance.Balance;
import eCommerce_Project.balance.CustomerBalance;
import eCommerce_Project.balance.GiftCardBalance;
import eCommerce_Project.category.Category;
import eCommerce_Project.category.Electronic;
import eCommerce_Project.category.Furniture;
import eCommerce_Project.category.SkinCare;
import eCommerce_Project.discount.AmountBasedDiscount;
import eCommerce_Project.discount.Discount;
import eCommerce_Project.discount.RateBasedDiscount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    // instantiates objects from the following classes: Address, Customer, Category, Product, CustomerBalance, GiftCardBalance, AmountBasedDiscount, RateBasedDiscount
    public static void createCustomer() {
        Address address1Customer1 = new Address("7925", "Jones Branch Dr", "Suite 3300", "22101", "VA");
        Address address2Customer1 = new Address("825", "GeorgeTown Pkwy", "Suite 5355", "22036", "VA");
        Address address1Customer2 = new Address("5924", "Lee Hwy", "House", "22044", "VA");

        // create a list for customer addresses
        List<Address> customer1AddressList = new ArrayList<>(Arrays.asList(address1Customer1, address2Customer1));
        Customer customer1 = new Customer(UUID.randomUUID(), "ozzy", "ozzy@cydeo.com", customer1AddressList);

        Customer customer2 = new Customer(UUID.randomUUID(), "mike", "mike@cydeo.com");

        StaticConstants.CUSTOMER_LIST.addAll(Arrays.asList(customer1, customer2));

    }

    public static void createCategory() {
        Category category1 = new Electronic(UUID.randomUUID(), "Electronic");
        Category category2 = new Furniture(UUID.randomUUID(), "Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(), "Skincare");

        StaticConstants.CATEGORY_LIST.addAll(Arrays.asList(category1, category2, category3));

    }

    public static void createProduct() {
        Product product1 = new Product(UUID.randomUUID(), "PSS", 230.72, 7, 7,
                StaticConstants.CATEGORY_LIST.get(0).getId());
        // get(0) -- 0 index is for electronics
        Product product2 = new Product(UUID.randomUUID(), "XBOX", 120.34, 15, 15,
                StaticConstants.CATEGORY_LIST.get(0).getId());

        Product product3 = new Product(UUID.randomUUID(), "Chair", 30.87, 30, 30, StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4 = new Product(UUID.randomUUID(), "Milk", 6.69, 50, 50, UUID.randomUUID());

        StaticConstants.PRODUCT_LIST.addAll(Arrays.asList(product1, product2, product3, product4));

    }

    public static void createBalance() {
        // set the balance for customers
        Balance customerBalance = new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(), 450.00);
        Balance giftCardBalance = new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(), 500.00);

        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);


    }

    public static void createDiscount() {

        Discount amountBasedDiscount = new AmountBasedDiscount(UUID.randomUUID(),
                "Buy 250 Free 50", 250.00, 50.00);
        Discount rateBasedDiscount = new RateBasedDiscount(UUID.randomUUID(), " Buy 500 for %15 off", 500.00, 15.0);
        StaticConstants.DISCOUNT_LIST.add(amountBasedDiscount);
        StaticConstants.DISCOUNT_LIST.add(rateBasedDiscount);


    }
}
