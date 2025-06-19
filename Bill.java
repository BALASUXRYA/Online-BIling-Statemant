// Bill.java
import java.util.*;

public class Bill {
    List<BillItem> items = new ArrayList<>();
    String customerName;
    double total = 0;
    
    public Bill(String customerName) {
        this.customerName = customerName;
    }
    
    public void addItem(BillItem item) {
        items.add(item);
        total += item.total;
    }
    
    public void printBill() {
        System.out.println("\n========== BILL ==========");
        System.out.println("Customer: " + customerName);
        System.out.println("--------------------------");
        
        for (BillItem item : items) {
            item.display();
        }
        
        System.out.println("--------------------------");
        System.out.println("TOTAL: ₹" + total);
        System.out.println("==========================");
    }
}