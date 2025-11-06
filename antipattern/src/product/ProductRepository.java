package product;

import java.util.List;

public interface ProductRepository {
    public Product findById(int id);
    public List<Product> findAll();
}
