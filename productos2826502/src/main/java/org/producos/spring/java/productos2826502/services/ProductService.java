package org.producos.spring.java.productos2826502.services;

import java.util.List;

import org.producos.spring.java.productos2826502.entities.Product;
import org.producos.spring.java.productos2826502.repositories.ProductRepository;
import org.springframework.stereotype.Service;


@Service

public class ProductService {
    //inyectar las independecias al repositorio
    private ProductRepository repository = new ProductRepository();

    //operaciones logicas de negocio(casos de uso, historia de ususario, requerimientos funcionales)

    public List<Product> finAllProducts(){
        return repository.findAll();
    }

}
