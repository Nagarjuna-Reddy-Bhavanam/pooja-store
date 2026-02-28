package com.pooja.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;

    @NotBlank(message = "Product name is required")
    private String name;

    private String description;

    @NotNull(message = "Price is required")
    @Positive(message = "Price should be positive")
    private BigDecimal price;

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity should be positive")
    private Integer quantity;

    @NotBlank(message = "Category is required")
    private String category;

    private String imageUrl;

    private Boolean isActive;
}
