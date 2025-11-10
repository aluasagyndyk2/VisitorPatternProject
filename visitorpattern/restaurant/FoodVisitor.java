package visitorpattern.restaurant;

public interface FoodVisitor {
    void visit(Pizza pizza);
    void visit(Burger burger);
    void visit(Salad salad);
}