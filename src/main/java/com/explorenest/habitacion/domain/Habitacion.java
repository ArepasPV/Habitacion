package com.explorenest.habitacion.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Habitacion {
    @Id
    private Integer id;
    private Integer capacity, hotel, type;
    private Double price;
    private boolean available;

}
