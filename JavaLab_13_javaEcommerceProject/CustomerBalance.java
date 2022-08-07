package JavaLab_13_javaEcommerceProject;

import java.util.UUID;

public class CustomerBalance extends Balance {
    public CustomerBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double increaseBalance(Double additionalBalance) {
        setBalance(getBalance() + additionalBalance);
        return getBalance();
    }


}
