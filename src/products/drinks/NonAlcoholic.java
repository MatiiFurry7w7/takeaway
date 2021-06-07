package products.drinks;


public class NonAlcoholic extends Drink {

    private typeNonAlcoholic type;

    public NonAlcoholic (){

    };

    public NonAlcoholic (String brand, int stock, float price, float size, String bottling, boolean fizz, String flavor, typeNonAlcoholic type){

        super.setBrand(brand);
        super.setStock(stock);
        super.setPrice(price);
        super.setSize(size);
        super.setBottling(bottling);
        super.setFizz(fizz);
        super.setFlavor(flavor);

        this.type = type;
    };

    //region GET/SET

    public typeNonAlcoholic getType() {
        return type;
    }

    public void setType(typeNonAlcoholic type) {
        this.type = type;
    }

    //endregion

    @Override
    public String toString(){
        return "Brand: " + super.getBrand() +
                "\nStock: " + super.getStock() +
                "\nPrice: " + super.getPrice() +
                "\nSize: " + super.getSize() +
                "\nBottling: " + super.getBottling() +
                "\nFizz: " + super.isFizz() +
                "\nFlavor: " + super.getFlavor() +
                "\nType: " + this.getType();
    };
}
