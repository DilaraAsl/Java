package JavaLab_13_javaEcommerceProject;

import JavaLab_13_javaEcommerceProject.Category.Category;
import JavaLab_13_javaEcommerceProject.Category.Electronics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer() {
        Address address1Customer1 = new Address("7925", "Jones Branch Dr", "suite 3300", "22182", "VA");


        Address address2Customer1 = new Address("825", "GeorgeTown Pky", "Suite 5355", "22036", "VA");
        Address address1Customer2 = new Address("5924", "Lee Hwy", "House", "22044", "VA");

        List<Address> customer1AddressList = new ArrayList<>(Arrays.asList(address1Customer1, address2Customer1));

        Customer customer1 = new Customer(UUID.randomUUID(), "ozzy", "ozzy@cydeo.com", customer1AddressList);
        Customer customer2 = new Customer(UUID.randomUUID(), "mike", "mike@cydeo.com");
        StaticConstants.CUSTOMER_LIST.addAll(Arrays.asList(customer1, customer2));


    }

    public static void createCategory() {
        Category category1 = new Electronics(UUID.randomUUID(), "Electronic");
        Category category2 = new Electronics(UUID.randomUUID(), "Furniture");
        Category category3 = new Electronics(UUID.randomUUID(), "Skincare");
        StaticConstants.CATEGORY_LIST.addAll(Arrays.asList(category1, category2, category3));
    }

    public static void createProduct() {
        Product product1 = new Product(UUID.randomUUID(), "PS5", 230.72, 7, 7, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 = new Product(UUID.randomUUID(), "XBOX", 120.34, 15, 15, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3 = new Product(UUID.randomUUID(), "Chair", 30.85, 85, 85, StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4 = new Product(UUID.randomUUID(), "Milk", 30.85, 85, 85, UUID.randomUUID());
        StaticConstants.PRODUCT_LIST.addAll(Arrays.asList(product1, product2, product3, product4));

    }

    public static void createBalance() {

        Balance customerBalance = new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(), 450.00);
        Balance giftCardBalance = new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(), 50.00);// we have already created the customer
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

    }

    public static void createDiscount() {
        Discount amountBasedDiscount = new AmountBasedDiscount(UUID.randomUUID(), "Buy 250 get 50", 250.00, 50.00);
        Discount rateBasedDiscount = new RateBasedDiscount(UUID.randomUUID(), " buy 500 free 15%", 500.00, 15.00);
        StaticConstants.DISCOUNT_LIST.addAll(Arrays.asList(amountBasedDiscount, rateBasedDiscount));
    }
}
