package JavaLab_13_javaEcommerceProject;

import java.util.UUID;

public class AmountBasedDiscount extends Discount {
    private Double discountAmount;

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public AmountBasedDiscount(UUID discountId, String name, Double thresholdAmount, Double discountAmount) {
        super(discountId, name, thresholdAmount);
        this.discountAmount = discountAmount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }
}
