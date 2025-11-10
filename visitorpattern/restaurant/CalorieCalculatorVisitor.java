package visitorpattern.restaurant;

public class CalorieCalculatorVisitor implements FoodVisitor {
    private int totalCalories = 0;

    public int getTotalCalories() {
        return totalCalories;
    }

    @Override
    public void visit(Pizza pizza) {
        totalCalories += pizza.getCalories();
    }

    @Override
    public void visit(Burger burger) {
        totalCalories += burger.getCalories();
    }

    @Override
    public void visit(Salad salad) {
        totalCalories += salad.getCalories();
    }
}