public class Laptop implements Product{

    private double _price;

    @Override
    public String productName() {
        return "MacBook Pro 16\" | Space Grey | 2.6GHz 6-Core Processor 512 GB Storage AMD Radeon Pro 5300M";
    }

    @Override
    public Boolean setPrice(double price) {
        _price = price;
        return true;
    }
    
}
