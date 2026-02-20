import java.util.Scanner;

public class Bonus14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i + 1));
            
            System.out.print("Part number: ");
            String partNumber = sc.nextLine();
            
            System.out.print("Part description: ");
            String partDescription = sc.nextLine();
            
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            
            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline
            
            // Create and store the Invoice object
            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }
        
        // Optional: Display all invoices
        System.out.println("\nAll Invoices:");
        for (Invoice inv : invoices) {
            System.out.println(inv); // assuming Invoice has a proper toString() method
        }
        
        sc.close();
    }
}