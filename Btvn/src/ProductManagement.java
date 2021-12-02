public class ProductManagement  {
    public String id;
    public String name;
    public String describe;
    public int quantity;
    public double price;
    public String type;

    public ProductManagement(String id, String name, String describe, int quantity, double price, String type) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "id= " + id + "\n" +
                "name= " + name + "\n" +
                "describe= " + describe + "\n" +
                "quantity= " + quantity + "\n" +
                "price= " + price + " Nghìn đồng" + "\n" +
                "type= " + type + "\n" ;
    }
}
