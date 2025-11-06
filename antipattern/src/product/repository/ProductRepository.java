package product.repository;

import java.util.List;

import product.model.Product;

public interface ProductRepository {
    public Product findById(int id);
    public List<Product> findAll();
}
