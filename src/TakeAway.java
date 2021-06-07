import persons.Person;
import persons.clients.Cart;
import persons.clients.Client;
import persons.clients.Order;
import persons.employees.Employee;
import persons.employees.typeEmployeeArea;
import products.drinks.*;
import products.food.Food;
import products.food.WithMeat;
import products.food.WithoutMeat;
import products.food.typeMeat;

import java.time.LocalDate;
import java.util.*;

public class TakeAway {
    static Scanner scanner = new Scanner(System.in);
    private List<Person> persons = new ArrayList<>();
    private List<Food> foods = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public TakeAway() {
    }

    public TakeAway(List<Person> persons, List<Food> foods, List<Drink> drinks, List<Order> orders) {
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

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
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
    public Client makeClient() {
        Client aux = new Client();

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

        for (Person eachClient : persons) {
            if (eachClient.equals(aux)) {
                System.out.println("\nThat client is already signed!");
                aux = null;
            }
        }
        return aux;
    }

    public Employee makeEmployee() {
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
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    aux.setArea(typeEmployeeArea.Delivery);
                    break;
                case 2:
                    aux.setArea(typeEmployeeArea.Inventory);
                    break;
                case 3:
                    aux.setArea(typeEmployeeArea.Kitchen);
                    break;
                case 4:
                    aux.setArea(typeEmployeeArea.Manager);
                    break;
                case 5:
                    aux.setArea(typeEmployeeArea.Call_operator);
                    break;
                default:
                    System.out.println("Invalid input. Insert a correct input.");
                    break;
            }
        } while (a < 1 || a > 5);

        for (Person eachEmployee : persons) {
            if (eachEmployee.equals(aux)) {
                System.out.println("\nThat employee is already signed!");
                aux = null;
            }
        }
        return aux;
    }

    public WithMeat makeFoodWithMeat() {
        WithMeat aux = new WithMeat();

        System.out.println("Input name: ");
        aux.setName(scanner.nextLine());
        scanner.reset();

        System.out.println("Input price: ");
        aux.setPrice(scanner.nextFloat());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input description: ");
        aux.setDescription(scanner.nextLine());
        scanner.reset();

        System.out.println("Input number of people recomended: ");
        aux.setNumberPeopleRecommended(scanner.nextInt());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input type meat:  1.None \n2.Beef \n3.Fish \n4.Pork \n5.Chicken");
        scanner.reset();
        int a;
        do {
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    aux.setMeatType(typeMeat.None);
                    break;
                case 2:
                    aux.setMeatType(typeMeat.Beef);
                    break;
                case 3:
                    aux.setMeatType(typeMeat.Fish);
                    break;
                case 4:
                    aux.setMeatType(typeMeat.Pork);
                    break;
                case 5:
                    aux.setMeatType(typeMeat.Chicken);
                    break;
                default:
                    System.out.println("Invalid input. Insert a correct input.");
                    break;
            }
        } while (a < 1 || a > 5);

        return aux;
    }

    /*falta clase WithoutMeat para hacer la clase*/

    public Alcoholic makeAlcoholic() {
        Alcoholic aux = new Alcoholic();

        System.out.println("Input brand: ");
        aux.setBrand(scanner.nextLine());
        scanner.reset();

        System.out.println("Input stock: ");
        aux.setStock(scanner.nextInt());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input price: ");
        aux.setPrice(scanner.nextFloat());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input size: ");
        aux.setSize(scanner.nextFloat());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input bottling: ");
        aux.setBottling(scanner.nextLine());
        scanner.reset();

        System.out.println("Input fizz: 1.True \n 2.False");
        scanner.reset();
        int optionFizz;
        do {
            optionFizz = scanner.nextInt();
            switch (optionFizz) {
                case 1:
                    aux.setFizz(true);
                    break;
                case 2:
                    aux.setFizz(false);
                    break;

                default:
                    System.out.println("Invalid input. Insert a correct input.");
                    break;
            }
        } while (optionFizz < 1 || optionFizz > 2);

        System.out.println("Input flavor: ");
        aux.setFlavor(scanner.nextLine());
        scanner.reset();

        System.out.println("Input type alcoholic: 1.Beer \n2.Wine \n3.Champagne \n4.Liqueur");
        scanner.reset();
        int typeAlcoholic;
        do {
            typeAlcoholic = scanner.nextInt();
            switch (typeAlcoholic) {
                case 1:
                    aux.setType(products.drinks.typeAlcoholic.Beer);
                    break;
                case 2:
                    aux.setType(products.drinks.typeAlcoholic.Wine);
                    break;
                case 3:
                    aux.setType(products.drinks.typeAlcoholic.Champagne);
                    break;
                case 4:
                    aux.setType(products.drinks.typeAlcoholic.Liqueur);
                    break;
                default:
                    System.out.println("Invalid input. Insert a correct input.");
                    break;
            }
        } while (typeAlcoholic < 1 || typeAlcoholic > 4);

        System.out.println("Input the alcoholic strength: ");
        aux.setAlcoholicStrength(scanner.nextFloat());
        scanner.reset();

        for (Drink eachDrink : drinks) {
            if (eachDrink.equals(aux)) {
                System.out.println("\nThat drink is already added!");
                aux = null;
            }
        }
        return aux;
    }

    public NonAlcoholic makeNonAlcoholic() {
        NonAlcoholic aux = new NonAlcoholic();

        System.out.println("Input brand: ");
        aux.setBrand(scanner.nextLine());
        scanner.reset();

        System.out.println("Input stock: ");
        aux.setStock(scanner.nextInt());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input price: ");
        aux.setPrice(scanner.nextFloat());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input size: ");
        aux.setSize(scanner.nextFloat());
        scanner.nextLine();
        scanner.reset();

        System.out.println("Input bottling: ");
        aux.setBottling(scanner.nextLine());
        scanner.reset();

        System.out.println("Input fizz: 1.True \n 2.False");
        scanner.reset();
        int optionFizz;
        do {
            optionFizz = scanner.nextInt();
            switch (optionFizz) {
                case 1:
                    aux.setFizz(true);
                    break;
                case 2:
                    aux.setFizz(false);
                    break;

                default:
                    System.out.println("Invalid input. Insert a correct input.");
                    break;
            }
        } while (optionFizz < 1 || optionFizz > 2);

        System.out.println("Input flavor: ");
        aux.setFlavor(scanner.nextLine());
        scanner.reset();

        System.out.println("Input type alcoholic: 1.Water \n2.Juice \n3.Soda \n4.Flavored Water");
        scanner.reset();
        int typeAlcoholic;
        do {
            typeAlcoholic = scanner.nextInt();
            switch (typeAlcoholic) {
                case 1:
                    aux.setType(typeNonAlcoholic.Water);
                    break;
                case 2:
                    aux.setType(typeNonAlcoholic.Juice);
                    break;
                case 3:
                    aux.setType(typeNonAlcoholic.Soda);
                    break;
                case 4:
                    aux.setType(typeNonAlcoholic.Flavored_Water);
                    break;
                default:
                    System.out.println("Invalid input. Insert a correct input.");
                    break;
            }
        } while (typeAlcoholic < 1 || typeAlcoholic > 4);

        for (Drink eachDrink : drinks) {
            if (eachDrink.equals(aux)) {
                System.out.println("\nThat drink is already added!");
                aux = null;
            }
        }
        return aux;
    }

    public Order makeOrder(Client client, Cart cart) {
        Order aux = new Order();
        aux.setClient(client);
        aux.setCart(cart);
        aux.setDate(LocalDate.now());

        return aux;
    }

    public void addPersonToStore(Person person) {
        if (person != null) {
            persons.add(person);
        }
    }

    public void addFoodtoStore(Food food) {
        if (food != null) {
            foods.add(food);
        }
    }

    public void addDrinkToStore(Drink drink) {
        if (drink != null) {
            drinks.add(drink);
        }
    }

    public void addOrderToStore(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public Person searchPersonByPhone(String phone){
        for (Person eachPerson : persons) {
            if (eachPerson.getPhone() == phone) {
                return eachPerson;
            }
        }
        System.out.println("Client not found");
        return null;
    }

    public Food searchFoodbyName(String name){
        for (Food eachFood : foods){
            if(eachFood.getName() == name){
                return eachFood;
            }
        }
        System.out.println("Food not found");
        return null;
    }

    public Drink searchDrinkbyName(String brand){
        for (Drink eachDrink : drinks){
            if(eachDrink.getBrand() == brand){
                return eachDrink;
            }
        }
        System.out.println("Drink not found");
        return null;
    }

    public Order searchOrderbyName(Client client){
        for (Order eachOrder : orders){
            if(eachOrder.getClient() == client){
                return eachOrder;
            }
        }
        System.out.println("Orders not found");
        return null;
    }

    public void displayAllClients(){
        for (Person eachPerson : persons){
            if(eachPerson instanceof Client){
                System.out.println((Client)eachPerson);
            }
        }
    }

    public void displayAllEmployees(){
        for(Person eachPerson : persons){
            if(eachPerson instanceof Employee){
                System.out.println((Employee)eachPerson);
            }
        }
    }

    public void displayAllFood(){
        for(Food eachFood : foods){
            if(eachFood instanceof Food){
                System.out.println(eachFood);
            }
        }
    }

    public void displayAllDrinks(){
        for(Drink eachDrink : drinks){
            if(eachDrink instanceof Drink){
                System.out.println(eachDrink);
            }
        }
    }

    public void displayTodayOrders(){
        int count = 0;
        for(Order eachOrder : orders){
            if(eachOrder.getDate() == LocalDate.now()){
                System.out.println("\n"+eachOrder);
                count++;
            }
        }
        if(count==0){
            System.out.println("There were no orders today!");
        }
    }

/*
    Comparator<Drink> compareByTimeOrdered = new Comparator<Drink>() {
        @Override
        public int compare(Drink o1, Drink o2) {
            return o1.getStock().compareTo(o2.getStock());
        }
    };*/
}

