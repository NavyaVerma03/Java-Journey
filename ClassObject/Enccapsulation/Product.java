// Create a Product class using encapsulation with private variables, getter and setter methods, and implement addStock() and buyProduct() methods to display the remaining stock and total bill.
package ClassObject.Enccapsulation;
import java.util.Scanner;

class ProductData {

    // Private data members
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Add Stock
    public void addStock(int stock) {
        quantity = quantity + stock;
    }

    // Buy Product
    public void buyProduct(int buyQty) {
        if (buyQty <= quantity) {
            double bill = buyQty * price;
            quantity = quantity - buyQty;

            System.out.println("Purchase Successful");
            System.out.println("Total Bill: " + bill);
        } else {
            System.out.println("Insufficient Stock");
        }
    }
}

public class Product {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductData p = new ProductData();

        System.out.print("Enter Product ID: ");
        p.setProductId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        p.setProductName(sc.nextLine());

        System.out.print("Enter Product Price: ");
        p.setPrice(sc.nextDouble());

        System.out.print("Enter Available Quantity: ");
        p.setQuantity(sc.nextInt());

        System.out.print("Enter Stock to Add: ");
        int stock = sc.nextInt();
        p.addStock(stock);

        System.out.print("Enter Quantity to Buy: ");
        int buy = sc.nextInt();
        p.buyProduct(buy);

        System.out.println("\nProduct Details");
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Remaining Stock: " + p.getQuantity());

        sc.close();
    }
}

