// SupermarketApp.java
import java.util.Scanner;

public class SupermarketApp {
    Shop shop = new Shop();
    Scanner sc = new Scanner(System.in);
    
    public void start() {
        while (true) {
            System.out.println("\n1. Show Products");
            System.out.println("2. Create Bill");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            if (choice == 1) {
                shop.showProducts();
            } else if (choice == 2) {
                createBill();
            } else if (choice == 3) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Wrong choice!");
            }
        }
    }
    
    public void createBill() {
        System.out.print("Customer name: ");
        String name = sc.nextLine();
        
        Bill bill = new Bill(name);
        
        while (true) {
            System.out.print("Product ID (or 'done' to finish): ");
            String id = sc.nextLine();
            
            if (id.equals("done")) {
                break;
            }
            
            Product product = shop.findProduct(id);
            if (product == null) {
                System.out.println("Product not found!");
                continue;
            }
            
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            
            if (shop.sellProduct(id, qty)) {
                BillItem item = new BillItem(product, qty);
                bill.addItem(item);
                System.out.println("Added to bill!");
            } else {
                System.out.println("Not enough stock!");
            }
        }
        
        bill.printBill();
    }
}