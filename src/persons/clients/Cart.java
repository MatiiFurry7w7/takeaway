package persons.clients;

import products.drinks.Alcoholic;
import products.drinks.Drink;
import products.drinks.NonAlcoholic;
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

    //region GET/SET

    public List<Drink> getDrinkCart() {
        return drinkCart;
    }

    public void setDrinkCart(List<Drink> drinkCart) {
        this.drinkCart = drinkCart;
    }

    public List<Integer> getDrinkAmount() {
        return drinkAmount;
    }

    public void setDrinkAmount(List<Integer> drinkAmount) {
        this.drinkAmount = drinkAmount;
    }

    public List<Food> getFoodCart() {
        return foodCart;
    }

    public void setFoodCart(List<Food> foodCart) {
        this.foodCart = foodCart;
    }

    public List<Integer> getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(List<Integer> foodAmount) {
        this.foodAmount = foodAmount;
    }

    //endregion

    public void addToCart(Object o){
        if(o instanceof Alcoholic || o instanceof NonAlcoholic)
        drinkCart.add((Drink) o);
        else{
            foodCart.add((Food) o);
        }
    }

    public void addAmountOfCurrentDrink(int amount){
        drinkAmount.add(amount);
    }

    public void addAmountOfCurrentFood(int amount){
        foodAmount.add(amount);
    }

    public float calculateTotal(){
        float total = 0;

        for (Integer i=0; i < drinkCart.size(); i++) {
            total = drinkCart.get(i).getPrice() * drinkAmount.get(i);
        }

        return total;
    }

    @Override
    public String toString() {
        return  "\nDrink: " + drinkCart +
                "\nAmount of: " + drinkAmount +
                "\n\nFood: " + foodCart +
                "\nAmount of: " + foodAmount +
                "\n-------------------" +
                "\nTOTAL: " + calculateTotal() + "$";
    }
}
