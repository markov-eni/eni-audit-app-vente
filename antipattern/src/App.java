import product.controller.ProductController;

public class App {
    public static void main(String[] args) throws Exception {
        ProductController productController = new ProductController();
        System.out.println(productController.findAllProducts());
    }
}
