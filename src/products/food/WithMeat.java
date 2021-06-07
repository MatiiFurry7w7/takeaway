package products.food;

public class WithMeat extends Food {
    private typeMeat meatType;

    public WithMeat(){};
    public WithMeat (String name, float price, String desc, int numberPeopleRecommended, typeMeat meatType){
        super.setName(name);
        super.setPrice(price);
        super.setDescription(desc);
        super.setNumberPeopleRecommended(numberPeopleRecommended);

        this.meatType = meatType;

    };
    public String toString: String();

    //region GET/SET
    public typeMeat getMeatType() {
        return meatType;
    }

    public void setMeatType(typeMeat meatType) {
        this.meatType = meatType;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }

    //endregion

    @Override
    public String toString (){
        return "Name: " + super.getName() +
                "\n Price: " + super.getPrice() +
                "\n Desc: " + super.getDescription() +
                "\n Number People Recommended: " + super.getNumberPeopleRecommended() +
                "\n Meat Type: " + super.getClass();
    };
}
