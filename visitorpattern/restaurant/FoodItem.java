package visitorpattern.restaurant;

public interface FoodItem {
    void accept(FoodVisitor visitor);
}