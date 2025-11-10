package visitorpattern.restaurant;

// Visitor to calculate total calories of food items
public class CalorieCalculatorVisitor implements FoodVisitor {
    private int totalCalories = 0;

    // Getter for total calories
    public int getTotalCalories() {
        return totalCalories;
    }

    // Visit method for Pizza
    @Override
    public void visit(Pizza pizza) {
        totalCalories += pizza.getCalories();
    }

    // Visit method for Burger
    @Override
    public void visit(Burger burger) {
        totalCalories += burger.getCalories();
    }

    // Visit method for Salad
    @Override
    public void visit(Salad salad) {
        totalCalories += salad.getCalories();
    }
}
