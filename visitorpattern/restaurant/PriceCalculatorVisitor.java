package visitorpattern.restaurant;

public class PriceCalculatorVisitor implements FoodVisitor {
    private double totalPrice = 0;

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void visit(Pizza pizza) {
        totalPrice += pizza.getPrice();
    }

    @Override
    public void visit(Burger burger) {
        totalPrice += burger.getPrice();
    }

    @Override
    public void visit(Salad salad) {
        totalPrice += salad.getPrice();
    }
}