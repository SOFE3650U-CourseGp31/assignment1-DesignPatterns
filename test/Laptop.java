public class Laptop implements Product{
    private double _price;

    @Override
    public String getName() {
        return "MacBook Pro 16\" | Space Grey | 2.6GHz 6-Core Processor, 512 GB Storage, AMD Radeon Pro 5300M \nPrice: $" + _price + "CAD";
    }

    @Override
    public Boolean setPrice(double price) {
        _price = price;
        return true;
    }
    
}
