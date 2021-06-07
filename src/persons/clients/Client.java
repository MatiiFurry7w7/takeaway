package persons.clients;

import persons.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client extends Person {

    private static int localID = 0;
    private int id;
    private boolean premium;
    private int ordersAmount;
    private List<Order> orders = new ArrayList();

    public Client() {
        super.setActive(true);
        super.setRegisteredDate(LocalDate.now());
        newID();
    }

    public Client(String name, String phone, String email, String address) {
        newID();
        super.setActive(true);
        super.setRegisteredDate(LocalDate.now());

        super.setName(name);
        super.setPhone(phone);
        super.setEmail(email);
        super.setAddress(address);
        this.premium = false;
    }

    //region GET/SET

    public int getId() {
        return id;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    //endregion

    @Override
    public void newID() {
        this.id = localID + 1000;
        localID += 1;
    }

    @Override
    public String toString() {
        return
                "ID: " + id +
                        "\nName: " + super.getName() +
                        "\nPhone: " + super.getPhone() +
                        "\nE-mail: " + super.getEmail() +
                        "\nAddress: " + super.getAddress() +
                        "\nRegistered date: " + super.getRegisteredDate() +
                        "\nPremium: " + premium +
                        "\nOrders amount: " + ordersAmount;
    }
}
