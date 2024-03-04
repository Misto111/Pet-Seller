package com.project.petSeller.model.dto;

import java.math.BigDecimal;

public record AccessoryDetailDTO(

        String id,
        String brandAccessory,
        String modelAccessory,
        BigDecimal price,
        String imageUrl
) {

    public String summary() {
        return brandAccessory + ", " + modelAccessory + ", " + price;
    }
}

