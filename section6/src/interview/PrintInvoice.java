package interview;

public class PrintInvoice {
    // Responsibility 1: Print the invoice
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice for " + invoice.getCustomer().getName());
        for (Item item : invoice.getItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println("Total: " + invoice.calculateTotal());
    }
}
