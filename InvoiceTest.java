import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i + 1));

            System.out.print("Part number: ");
            String number = sc.nextLine();

            System.out.print("Description: ");
            String desc = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine();

            invoices[i] = new Invoice(number, desc, qty, price);
        }

        System.out.println("\nInvoice amounts:");
        for (Invoice inv : invoices) {
            System.out.println(inv.getPartNumber() +
                    " -> " + inv.getInvoiceAmount());
        }

        sc.close();
    }
}
