package product.controller;

import java.util.List;

import product.model.Product;
import product.repository.ProductRepositoryImp;
import product.service.ProductService;

public class ProductController {
    private ProductService productService = new ProductService(new ProductRepositoryImp());

    public List<Product> findAllProducts() {
        return productService.findAll();            
    }; 
}   
