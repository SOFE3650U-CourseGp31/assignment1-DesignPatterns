public class ProductFactory extends ProductAbstractFactory {
    @Override
    protected Product createProduct() {
        Product product1 = new Phone();
        product1.setPrice(1539.00);
        return product1;
    }
    
}
