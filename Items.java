
public class Items {
    private String name;
    private double price;
    private int Quantity;

    public Items(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this .Quantity = Quantity;
    }
public Items(String name, double price){
    this(name, price, 10);
}
public String getName(){
    return name;
}
public double getPrice(){
    return price;
}
public int getQuantity(){
    return Quantity;
}
public void setQuantity(int Quantity){
    this.Quantity = Quantity;
}
}
