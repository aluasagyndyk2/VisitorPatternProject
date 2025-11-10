package visitorpattern.restaurant;

public class Salad implements FoodItem {
    private double price;
    private int calories;

    public Salad(double price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visit(this);
    }
}