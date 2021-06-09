package products.food;

import products.Product;

public abstract class Food extends Product {

    private String name;
    private float price;
    private String description;
    private int numberPeopleRecommended;


    //region GET/SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberPeopleRecommended() {
        return numberPeopleRecommended;
    }

    public void setNumberPeopleRecommended(int numberPeopleRecommended) {
        this.numberPeopleRecommended = numberPeopleRecommended;
    }

    //endregion

    @Override
    public String toString (){
        return "\nID: #" + super.getProductID() +
                "\nName: " + this.name +
                "\nPrice: $" + this.price +
                "\nDescription: " + this.description +
                "\nThis dish is recommended for: " + this.numberPeopleRecommended + " people";
    };
}
