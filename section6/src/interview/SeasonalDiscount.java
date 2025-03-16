package interview;

public class SeasonalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}
