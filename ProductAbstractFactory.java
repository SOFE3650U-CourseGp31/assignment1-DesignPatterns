public abstract class ProductAbstractFactory {
    abstract Product createProduct();

    public Product getProduct(){        //implementation of factory method
        return this.createProduct();
    }
}
