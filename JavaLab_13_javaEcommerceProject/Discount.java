package JavaLab_13_javaEcommerceProject;

import java.util.UUID;

// Amount Based Discount: discount id, name, threshold amount, discount amount, need to calculate
// final amount after discount
//Rate based discount: discount id, name, discount rate,
public abstract class Discount {

    UUID discountId;
    String name;
    private Double thresholdAmount;

    public Discount(UUID discountId, String name, Double thresholdAmount) {
        this.discountId = discountId;
        this.name = name;
        this.thresholdAmount = thresholdAmount;

    }

    public abstract Double calculateCartAmountAfterDiscountApplied(Double amount);

    public UUID getDiscountId() {
        return discountId;
    }

    public String getName() {
        return name;
    }

    public Double getThresholdAmount() {
        return thresholdAmount;
    }
}
