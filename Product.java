// Product.java
public class Product {
    String id;
    String name;
    double price;
    int stock;
    
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public void display() {
        System.out.println(id + " | " + name + " | ₹" + price + " | Stock: " + stock);
    }
}