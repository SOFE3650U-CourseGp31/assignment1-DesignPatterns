public class FactoryTestDriver{
    public static void main(String[] args){
        ProductFactory productFactory = new ProductFactory();

        System.out.println("*********************************************************************************************");

        Product p1 = productFactory.createProduct("phone");
        System.out.println(p1.getName());

        System.out.println("*********************************************************************************************");

        Product p2 = productFactory.createProduct("laptop");
        System.out.println(p2.getName());

        System.out.println("*********************************************************************************************");

    }
}