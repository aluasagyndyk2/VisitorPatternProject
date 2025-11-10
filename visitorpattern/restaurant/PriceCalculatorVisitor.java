package visitorpattern.restaurant;

// Visitor to calculate total price of food items
public class PriceCalculatorVisitor implements FoodVisitor {
    private double totalPrice = 0;

    // Getter for total price
    public double getTotalPrice() {
        return totalPrice;
    }

    // Visit method for Pizza
    @Override
    public void visit(Pizza pizza) {
        totalPrice += pizza.getPrice();
    }

    // Visit method for Burger
    @Override
    public void visit(Burger burger) {
        totalPrice += burger.getPrice();
    }

    // Visit method for Salad
    @Override
    public void visit(Salad salad) {
        totalPrice += salad.getPrice();
    }
}
