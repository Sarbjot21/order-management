package org.engineering.productservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}