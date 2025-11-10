package visitorpattern.restaurant;

// Interface for all food items
public interface FoodItem {
    // Accept method to allow a visitor to process the item
    void accept(FoodVisitor visitor);
}
