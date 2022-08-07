package eCommerce_Project.checkout;

import eCommerce_Project.Customer;
import eCommerce_Project.StaticConstants;
import eCommerce_Project.balance.Balance;
import eCommerce_Project.balance.CustomerBalance;

import java.util.UUID;

public class CustomerBalanceCheckoutServiceImpl implements CheckoutService {
    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        CustomerBalance customerBalance = findCustomerBalance(customer.getId()); //Checkout classes findCustomerBalance
        double finalBalance = customerBalance.getBalance() - totalAmount;
        if (finalBalance > 0) {
            customerBalance.setBalance(finalBalance);
            return true;
        }
        return false; // if the finalBalance is negative return 0
    }

    public static CustomerBalance findCustomerBalance(UUID customerId) {

        for (Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST) {  // Balance abstract class we use polymorphism because a customer may have both account balance and gift card balance
            // if the customerId is in the CUSTOMER_BALANCE_LIST return the customerBalance
            if (customerBalance.getCustomerId().toString().equals(customerId.toString()))
                return (CustomerBalance) customerBalance; // downcast Balance to CustomerBalance
        }
        // if the customerId is not in the list then add the customer to the CUSTOMER_BALANCE_LIST with default - 0.0 balance
        CustomerBalance customerBalance = new CustomerBalance(customerId, 0d); // Od double balance initialized to 0.0
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        return customerBalance;
    }
}
