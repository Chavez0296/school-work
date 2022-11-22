public class Cart {
    private int numberOfProducts;
    private float total;

    public void addProduct(){

        numberOfProducts++;
    }

    public void addTotal(float price){
        total += price;

    }

    public String getNumberOfProducts() {
        return String.valueOf(this.numberOfProducts);
    }

    public String getTotal() {
        return String.valueOf(this.total);
    }
}
