package org.producos.spring.java.productos2826502.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import jakasta.

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name='products')

public class Product { //CRUD

    private Long id;
    private String nombre;
    private Double precio;

}
