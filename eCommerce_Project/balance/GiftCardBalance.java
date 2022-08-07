package eCommerce_Project.balance;

import java.util.UUID;

public class GiftCardBalance extends Balance {
    public GiftCardBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        double promotionAmount = additionalBalance * 10 / 100; // 10 percent promotion amount added to the gift card with the additional balance
        setBalance(getBalance() + additionalBalance + promotionAmount);
        return getBalance();
    }
}
