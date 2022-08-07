package JavaLab_13_javaEcommerceProject;

import JavaLab_13_javaEcommerceProject.Category.Category;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Main {


    public static void main(String[] args) throws Exception {


        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();
        DataGenerator.createBalance();
        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select customer: ");

        for (int i = 0; i < StaticConstants.DISCOUNT_LIST.size(); i++) {
            System.out.println("Type " + i + " for customer:" + StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }

        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());
        Cart cart = new Cart(customer); // empty cart created
        while (true) {
            System.out.println("What would you like to do? Type id for selection");
            for (int i = 0; i < prepareMenuOption().length; i++) {
                System.out.println(i + "-" + prepareMenuOption()[i]);//??

            }
            int menuSelection = scanner.nextInt();
            switch (menuSelection) {
                case 0:// list categories
                    for (Category category : StaticConstants.CATEGORY_LIST) {
                        System.out.println("Category Code:" + category.generateCategoryCode() + " category name" + category.getName());
                    }
                    break;
                case 1: // list products -- product category name ()
                    try {
                        for (Product product : StaticConstants.PRODUCT_LIST) {
                            System.out.println("Product name" + product.getProductName() + " Product Category name " +
                                    product.getCategoryName());


                        }
                    } catch (Exception e) {
                        System.out.println("Product cannot be printed because category is not found for product name:" + e.getMessage().split(",")[1]);
                    }

                    break;
                case 2: // list discounts
                    for (Discount discount : StaticConstants.DISCOUNT_LIST) {
                        System.out.println("Discount Name: " + discount.getName() + " discount threshold amount " + discount.getThresholdAmount());
                    }
                    break;
                case 3: // see balance - only one of them assign the other balance 0
                    // if only ozzy has customer balance show the gift card balance as 0
                    // show both balance
                    CustomerBalance cBalance = findCustomerBalance(customer.getId());
                    GiftCardBalance gBalance = findGiftCardBalance(customer.getId());
                    double totalBalance = cBalance.getBalance() + gBalance.getBalance();
                    System.out.println("Final balance " + totalBalance);
                    System.out.println("Customer balance " + cBalance.getBalance());
                    System.out.println("Gift Card balance " + gBalance.getBalance());
                    break;
                case 4: // add balance

                    CustomerBalance customerBalance = findCustomerBalance(customer.getId());// we need these objects to add money to database
                    GiftCardBalance giftCardBalance = findGiftCardBalance(customer.getId());

                    System.out.println(" Which balance would you like to add: ");
                    System.out.println("Type 1 for customer balance" + customerBalance.getBalance());// show the customer balance
                    System.out.println("Type 2 for Gift Card balance" + giftCardBalance.getBalance());
                    int balanceAccountSelection = scanner.nextInt();
                    System.out.println("how much would you like to add? ");
                    double additionalAmount = scanner.nextDouble();
                    switch (balanceAccountSelection) {
                        case 1:
                            customerBalance.increaseBalance(additionalAmount);

                            System.out.println(" Customer Balance" + customerBalance.getBalance());
                            break;
                        case 2:
                            giftCardBalance.increaseBalance(additionalAmount);

                            System.out.println(" Gift card Balance" + giftCardBalance.getBalance());
                            break;
                    }

                    break;

                case 5:
                    // place an order choose a product
                    Map<Product, Integer> map = new HashMap<>();
                    cart.setProductMap(map);
                    while (true) { //  keep adding products until checkout
                        System.out.println("Pick your product, to exit type:  exit");
                        for (Product product : StaticConstants.PRODUCT_LIST) {
                            try {
                                System.out.println(" id: " + product.getId() + " price " + product.getProductPrice() + " product category " + product.getCategoryName() + " stock " + product.getRemainingStock() +
                                        product.getDeliveryDueDate());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String productId = scanner.next();

                        try {
                            Product product = findProductById(productId);
                            if (!putItemInTheCartIfInStock(cart, product)) { // if the method returns false
                                // if there is not enough stock
                                System.out.println("Stock is insufficient. Please try again.");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Product does not exist. Please try again. ");
                            continue; // back to loop
                        }
                        System.out.println(" Do you want to add more products. Y for continue, N for exit");
                        String decision = scanner.next();
                        if (!decision.equals("Y")) {
                            break;
                        }

                    }


                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }

        }
    }

    public static boolean putItemInTheCartIfInStock(Cart cart, Product product) {
        System.out.println("Please provide product count");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Integer cartCount = cart.getProductMap().get(product);// get the quantity of the product in the cart

        if (cartCount != null && product.getRemainingStock() > cartCount + count) { // check if the cart already contains the item in the cart
            cart.getProductMap().put(product, cartCount + count);
            return true;

        } else if (product.getRemainingStock() >= count) {
            cart.getProductMap().put(product, count);
            return false;

        }
        return false;
    }

    private static CustomerBalance findCustomerBalance(UUID customerId) {
        for (Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST) {
            if (customerBalance.getCustomerId().toString().equals(customerId.toString())) {
                return (CustomerBalance) customerBalance; // return type is CustomerBalance  but customerBalance is Balance type
                // balance is general we need to cast it make it specific
            }
        }
        CustomerBalance customerBalance = new CustomerBalance(customerId, 0.0);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance); // add the customer balance into the database
        return customerBalance;
    }

    private static GiftCardBalance findGiftCardBalance(UUID customerId) {
        for (Balance giftCardBalance : StaticConstants.GIFT_CARD_BALANCE_LIST) {
            if (giftCardBalance.getCustomerId().toString().equals(customerId.toString())) {
                return (GiftCardBalance) giftCardBalance;
            }
        }
        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId, 0.0); // if the customer has no giftcard balance create one and initialize the balance to 0
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);
        return giftCardBalance;
    }

    private static String[] prepareMenuOption() {
        return new String[]{
                "List Categories", "List Products", " List Discount", "See Balance", "Add Balance",
                "Place an order", " See Cart", "See order details", "See you address", "Close App"
        };
    }               // only accessible in the main class

    private static Product findProductById(String productId) throws Exception {
        for (Product product : StaticConstants.PRODUCT_LIST) {
            if (product.getId().toString().equals(productId)) {
                return product;
            }

        }
        throw new Exception("Product not found");
    }
}

