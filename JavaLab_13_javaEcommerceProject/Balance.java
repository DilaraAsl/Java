package JavaLab_13_javaEcommerceProject;

import java.util.UUID;

public abstract class Balance {
    UUID customerId;
    Double balance;

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Balance(UUID customerId, Double balance) {
        this.customerId = customerId;
        this.balance = balance;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public double addBalance(double amount) {
        return balance + amount;
    }

    public abstract Double increaseBalance(Double additionalBalance);

}
/*
Customer can have 2 kinds of balance in their account: CustomerBalance, GiftCardBalance

CustomerBalance: customerId, increase balance with additional amount
GiftCardBalance: customer
 */