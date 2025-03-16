package interview;

public class BulkDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8;
    }
}
