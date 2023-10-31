package com.martinmunene.springbeerapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Martin Munene
 */

@Builder
@Data
public class BeerDTO {
    private UUID id;
    private Integer version;

    @NotBlank
    @NotNull
    private String beerName;

    @NotNull
    private BeerStyle beerStyle;

    @NotBlank
    @NotNull
    private String upc;
    private Integer quantityOnHand;

    @NotNull
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}

