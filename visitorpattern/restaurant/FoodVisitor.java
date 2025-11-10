package visitorpattern.restaurant;

// Visitor interface defining operations for all food types
public interface FoodVisitor {
    void visit(Pizza pizza);   // Operation for Pizza
    void visit(Burger burger); // Operation for Burger
    void visit(Salad salad);   // Operation for Salad
}
