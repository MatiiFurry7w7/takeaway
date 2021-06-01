package products.drinks;

public class Alcoholic {

    private typeAlcoholic type;
    private float alcoholicStrength;

    public Alcoholic(){};
    public Alcoholic(String brand, int stock, float price, float size, String bottling, boolean fizz, String flavor, typeAlcoholic type){};

    @Override
    public String toString(){
        return "ID: " + id +
                "\nName: " + super.getName() +
                "\nPhone: " + super.getPhone() +
                "\nE-mail: " + super.getEmail() +
                "\nAddress: " + super.getAddress() +
                "\nRegistered date: " + super.getRegisteredDate() +
                "\nPremium: " + premium +
                "\nOrders amount: " + ordersAmount;
    };


}
