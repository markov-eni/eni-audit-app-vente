package product;

import java.util.List;

public class ProductController {
    private ProductService productService = new ProductService(new ProductRepositoryImp());

    public List<Product> showAllProducts() {
        return productService.findAll();            
    }; 
}   
