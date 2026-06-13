import java.util.HashMap;
class Product {
    int productId;
    String productName;
    int quantity;
    double price;
    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void display() {
        System.out.println(productId + " " + productName + " " + quantity + " " + price);
    }
}
public class InventoryManagementSystem {
    HashMap<Integer, Product> inventory = new HashMap<>();
    void addProduct(Product product) {
        inventory.put(product.productId, product);
    }
    void updateProduct(int productId, int quantity) {
        if (inventory.containsKey(productId)) {
            inventory.get(productId).quantity = quantity;
        }
    }
    void deleteProduct(int productId) {
        inventory.remove(productId);
    }
    void displayProducts() {
        for (Product product : inventory.values()) {
            product.display();
        }
    }
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addProduct(new Product(101, "Laptop", 10, 50000));
        ims.addProduct(new Product(102, "Mouse", 20, 500));
        ims.addProduct(new Product(103, "Keyboard", 15, 1200));
        System.out.println("Inventory Details");
        ims.displayProducts();
        ims.updateProduct(102, 25);
        System.out.println("\nAfter Update");
        ims.displayProducts();
        ims.deleteProduct(103);
        System.out.println("\nAfter Deletion");
        ims.displayProducts();
    }
}
