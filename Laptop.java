public class Laptop implements Product{

    @Override
    public String productName() {
        return "MacBook Pro 16\" | Space Grey | 2.6GHz 6-Core Processor 512 GB Storage AMD Radeon Pro 5300M";
    }

    @Override
    public Double setPrice(double price) {
        return 2999.00;
    }
    
}
