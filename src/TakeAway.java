import persons.Person;
import persons.clients.Client;
import persons.clients.Order;
import persons.employees.Employee;
import persons.employees.typeEmployeeArea;
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
        aux.setEmail(scanner.next());
        scanner.reset();

        System.out.println("Input address: ");
        aux.setAddress(scanner.next());
        scanner.reset();

        for (Person eachClient : persons) {
            if(eachClient.equals(aux)){
                System.out.println("\nThat client is already signed!");
                aux = null;
            }
        }
        return aux;
    }

    public Employee makeEmployee(){
        Employee aux = new Employee();

        System.out.println("Input name: ");
        aux.setName(scanner.nextLine());
        scanner.reset();

        System.out.println("Input phone: ");
        aux.setPhone(scanner.next());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input email: ");
        aux.setEmail(scanner.nextLine());
        scanner.reset();

        System.out.println("Input address: ");
        aux.setAddress(scanner.nextLine());
        scanner.reset();

        System.out.println("Input employee area:  1. Delivery2. Inventory3. Kitchen4. Manager5. Call Operator");
        scanner.reset();
        int a;
        do {
            a= scanner.nextInt();
            switch(a) {
                case 1:
                    aux.setArea(typeEmployeeArea.Delivery); break;
                case 2:
                    aux.setArea(typeEmployeeArea.Inventory); break;
                case 3:
                    aux.setArea(typeEmployeeArea.Kitchen); break;
                case 4:
                    aux.setArea(typeEmployeeArea.Manager); break;
                case 5:
                    aux.setArea(typeEmployeeArea.Call_operator); break;
                default:
                    System.out.println("Invalid input. Insert a correct input."); break;
            }
        }while (a<1 || a>5);

        for (Person eachEmployee : persons) {
            if(eachEmployee.equals(aux)){
                System.out.println("\nThat employee is already signed!");
                aux = null;
            }
        }
     return aux;
    }
}
