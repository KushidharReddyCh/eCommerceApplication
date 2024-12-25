package com.ecommerce.project.payload;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long productId;

    @Size(min = 3, message = "must contain at-least 3 characters")
    private String productName;

    @Size(min = 6, message = "must contain at-least 6 characters")
    private String description;
    private String image;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;
}
