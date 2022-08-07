package eCommerce_Project.order;

import eCommerce_Project.Cart;
import eCommerce_Project.StaticConstants;
import eCommerce_Project.checkout.CheckoutService;
import eCommerce_Project.checkout.CustomerBalanceCheckoutServiceImpl;
import eCommerce_Project.checkout.MixPaymentCheckoutServiceImpl;
import eCommerce_Project.discount.Discount;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    @Override
    public String placeOrder(Cart cart) {
        double amountAfterDiscount = cart.calculateCartTotalAmount();
        if (cart.getDiscountId() != null) {
            try {
                Discount discount = findDiscountById(cart.getDiscountId());
                amountAfterDiscount = discount.calculateCartAmountAfterDiscountApplied(amountAfterDiscount);
            } catch (Exception e) {
                System.out.println(e.getMessage());


            }
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which payment option would you like to choose,\n Type 1: Customer Balance \n Type 2: Mix (gift card+customer balance)");
        int paymentType = scanner.nextInt();
        boolean checkoutResult = false;

        switch (paymentType) {
            case 1:
                CheckoutService customerBalanceCheckoutService = new CustomerBalanceCheckoutServiceImpl();
                checkoutResult = customerBalanceCheckoutService.checkout(cart.getCustomer(), amountAfterDiscount);
                break;


            case 2:
                CheckoutService mixPaymentCheckOutService = new MixPaymentCheckoutServiceImpl();
                checkoutResult = mixPaymentCheckOutService.checkout(cart.getCustomer(), amountAfterDiscount);
                break;


        }
        if (checkoutResult) {
            Order order = new Order(UUID.randomUUID(), LocalDateTime.now(), cart.calculateCartTotalAmount() - amountAfterDiscount,
                    cart.getCustomer().getId(), " Placed " + cart.getProductMap().keySet());
            return "Order has been successfully placed!";
        }
       

        return "Balance is insufficient. Please add money to one of your balances and try again. ";
    }

    private Discount findDiscountById(UUID discountId) throws Exception {
        for (Discount discount : StaticConstants.DISCOUNT_LIST) {
            if (discount.getId().toString().equals(discountId.toString())) {
                return discount;
            }

        }
        throw new Exception(" Discount does not exist ");
    }
}
