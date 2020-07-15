package com.virtusa.gstbill.services;

import com.virtusa.gstbill.models.Product;
import com.virtusa.gstbill.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){ this.productRepository=productRepository; }

    public int addProduct(Product product){
        Product resopnse =productRepository.saveAndFlush(product);
        return 1;
    }

    public List<Product> getALlProducts(){
        return productRepository.findAll();
    }

    public int updateProduct(Product product){
        productRepository.updateProduct(product.getProduct_code(),product.getProduct_name(),product.getProduct_price(),product.getProduct_gst(),product.getProduct_id());

        return 1;
    }
}
