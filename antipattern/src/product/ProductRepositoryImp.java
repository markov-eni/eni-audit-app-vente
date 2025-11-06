import java.util.List;

public class ProductRepositoryImp implements ProductRepository {
    public List<Product> products = new ArrayList<>();

    public Product findById(int id) {
        return products.get(id);
    }

    public List<Product> findAll() {
        return products;
    }
}
