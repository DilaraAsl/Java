package eCommerce_Project.category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Electronic extends Category {


    public Electronic(UUID id, String name) {
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.plusDays(4);// delivery after 4 days

    }

    @Override
    public String generateCategoryCode() {
        return "EL-" + getId().toString().substring(0, 8); // Electronic items have unique Category Codes
    }
}
