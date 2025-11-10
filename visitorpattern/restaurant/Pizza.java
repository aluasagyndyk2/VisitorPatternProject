package visitorpattern.restaurant;

// Pizza class implementing FoodItem
public class Pizza implements FoodItem {
    private double price;
    private int calories;

    // Constructor to initialize price and calories
    public Pizza(double price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for calories
    public int getCalories() {
        return calories;
    }

    // Accept method to allow visitor to process this item
    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visit(this);
    }
}
