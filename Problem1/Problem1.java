import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter stock quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        Product p = new Product(id, name, price, quantity);
        p.applyDiscount(discount);
        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());
        scanner.close();
    }
}