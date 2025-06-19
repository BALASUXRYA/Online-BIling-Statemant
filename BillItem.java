// BillItem.java
public class BillItem {
    Product product;
    int quantity;
    double total;
    
    public BillItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.total = product.price * quantity;
    }
    
    public void display() {
        System.out.println(product.name + " | Qty: " + quantity + 
                         " | Price: ₹" + product.price + " | Total: ₹" + total);
    }
}
