package org.producos.spring.java.productos2826502.repositories;

import java.util.List;
import org.producos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository

public class ProductRepository {
    //La lista del repositorio debe ser imuntable
    //la logica de negocio no modifica
    List<Product> productos =List.of(
        Product.builder()
                .id(1L)
                .nombre("Silla")
                .precio(3000.0000)
                .build()//LOMBOOCK
                ,
        new Product(2L, "Comedor", 40000.00000)
        );

    //metodos:(comportamiento)consultar todos los productos en el repository
    //metodo que la retora
    public List<Product> findAll(){
        return this.productos;
    }
}
