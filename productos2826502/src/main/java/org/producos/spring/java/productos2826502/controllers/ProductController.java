package org.producos.spring.java.productos2826502.controllers;

import java.util.List;

import org.producos.spring.java.productos2826502.entities.Product;
import org.producos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Anotacion ---->Control: que tenga una url donde llegar
----->Endpoint metodo de una clase */

@RequestMapping("/api/products")

public class ProductController {
    //Inyectar el servicio
    private ProductService service = new ProductService();

    //Primer endpoint: un metodo en un controlador 
    @GetMapping("saludo")
    public String saludo(){
        return"|****Hola mi so****|\n buenaaa";
    }

    //Segundo endpoint
    //get: obtener info sin alterarla
    //(imutable)
    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto){
        return"Aqui mostrara el producto cuyo id es:"+ idproducto;
    } 

    @GetMapping
    public List<Product>finAllProducts(){
        //utilizo el servicio
        return service.finAllProducts();
    }
}
