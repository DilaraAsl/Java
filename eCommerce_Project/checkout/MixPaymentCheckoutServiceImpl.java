package eCommerce_Project.checkout;

import eCommerce_Project.Customer;
import eCommerce_Project.StaticConstants;
import eCommerce_Project.balance.Balance;
import eCommerce_Project.balance.CustomerBalance;
import eCommerce_Project.balance.GiftCardBalance;

import java.util.UUID;

public class MixPaymentCheckoutServiceImpl implements CheckoutService {


    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        try {
            GiftCardBalance giftCardBalance = findGiftCardBalance(customer.getId());
            final double giftBalance = giftCardBalance.getBalance() - totalAmount;
            if (giftBalance > 0) {
                giftCardBalance.setBalance(giftBalance);
            } else { // if the amount in the gift card balance is not enough check the customer balance  see if the mix balance payment is enough
                CustomerBalance customerBalance = findCustomerBalance(customer.getId());
                final double mixBalance = giftCardBalance.getBalance() + customerBalance.getBalance() - totalAmount; // if the result is positive payment is enough return true else return false
                if (mixBalance > 0) {
                    giftCardBalance.setBalance(0d);// set the gift card balance to 0
                    customerBalance.setBalance(mixBalance); // set the remaining amount as the new customer balance
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return false; // the total amount exceeds the mixed balance
    }


    private static GiftCardBalance findGiftCardBalance(UUID customerId) {

        for (Balance giftCardBalance : StaticConstants.GIFT_CARD_BALANCE_LIST) {
            if (giftCardBalance.getCustomerId().toString().equals((customerId).toString())) {
                return (GiftCardBalance) giftCardBalance; //
            }
        }
        // if the customer does not have a gift card balance then set the gift card balance to 0.0
        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId, 0d); // initialize it to 0.0
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance); // add the new object to the gift card balance list
        return giftCardBalance;
    }

    private static CustomerBalance findCustomerBalance(UUID customerId) {
        // check for the customer account
        for (Balance balance : StaticConstants.CUSTOMER_BALANCE_LIST) {
            if (balance.getCustomerId().toString().equals(customerId.toString())) {
                return (CustomerBalance) balance;
            }
        }
        // if the customer does not have an account, create an account for the customer with default value
        CustomerBalance customerBalance = new CustomerBalance(customerId, 0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance); // add the new object to the customer balance list
        return customerBalance;
    }

}
