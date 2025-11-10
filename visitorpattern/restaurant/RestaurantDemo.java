package visitorpattern.restaurant;

// Demo class to run the restaurant example
public class RestaurantDemo {
    public static void main(String[] args) {
        // Create food items with price and calories
        FoodItem pizza = new Pizza(2500, 800);
        FoodItem burger = new Burger(1500, 500);
        FoodItem salad = new Salad(1500, 400);

        // Store them in an array representing the menu
        FoodItem[] menu = { pizza, burger, salad };

        // Create visitors for price and calorie calculation
        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        CalorieCalculatorVisitor calorieVisitor = new CalorieCalculatorVisitor();

        // Let each visitor process all items
        for (FoodItem item : menu) {
            item.accept(priceVisitor);
            item.accept(calorieVisitor);
        }

        // Output total price and total calories
        System.out.println("Total price: " + priceVisitor.getTotalPrice() + " ₸");
        System.out.println("Total calories: " + calorieVisitor.getTotalCalories() + " kcal");
    }
}
