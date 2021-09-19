public class Phone implements Product{
    // System.out.println("IPhone 13 Pro | Graphite | 256 GB Storage");
    // System.out.println("Price : 1,539.00");

    // System.out.println("MacBook Pro 16\" | Space Grey | 2.6GHz 6-Core Processor 512 GB Storage AMD Radeon Pro 5300M");
    // System.out.println("Price : 2,999.00");

    // System.out.println("iPad Air | Space Grey | 256 GB Storage Wifi No Engraving");
    // System.out.println("Price : $979.00");

    private double _price;

    @Override
    public String productName() {
        return "IPhone 13 Pro | Graphite | 256 GB Storage";
    }

    @Override
    public Boolean setPrice(double price) {
        _price = price;
        return true;
    }
    
}
