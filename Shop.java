// Shop.java
import java.util.*;

public class Shop {
    List<Product> products = new ArrayList<>();
    
    public Shop() {
        // Sample products
        products.add(new Product("P1", "Rice", 80, 50));
        products.add(new Product("P2", "Sugar", 45, 30));
        products.add(new Product("P3", "Tea", 85, 20));
        products.add(new Product("P4", "Milk", 55, 25));
        products.add(new Product("P5", "Bread", 25, 40));
    }
    
    public void showProducts() {
        System.out.println("\n===== PRODUCTS =====");
        for (Product p : products) {
            p.display();
        }
        System.out.println("====================");
    }
    
    public Product findProduct(String id) {
        for (Product p : products) {
            if (p.id.equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean sellProduct(String id, int qty) {
        Product p = findProduct(id);
        if (p != null && p.stock >= qty) {
            p.stock -= qty;
            return true;
        }
        return false;
    }
}