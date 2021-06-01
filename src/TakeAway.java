import persons.Person;
import persons.clients.Client;
import persons.clients.Order;
import products.drinks.Drink;
import products.food.Food;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TakeAway {
    static Scanner scanner = new Scanner(System.in);
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
    //endregion+

    ///
    public Client makeClient(){
        Client aux = new Client();

        System.out.println("Input name: ");
        aux.setName(scanner.next());
        scanner.reset();

        System.out.println("Input phone: ");
        aux.setPhone(scanner.next());
        scanner.reset();

        System.out.println("Input email: ");
        aux.setPhone(scanner.next());
        scanner.reset();

        System.out.println("Input address: ");
        aux.setAddress(scanner.next());
        scanner.reset();

        System.out.println("Is a premium client?");
        aux.setPremium(scanner.nextBoolean());
        scanner.reset();

        for (Person eachClient : persons) {
            if(((Client) eachClient).getEmail() == aux.getEmail() && ((Client)eachClient).getPhone() == aux.getPhone()){
                System.out.println("\nThat client is already signed!");
                aux = null;
            }
        }
        return aux;
    }


}
