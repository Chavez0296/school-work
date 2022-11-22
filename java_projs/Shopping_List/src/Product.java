public class Product {
    private String name;
    private float price;
    private int ageLimit;

    public Product(String name, float price, int ageLimit){
        this.name = name;
        this.price = price;
        this.ageLimit = ageLimit;
    }

    public String getName(){
        return this.name;
    }


    public float getPrice(){
        return this.price;
    }

    public float getAgeLimit(){
        return this.ageLimit;
    }

    public String printInfo(){
        String result =  this.name + " $" + this.price;
        if( this.ageLimit > 0) {
            result += " (age limit " + this.ageLimit + ")";
        }
        return result;
    }
}
