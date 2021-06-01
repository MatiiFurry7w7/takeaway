import persons.Person;
import persons.clients.Order;
import products.drinks.Drink;
import products.food.Food;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TakeAway {
    private List<Person> persons = new ArrayList<>();
    private HashMap<Integer, Food> foods = new HashMap<>();
    private HashMap<Integer, Drink> drinks = new HashMap<>();
    private List<Order> orders = new ArrayList<>();

    public TakeAway() {
    }
    
    public TakeAway(List<Person> persons, HashMap<Integer, Food> foods, HashMap<Integer, Drink> drinks, List<Order> orders) {
        this.persons = persons;
        this.foods = foods;
        this.drinks = drinks;
        this.orders = orders;
    }
    //region GET/SET
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public HashMap<Integer, Food> getFoods() {
        return foods;
    }

    public void setFoods(HashMap<Integer, Food> foods) {
        this.foods = foods;
    }

    public HashMap<Integer, Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(HashMap<Integer, Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    //endregion

}
