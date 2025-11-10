package visitorpattern.restaurant;

public class RestaurantDemo {
    public static void main(String[] args) {
        FoodItem pizza = new Pizza(2500, 800);
        FoodItem burger = new Burger(1500, 500);
        FoodItem salad = new Salad(1500, 400);

        FoodItem[] menu = { pizza, burger, salad };

        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        CalorieCalculatorVisitor calorieVisitor = new CalorieCalculatorVisitor();

        for (FoodItem item : menu) {
            item.accept(priceVisitor);
            item.accept(calorieVisitor);
        }

        System.out.println("Total price: " + priceVisitor.getTotalPrice() + " ₸");
        System.out.println("Total calories: " + calorieVisitor.getTotalCalories() + " kcal");
    }
}