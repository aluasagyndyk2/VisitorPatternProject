package visitorpattern.restaurant;

public class Burger implements FoodItem {
    private double price;
    private int calories;

    public Burger(double price, int calories) {
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