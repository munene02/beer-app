package com.martinmunene.springbeerapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Martin Munene
 */
@Data
@Builder
public class CustomerDTO {
    private UUID id;

    @NotBlank
    @NotNull
    private String name;

    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
