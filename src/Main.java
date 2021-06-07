import persons.clients.Cart;

import persons.clients.Client;
import persons.clients.Order;
import persons.employees.Employee;
import persons.employees.typeEmployeeArea;
import products.drinks.Alcoholic;
import products.drinks.Drink;
import products.drinks.typeAlcoholic;
import products.food.Food;
import products.food.WithMeat;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Client mati = new Client("Matias", "2238746316", "mati@gmail.com", "Alberdi 7777", false);

    Cart matiCart = new Cart();

    Alcoholic brahma = new Alcoholic("Brahma", 2, 90f, 1.5f, "Bottle", true, "Beer", typeAlcoholic.Beer, 4.5f);
    Alcoholic chardonnay = new Alcoholic("Chardonnay", 1, 190f, 0.75f, "Bottle", false, "Red fruits", typeAlcoholic.Wine, 12f);

    matiCart.addToCart(brahma, 1);
    matiCart.addToCart(chardonnay ,2);

    Order matiOrder = new Order(mati, matiCart);

    System.out.println(matiOrder);

    //EMPLOYEE
        Employee mati2 = new Employee("Matias", "2236453172", "matii2@gmail.com", "Alborti 1412", typeEmployeeArea.Inventory);

        System.out.println(mati2);
    }
}
