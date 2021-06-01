package persons.clients;

import persons.clients.Client;

import java.time.LocalDate;

public class Order {
    private static int localID = 1;

    private int id;
    private Client client;
    private Cart cart;
    private LocalDate date;

    public Order() {
        this.id = localID;
        localID += 1;
    }

    public Order(Client client, Cart cart) {
        this.id = localID;
        localID += 1;

        this.client = client;
        this.cart = cart;
    }

    //region GET/SET

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //endregion

    @Override
    public String toString() {
        return "ORDER: #" + this.id +
                "\nClient: " + this.client.getId() + this.client.getName() +
                "\nCart: " + this.cart +
                "\nDate: " + this.date +
                "\n----------------------------------------" +
                "\nTOTAL  =  " + this.cart.calculateTotal() + "$";
    }
}
