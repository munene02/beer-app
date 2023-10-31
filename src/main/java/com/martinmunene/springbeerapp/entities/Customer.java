package com.martinmunene.springbeerapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Martin Munene
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length=36, columnDefinition = "varchar", updatable =false, nullable = false)
    private UUID id;

    @NotNull
    @NotBlank
    private String name;

    @Version
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
