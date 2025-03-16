package interview;

import java.util.List;

public class Invoice {

    private List<Item> items;
    private Customer customer;

    public Invoice(List<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    // Responsibility 1: Calculate total
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<Item> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

}

