package persons.clients;

import products.drinks.Drink;
import products.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Drink> drinkCart = new ArrayList<>();
    private List<Integer> drinkAmount = new ArrayList<>();
    private List<Food> foodCart = new ArrayList<>();
    private List<Integer> foodAmount = new ArrayList<>();

    public Cart() {
    }

    @Override
    public String toString() {
        return  "-------------------------------------" +
                "\nDrink: " + drinkCart +
                "\nAmount of: " + drinkAmount +
                "\n\nFood: " + foodCart +
                "\nAmount of: " + foodAmount;
    }
}
