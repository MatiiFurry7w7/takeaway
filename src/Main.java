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


        //TakeAway Declaration
        TakeAway elCirculo = new TakeAway();

        //region TESTS!

        //Test date for tests
        LocalDate testDate = LocalDate.parse("20/03/2001", DateTimeFormatter.ofPattern("d/MM/yyyy"));

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
        //Products files
        elCirculo.saveProductsData();
        elCirculo.loadProductsData();

        elCirculo.displayAllFood();
        elCirculo.displayAllDrinks();

        //Persons files
        elCirculo.savePersonsData();
        elCirculo.loadPersonsData();

        elCirculo.displayAllClients();
        elCirculo.displayAllEmployees();
        */
        //endregion

        //endregion

        //region         < -- MAIN PROGRAM MENU -- >

        //Load data from disk
        elCirculo.loadProductsData();
        elCirculo.loadPersonsData();

        System.out.println("---------------------------------------------------------------------------\n");

        Scanner option = new Scanner(System.in);
        int op = 0;
        int subOp = 0;

        while(op != 9) {
            op = 0;
            menu();                //MAIN MENU

            op = option.nextInt();
            option.reset(); option.nextLine();

            switch (op) {
                case 1:                   //CLIENTS SUBMENU
                    subOp = 0;

                    while (subOp != 9){
                        subOp = 0;
                        clientSubMenu();

                        subOp = option.nextInt();
                        option.reset();

                        cls();
                        switch (subOp) {
                            case 1:
                                elCirculo.makeClient();
                                option.reset();
                                break;
                            case 2:
                                System.out.println("Input the Client´s phone to search for it: ");
                                Client aux = elCirculo.searchClientByPhone(option.next());
                                if(aux != null){
                                    System.out.println(aux);
                                }
                                pressEnterKeyToContinue();
                                option.reset(); option.nextLine();
                                break;
                            case 3:
                                elCirculo.displayAllClients();
                                pressEnterKeyToContinue();

                                break;
                            case 4:


                                break;
                            case 5:
                                String stringOption;
                                elCirculo.displayAllClients();
                                System.out.println("\nInput Client phone to edit status: ");
                                stringOption = option.next();
                                option.reset();

                                Client auxC = elCirculo.searchClientByPhone(stringOption);

                                if(auxC != null){
                                    System.out.println("\nActive status: " + auxC.isActive() + "\nSet status to 1:active | 2:inactive  | Other:keep original");

                                    subOp = option.nextInt();
                                    option.reset();

                                    if(subOp == 1){
                                        auxC.setActive(true);
                                        System.out.println("\nThe client is now Active!");
                                    }
                                    if(subOp == 2){
                                        auxC.setActive(false);
                                        System.out.println("\nThe client is now Inactive");
                                    }

                                }
                                pressEnterKeyToContinue();
                                break;

                        }
                        option.reset(); option.nextLine();
                        cls();
                    }
                    break;
                case 2:                   //EMPLOYEES SUBMENU
                    subOp = 0;

                    while (subOp != 9){
                        subOp = 0;
                        employeeSubMenu();

                        subOp = option.nextInt();
                        option.reset();

                        cls();
                        switch (subOp) {
                            case 1:
                                elCirculo.makeEmployee();
                                break;
                            case 2:
                                System.out.println("Input the Employee´s phone to search for it: ");
                                Employee aux = elCirculo.searchEmployeeByPhone(option.next());
                                if(aux != null){
                                    System.out.println(aux);
                                }
                                pressEnterKeyToContinue();
                                break;
                            case 3:
                                elCirculo.displayAllEmployees();
                                pressEnterKeyToContinue();
                                break;
                            case 4:


                                break;
                            case 5:
                                String stringOption;
                                elCirculo.displayAllEmployees();
                                System.out.println("\nInput Employee phone to edit status: ");
                                stringOption = option.next();
                                option.reset();

                                Employee auxE = elCirculo.searchEmployeeByPhone(stringOption);

                                if(auxE != null){
                                    System.out.println("\nActive status: " + auxE.isActive() + "\nSet status to 1:active | 2:inactive  | Other:keep original");

                                    subOp = option.nextInt();
                                    option.reset();

                                    if(subOp == 1){
                                        auxE.setActive(true);
                                        System.out.println("\nThe Employee is now Active!");
                                    }
                                    if(subOp == 2){
                                        auxE.setActive(false);
                                        System.out.println("\nThe Employee is now Inactive");
                                    }

                                }
                                pressEnterKeyToContinue();

                                break;
                        }
                        option.reset(); option.nextLine();
                        cls();
                    }
                    break;
                case 3:                   //PRODUCTS SUBMENU
                    subOp = 0;

                    while (subOp != 9){
                        subOp = 0;
                        productsSubMenu();

                        subOp = option.nextInt();
                        option.reset();

                        cls();
                        switch (subOp) {
                            case 1:
                                subOp = 0;

                                while (subOp != 9){
                                    subOp = 0;
                                    drinksSubMenu();

                                    subOp = option.nextInt();
                                    option.reset();

                                    cls();
                                    switch (subOp) {
                                        case 1:
                                            System.out.println("1: Alcoholic | 2: Non Alcohol | Other: Cancel");
                                            subOp = option.nextInt();
                                            option.reset();
                                            cls();

                                            if(subOp == 1){
                                                elCirculo.makeAlcoholic();
                                            }
                                            if(subOp == 2){
                                                elCirculo.makeNonAlcoholic();
                                            }
                                            option.reset();
                                            break;
                                        case 2:
                                            System.out.println("Input the ID to search the Drink: ");
                                            subOp = option.nextInt();
                                            option.reset();

                                            Drink aux = elCirculo.searchDrinkbyID(subOp);

                                            if(aux != null){
                                                System.out.println(aux);
                                            }

                                            pressEnterKeyToContinue();
                                            break;
                                        case 3:
                                            elCirculo.displayAllDrinks();
                                            pressEnterKeyToContinue();
                                            break;
                                        case 4:


                                            break;
                                        case 5:
                                            elCirculo.displayAllDrinks();
                                            System.out.println("\nInput Drink ID to add Stock: ");
                                            subOp = option.nextInt();
                                            option.reset();

                                            Drink auxC = elCirculo.searchDrinkbyID(subOp);

                                            if(auxC != null){
                                                System.out.println("\nIn Stock: " + auxC.getStock() + "\nHow many units you want to add to this Drink?");

                                                subOp = option.nextInt();
                                                option.reset();

                                                auxC.setStock(auxC.getStock() + subOp);
                                                System.out.println("\nStock Added!\nIn Stock: " + auxC.getStock());
                                            }
                                            pressEnterKeyToContinue();
                                            break;
                                    }
                                    option.reset();
                                    cls();
                                }
                                break;
                            case 2:
                                subOp = 0;

                                while (subOp != 9){
                                    subOp = 0;
                                    foodSubMenu();

                                    subOp = option.nextInt();
                                    option.reset();

                                    cls();
                                    switch (subOp) {
                                        case 1:
                                            System.out.println("1: With Meat | 2: Without Meat | Other: Cancel");
                                            subOp = option.nextInt();
                                            option.reset();
                                            cls();

                                            if(subOp == 1){
                                                elCirculo.makeFoodWithMeat();
                                            }
                                            if(subOp == 2){
                                                elCirculo.makeFoodWithoutMeat();
                                            }
                                            option.reset();
                                            break;
                                        case 2:
                                            System.out.println("Input the ID to search the Food: ");
                                            subOp = option.nextInt();
                                            option.reset();

                                            Food aux = elCirculo.searchFoodbyID(subOp);

                                            if(aux != null){
                                                System.out.println(aux);
                                            }

                                            pressEnterKeyToContinue();
                                            break;
                                        case 3:
                                            elCirculo.displayAllFood();
                                            pressEnterKeyToContinue();
                                            break;
                                        case 4:


                                            break;
                                    }
                                    option.reset();
                                    cls();
                                }
                                break;
                        }
                        option.reset();
                        cls();
                    }
                    break;
                case 4:                   //ORDERS SUBMENU
                    subOp = 0;

                    while (subOp != 9){
                        subOp = 0;
                        ordersSubMenu();

                        subOp = option.nextInt();
                        option.reset();

                        cls();
                        switch (subOp) {
                            case 1:
                                elCirculo.makeOrder();
                                option.reset();
                                break;
                            case 2:
                                System.out.println("Input the Order ID to search for it: ");
                                Order aux = elCirculo.searchOrderbyOrderID(option.nextInt());

                                if(aux != null){
                                    System.out.println(aux);
                                }

                                pressEnterKeyToContinue();
                                option.reset(); option.nextLine();
                                break;
                            case 3:
                                subOp = 0;

                                while (subOp != 9){
                                    subOp = 0;
                                    displayOrdersSubMenu();

                                    subOp = option.nextInt();
                                    option.reset();

                                    cls();
                                    switch (subOp) {
                                        case 1:
                                            elCirculo.displayAllOrders();
                                            pressEnterKeyToContinue();
                                            break;
                                        case 2:
                                            elCirculo.displayAllClients();
                                            System.out.println("\nInput the Client´s phone to search for it: ");
                                            Client auxC = elCirculo.searchClientByPhone(option.next());
                                            option.reset();

                                            if(auxC != null){
                                                elCirculo.displayAllOrders(auxC);
                                            }

                                            pressEnterKeyToContinue();
                                            break;
                                        case 3:
                                            elCirculo.displayTodayOrders();
                                            pressEnterKeyToContinue();
                                            break;
                                    }
                                    option.reset();
                                    cls();
                                }
                                break;
                        }
                        option.reset();
                        cls();
                    }
                    break;
            }
            option.reset();
            cls();
        }
        elCirculo.saveProductsData();
        elCirculo.savePersonsData();

        System.out.println("\n\n\n\t\t\t\t< -- See you later, Have a great day! :) -- >\n\n\n" +
                           "----------------------------------------------------------------------------------");
        //endregion

    }

    //region Menu
    public static void menu(){
        System.out.println("\nWelcome to the TakeAway System!" +
                "\n\n1_ Clients management" +
                "\n2_ Employees management" +
                "\n3_ Products management" +
                "\n4_ Orders management" +
                "\n\n9_ Exit Program");
    }

    public static void clientSubMenu(){
        cls();
        System.out.println(
                "\nClients management" +
                "\n\n1_ New Client" +
                "\n2_ Search Client" +
                "\n3_ Display Clients" +
                "\n4_ Edit Client Data ()" +
                "\n5_ Edit Client Status" +
                "\n\n9_ Go Back");

    }

    public static void employeeSubMenu(){
        cls();
        System.out.println(
                "\nEmployees management" +
                        "\n\n1_ New Employee" +
                        "\n2_ Search Employee" +
                        "\n3_ Display Employee" +
                        "\n4_ Edit Employee Data ()" +
                        "\n5_ Edit Employee Status" +
                        "\n\n9_ Go Back");

    }

    public static void productsSubMenu(){
        cls();
        System.out.println(
                "\nProducts management" +
                        "\n\n1_ Drinks" +
                        "\n2_ Food" +
                        "\n\n9_ Go Back");

    }

    public static void drinksSubMenu(){
        cls();
        System.out.println(
                "\nDrinks" +
                        "\n\n1_ New Drink" +
                        "\n2_ Search Drink" +
                        "\n3_ Display Drinks" +
                        "\n4_ Edit Drink Data" +
                        "\n5_ Add more stock" +
                        "\n\n9_ Go Back");
    }

    public static void foodSubMenu(){
        cls();
        System.out.println(
                "\nFood" +
                        "\n\n1_ New Food" +
                        "\n2_ Search Food" +
                        "\n3_ Display Food" +
                        "\n4_ Edit Food Data" +
                        "\n\n9_ Go Back");
    }

    public static void ordersSubMenu(){
        cls();
        System.out.println(
                "\nOrders" +
                        "\n\n1_ New Order" +
                        "\n2_ Search Order" +
                        "\n3_ Display Orders" +
                        "\n\n9_ Go Back");
    }

    public static void displayOrdersSubMenu(){
        cls();
        System.out.println(
                "\nDisplay Orders" +
                        "\n\n1_ Display All" +
                        "\n2_ Display by Client" +
                        "\n3_ Display today Orders" +
                        "\n\n9_ Go Back");
    }

    private static void pressEnterKeyToContinue(){
        System.out.println("\nPress Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
    //endregion

    public static void cls()
    {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

}
