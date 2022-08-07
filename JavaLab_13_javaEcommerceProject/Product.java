package JavaLab_13_javaEcommerceProject;

import JavaLab_13_javaEcommerceProject.Category.Category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private String productName;
    private Double productPrice;
    private Integer stock;
    private Integer remainingStock;
    private UUID categoryId;// should come from the product category id????

    public Product(UUID id, String productName, Double productPrice, Integer stock, Integer remainingStock, UUID categoryId) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stock = stock;
        this.remainingStock = remainingStock;
        this.categoryId = categoryId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemainingStock() {
        return remainingStock;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() throws Exception {
        //  getCategoryId() go to database and check all category ids and find the matching one and return it
        for (Category category : StaticConstants.CATEGORY_LIST) {
            if (getCategoryId().toString().equals(category.getId().toString())) return category.getName(); //
        }
        throw new Exception("Category not found," + getProductName()); // category does not exist
    }

    public LocalDateTime getDeliveryDueDate() throws Exception {
        for (Category category : StaticConstants.CATEGORY_LIST) {
            if (getCategoryId().toString().equals(category.getId().toString())) {
                return category.calculateDeliveryTime();
            }

        }
        throw new Exception("Category does not exist");
    }
}

