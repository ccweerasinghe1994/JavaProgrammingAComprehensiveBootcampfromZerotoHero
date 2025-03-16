package interview;

public class main {
    public static void main(String[] args) {

//        Item item1 = new Item(12.3, "item1");
//        Item item2 = new Item(1.3, "item2");
//
//        List<Item> items = new ArrayList<>();
//        items.add(item1);
//        items.add(item2);
//
//        Customer customer = new Customer("abc");
//
//        Invoice invoice = new Invoice(items, customer);
//
//        PrintInvoice printInvoice = new PrintInvoice();
//        printInvoice.printInvoice(invoice);
//    }
        PriceCalculator priceCalculator = new PriceCalculator(new SeasonalDiscount());

        double v = priceCalculator.calculatePrice(1200);
        System.out.println(v);
    }
}
