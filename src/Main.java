import com.google.gson.Gson;
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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Test date for tests
        LocalDate testDate = LocalDate.parse("20/03/2001", DateTimeFormatter.ofPattern("d/MM/yyyy"));
        TakeAway elCirculo = new TakeAway();

        //region Hardcode-Added new Products to the TakeAway
        /*
        elCirculo.addDrinkToStore(new Alcoholic("Brahma", 2, 90f, 1.5f, "Bottle", true, "Beer", typeAlcoholic.Beer, 4.5f));
        elCirculo.addDrinkToStore(new NonAlcoholic("Pepsi", 4, 70f, 1.5f, "Bottle", true, "Cola", typeNonAlcoholic.Soda));
        elCirculo.addFoodtoStore(new WithMeat("Cheeseburger", 640f, "A burger with cheddar cheese", 2, typeMeat.Beef));
        elCirculo.addFoodtoStore(new WithoutMeat("Fried Noodles", 400f, "Fried noodles with vegetables", 1, "Rice Noodles"));
        */
        //endregion

        //region Hardcode-Added new Persons the TakeAway
        /*
        //Hardcoded Clients
        elCirculo.addPersonToStore(new Client("Matias Mercado", "123", "mati@gmail.com", "Alberdi 7777"));
        elCirculo.addPersonToStore(new Client("Tobias Lima", "2231111111", "tobu@gmail.com", "Alberdi 7777"));
        elCirculo.addPersonToStore(new Client("Olaf Gonzales", "2233333333", "olaf@gmail.com", "Medano 0"));

        //Hardcoded Employees
        elCirculo.addPersonToStore(new Employee("Gabriel Seballos", "2236666666", "gabriel@gmail.com", "San Martin 1412", typeEmployeeArea.Delivery));
        elCirculo.addPersonToStore(new Employee("Cris Hernandez", "2234444444", "cris@gmail.com", "Uruguay 2567", typeEmployeeArea.Kitchen));
        elCirculo.addPersonToStore(new Employee("Ulices Lopez", "2237777777", "ulices@outlook.com", "Yrigoyen 5672", typeEmployeeArea.Inventory));
        elCirculo.addPersonToStore(new Employee("Martin Vasquez", "2239999999", "martin@hotmail.com", "Mitre 3421", typeEmployeeArea.Manager));
        elCirculo.addPersonToStore(new Employee("Marco Martinez", "2235555555", "marco@gmail.com", "Jujuy 2098", typeEmployeeArea.Call_operator));
        */
        //endregion

        //region WORKING! Make Methods

        //region (WORKING!) Adding Person/s to the TakeAway using "Make" Methods
        /*
        elCirculo.makeClient();
        elCirculo.makeEmployee();

        elCirculo.displayAllClients();
        elCirculo.displayAllEmployees();
        */
        //endregion

        //region (WORKING!) Adding Food/s to the TakeAway using "Make" Methods
        /*
        elCirculo.makeFoodWithMeat();
        elCirculo.makeFoodWithoutMeat();

        elCirculo.displayAllFood();
        */
        //endregion

        //region (WORKING!) Adding Drink/s to the TakeAway using "Make" Methods
        /*
        elCirculo.makeNonAlcoholic();
        elCirculo.makeAlcoholic();

        elCirculo.displayAllDrinks();
        */
        //endregion

        //region (WORKING!) Add Order to the TakeAway using "Make" Methods
        /*
        elCirculo.makeOrder();

        elCirculo.displayAllOrders();
        */
        //endregion

        //endregion

        //region Files management
        /*
        elCirculo.saveProductsData();
        elCirculo.loadProductsData();

        elCirculo.displayAllFood();
        elCirculo.displayAllDrinks();
        */
        //endregion

    }
}
