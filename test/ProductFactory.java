public class ProductFactory extends ProductAbstractFactory {
    @Override
    public Product createProduct(String productType) {
        if (productType.equalsIgnoreCase("phone")){
            Product p1 = new Phone();
            p1.setPrice(1539.00);
            return p1;
        }else if (productType.equalsIgnoreCase("laptop")){
            Product p2 = new Laptop();
            p2.setPrice(2999.00);
            return p2;
        }
        return null;
        
    }
    
}
