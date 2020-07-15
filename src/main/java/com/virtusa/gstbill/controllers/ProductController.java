package com.virtusa.gstbill.controllers;

import com.virtusa.gstbill.models.Product;
import com.virtusa.gstbill.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){this.productService=productService;}

    @PostMapping
    public void addProduct(@RequestBody Product product){productService.addProduct(product);}

    @GetMapping
    public List<Product> getAllProducts(){return productService.getALlProducts();}

    @PutMapping void updateProduct(@RequestBody Product product){productService.updateProduct(product);}
}
