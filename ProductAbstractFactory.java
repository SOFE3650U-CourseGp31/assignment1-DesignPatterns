public abstract class ProductAbstractFactory {
    protected abstract Product createProduct();

    public Product getProduct(){        //implementation of factory method
        return this.createProduct();
    }
}
