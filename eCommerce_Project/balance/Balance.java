package eCommerce_Project.balance;

import java.util.UUID;

public abstract class Balance {
    // Balance is the abstract super class
    // A customer may have both an account balance and a gift card balance
    private UUID customerId;
    private Double balance;

    public Balance(UUID customerId, Double balance) {
        this.customerId = customerId;
        setBalance(balance);
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public abstract Double addBalance(Double additionalBalance);
}
