public class Phone implements Product{
    private double _price;

    @Override
    public String getName() {
        return "IPhone 13 Pro | Graphite | 256 GB Storage, 6.1\", Up to 120Hz, A15 Bionic, IP68  \nPrice: $" + _price + "CAD";
    }

    @Override
    public Boolean setPrice(double price) {
        _price = price;
        return true;
    }
    
}
