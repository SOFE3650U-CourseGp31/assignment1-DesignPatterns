public class ProductFactory extends ProductAbstractFactory {
    @Override
    Product createProduct() {
        Product product1 = new Phone();
        product1.productName();
        return product1;
    }
    
}
