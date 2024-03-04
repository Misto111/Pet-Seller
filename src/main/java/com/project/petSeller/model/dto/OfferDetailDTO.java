package com.project.petSeller.model.dto;

import com.project.petSeller.model.enums.ColorEnum;
import com.project.petSeller.model.enums.GenderEnum;

import java.math.BigDecimal;

public record OfferDetailDTO(
    String id,
    String kind,
    String breed,
    int years,
    Double weight,
    BigDecimal price,
    ColorEnum color,
    GenderEnum gender,
    String imageUrl,
    String seller,
    boolean viewerIsOwner
) {

        public String summary() {
            return kind + " " + breed + " " + years;
        }
    }

